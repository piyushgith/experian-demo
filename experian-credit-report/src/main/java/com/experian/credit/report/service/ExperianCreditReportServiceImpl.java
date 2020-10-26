package com.experian.credit.report.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.experian.credit.report.model.request.ExperianCreditReportRequestDTO;
import com.experian.credit.report.model.response.ExperianCreditReportResponseDTO;
import com.experian.credit.report.oath2.OAuth2Token;
import com.experian.credit.report.oath2.User;

@Service
public class ExperianCreditReportServiceImpl implements ExperianCreditReportService {

	@Autowired
	private RestTemplate restTemplate;

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
	public ExperianCreditReportResponseDTO getCreditReport(ExperianCreditReportRequestDTO experianRequestDTO) {
		User user = new User();
		user.setUsername("justin.leibow@gotmail.com"); // fix email id
		user.setPassword("Nexus4Insurance!"); // fix latest password

		OAuth2Token oAuth2Token = getOath2Token(user);
		String authToken = "Bearer " + oAuth2Token.getAccess_token();

		HttpHeaders headers = new HttpHeaders();
		headers.set("clientReferenceId", "SBMYSQL");
		headers.set("Authorization", authToken);
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<ExperianCreditReportRequestDTO> entity = new HttpEntity<>(experianRequestDTO, headers);
		ResponseEntity<ExperianCreditReportResponseDTO> responseDTO = restTemplate.exchange(
				"https://sandbox-us-api.experian.com/consumerservices/credit-profile/v2/credit-report", HttpMethod.POST,
				entity, ExperianCreditReportResponseDTO.class);
		return responseDTO.getBody();
	}
}
