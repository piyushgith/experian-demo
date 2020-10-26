package com.experian.credit.report.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.experian.credit.report.model.request.ExperianCreditReportRequestDTO;
import com.experian.credit.report.model.response.ExperianCreditReportResponseDTO;
import com.experian.credit.report.oath2.OAuth2Token;
import com.experian.credit.report.oath2.User;
import com.experian.credit.report.service.ExperianCreditReportService;

@RestController
public class ExperianCreditReportController {

	@Autowired
	private ExperianCreditReportService experianCreditReportServiceImpl;

	@GetMapping("/hi")
	public String sayHello() {
		return "Hi There!!";
	}

	@PostMapping("/experian/oauth2")
	public ResponseEntity<OAuth2Token> getAuthenticationToken(@RequestBody User user) {
		return new ResponseEntity<>(experianCreditReportServiceImpl.getOath2Token(user), HttpStatus.OK);
	}

	@PostMapping("/experian/creditreport")
	public ResponseEntity<ExperianCreditReportResponseDTO> getUserCreditReport(@RequestBody ExperianCreditReportRequestDTO experianRequestDTO) {
		return new ResponseEntity<>(experianCreditReportServiceImpl.getCreditReport(experianRequestDTO), HttpStatus.OK);
	}

}
