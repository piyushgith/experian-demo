package com.experian.credit.report.service;

import java.net.URI;
import java.util.Arrays;

import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

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
		HttpEntity<User> entity = new HttpEntity<>(user,headers);
		ResponseEntity<OAuth2Token> responseToken = restTemplate.exchange(
				"https://sandbox-us-api.experian.com/oauth2/v1/token", HttpMethod.POST, entity, OAuth2Token.class);
		return responseToken.getBody();
	}

	public String getOath2Token1(String code) {
		ResponseEntity<String> response = null;
		System.out.println("Authorization Code------" + code);

		RestTemplate restTemplate = new RestTemplate();

		// According OAuth documentation we need to send the client id and secret key in
		// the header for authentication
		String credentials = "javainuse:secret";

		System.out.println("credentials------" + credentials.getBytes());

		String encodedCredentials = new String(Base64.encodeBase64(credentials.getBytes()));

		System.out.println("encodedCredentials" + encodedCredentials);

		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

		headers.add("Authorization", "Basic " + encodedCredentials);

		HttpEntity<String> request = new HttpEntity<String>(headers);
		// RequestEntity<String> request = new RequestEntity<String>("parameters",
		// headers, null, null);

		// headers.add("WWW-Authenticate", "Basic realm=" + getRealmName() + "");

		System.out.println("request===" + request);

		String access_token_url = "http://localhost:8080/oauth/token";
		access_token_url += "?code=" + code;
		access_token_url += "&grant_type=authorization_code";
		// access_token_url += "&redirect_uri=http://localhost:8090/showEmployees";

		UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(access_token_url);
		URI myUri = builder.buildAndExpand().toUri();

		System.out.println("myUri===" + myUri);

		response = restTemplate.exchange(myUri, HttpMethod.POST, request, String.class);

		System.out.println("access_token_url====" + access_token_url);

		System.out.println("response---" + response);
		System.out.println("response header---" + response.getHeaders());
		System.out.println("response response.toString()---" + response.toString());
		System.out.println("Access Token Response ---------" + response.getBody());

		return null;
	}

	@Override
	public ExperianCreditReportResponseDTO getCreditReport(ExperianCreditReportRequestDTO experianRequestDTO) {
		return null;
	}

}
