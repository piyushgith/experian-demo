package com.experian.credit.report.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.client.DefaultOAuth2ClientContext;
import org.springframework.security.oauth2.client.OAuth2ClientContext;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.resource.OAuth2ProtectedResourceDetails;
import org.springframework.security.oauth2.client.token.grant.client.ClientCredentialsResourceDetails;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;
import org.springframework.web.client.RestTemplate;

@Configuration
@EnableOAuth2Client
public class ExperianConfig {

	//@Value("${OAuth2ClientId}")
	private String oAuth2ClientId;

	//@Value("${OAuth2ClientSecret}")
	private String oAuth2ClientSecret;

	//@Value("${Oauth2AccesTokenUri}")
	private String accessTokenUri;

	// @Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

	// @Bean
	public OAuth2RestTemplate oauth2RestTemplate(OAuth2ClientContext oauth2ClientContext,
			OAuth2ProtectedResourceDetails details) {
		return new OAuth2RestTemplate(details, oauth2ClientContext);
	}

	@Bean
	public RestTemplate oAuthRestTemplate() {
		ClientCredentialsResourceDetails resourceDetails = new ClientCredentialsResourceDetails();
		resourceDetails.setId("1");
		resourceDetails.setClientId("caDU79XJdVLveGzTA8cdo9ZOlDGFJGsO");
		resourceDetails.setClientSecret("8siWklAMfxxuj3yA");
		resourceDetails.setAccessTokenUri("https://sandbox-us-api.experian.com/oauth2/v1/token");

		OAuth2RestTemplate restTemplate = new OAuth2RestTemplate(resourceDetails, new DefaultOAuth2ClientContext());
		return restTemplate;
	}
}