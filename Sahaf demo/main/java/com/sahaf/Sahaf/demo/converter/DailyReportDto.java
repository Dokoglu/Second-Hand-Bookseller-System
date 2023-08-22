package com.sahaf.Sahaf.demo.converter;

import java.util.Date;

public class DailyReportDto {
	
	private Date reportDate;

	public DailyReportDto(Date reportDate) {
		this.reportDate = reportDate;
	}
	

	public DailyReportDto() {
	}
	
	public Date getReportDate() {
		return reportDate;
	}

	public void setReportDate(Date reportDate) {
		this.reportDate = reportDate;
	}
	

}
