package com.sahaf.Sahaf.demo.service;

import com.sahaf.Sahaf.demo.converter.DailyReportDto;
import com.sahaf.Sahaf.demo.dto.CreateDailyReportRequest;
import com.sahaf.Sahaf.demo.model.DailyReport;

public interface DailyReportService {
	
	void generateDailyReport(CreateDailyReportRequest createDailyReportRequest);
	
	DailyReportDto convertDailyReportToDailyReportDto(DailyReport dailyReport);
	DailyReport convertDailyReportDtoToDailyReport(CreateDailyReportRequest dailyReportRequest);

}
