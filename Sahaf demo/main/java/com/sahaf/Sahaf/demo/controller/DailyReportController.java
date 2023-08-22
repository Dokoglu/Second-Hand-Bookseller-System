package com.sahaf.Sahaf.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sahaf.Sahaf.demo.dto.CreateDailyReportRequest;
import com.sahaf.Sahaf.demo.model.DailyReport;
import com.sahaf.Sahaf.demo.service.DailyReportService;

@RestController
@RequestMapping("/dailyReport")
public class DailyReportController {

	private final DailyReportService dailyReportService;

	public DailyReportController(DailyReportService dailyReportService) {
		this.dailyReportService = dailyReportService;
	}
	
	@PostMapping("/addDailyReport")
	public ResponseEntity<String> generateDailyReport(CreateDailyReportRequest createDailyReportRequest){
		
		DailyReport dailyReport=new DailyReport();
		dailyReport=dailyReportService.convertDailyReportDtoToDailyReport(createDailyReportRequest);
		
		return ResponseEntity.status(HttpStatus.CREATED).body("DailyReport added successfully");
	}
}
