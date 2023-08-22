package com.sahaf.Sahaf.demo.dto;

import java.util.Date;

public class CreateDailyReportRequest {
	
	private Date reportDate;

	public CreateDailyReportRequest(Date reportDate) {
		super();
		this.reportDate = reportDate;
	}

	public Date getReportDate() {
		return reportDate;
	}

	public void setReportDate(Date reportDate) {
		this.reportDate = reportDate;
	}
	

}
