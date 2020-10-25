package com.experian.credit.report.service;

import com.experian.credit.report.model.request.ExperianCreditReportRequestDTO;
import com.experian.credit.report.model.response.ExperianCreditReportResponseDTO;
import com.experian.credit.report.oath2.User;

public interface ExperianCreditReportService {

	ExperianCreditReportResponseDTO getCreditReport(ExperianCreditReportRequestDTO experianRequestDTO);

	Object getOath2Token(User user);
}
