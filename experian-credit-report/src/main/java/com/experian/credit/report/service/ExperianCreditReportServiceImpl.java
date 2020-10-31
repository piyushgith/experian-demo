package com.experian.credit.report.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.oauth2.client.OAuth2RestOperations;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestTemplate;

import com.experian.credit.report.model.request.ExperianCreditReportRequestDTO;
import com.experian.credit.report.model.response.ExperianCreditReportResponseDTO;
import com.experian.credit.report.oath2.OAuth2Token;
import com.experian.credit.report.oath2.User;

@Service
public class ExperianCreditReportServiceImpl implements ExperianCreditReportService {

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private OAuth2RestOperations oAuth2RestOperations;

	@Override
	public OAuth2Token getOath2Token(User user) {
		HttpHeaders headers = new HttpHeaders();
		headers.set("client_id", "caDU79XJdVLveGzTA8cdo9ZOlDGFJGsO");
		headers.set("client_secret", "8siWklAMfxxuj3yA");
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<User> entity = new HttpEntity<>(user, headers);
		ResponseEntity<OAuth2Token> responseToken = restTemplate.exchange(
				"https://sandbox-us-api.experian.com/oauth2/v1/token", HttpMethod.POST, entity, OAuth2Token.class);
		return responseToken.getBody();
	}

	@Override
	public ExperianCreditReportResponseDTO getCreditReport(ExperianCreditReportRequestDTO experianRequestDTO) throws Exception {
		ResponseEntity<ExperianCreditReportResponseDTO> responseDTO = null;

		String authToken = "Bearer " + oAuth2RestOperations.getAccessToken();

		HttpHeaders headers = new HttpHeaders();
		headers.set("clientReferenceId", "SBMYSQL");
		headers.set("Authorization", authToken);
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<ExperianCreditReportRequestDTO> entity = new HttpEntity<>(experianRequestDTO, headers);

		try {
			responseDTO = restTemplate.exchange(
					"https://sandbox-us-api.experian.com/consumerservices/credit-profile/v2/credit-report",HttpMethod.POST, entity, ExperianCreditReportResponseDTO.class);
		} catch (HttpStatusCodeException ex) {
			System.err.println("Error Code: " + ex.getResponseBodyAsString());
			throw new Exception(ex.getResponseBodyAsString());
		}
		return responseDTO.getBody();
	}
}
