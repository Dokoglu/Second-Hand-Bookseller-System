package com.sahaf.Sahaf.demo.service;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Service;

import com.sahaf.Sahaf.demo.converter.DailyReportDto;
import com.sahaf.Sahaf.demo.converter.EntityToDailyReportDtoService;
import com.sahaf.Sahaf.demo.dto.CreateDailyReportRequest;
import com.sahaf.Sahaf.demo.model.DailyReport;
import com.sahaf.Sahaf.demo.repository.DailyReportRepository;

@Service
public class DailyReportManager implements DailyReportService {
	
	private final DailyReportRepository reportRepository ;
	private final BorrowedBookService borrowedBookService;
	private final ModelMapper modelMapper;
	private final EntityToDailyReportDtoService entityToDailyReportDtoService;
	

	public DailyReportManager(DailyReportRepository reportRepository,
			BorrowedBookService borrowedBookService,ModelMapper modelMapper,
			EntityToDailyReportDtoService entityToDailyReportDtoService) {
		this.reportRepository = reportRepository;
		this.borrowedBookService=borrowedBookService;
		this.modelMapper=modelMapper;
		this.entityToDailyReportDtoService=entityToDailyReportDtoService;
	}


	@Override
	public void generateDailyReport(CreateDailyReportRequest dailyReportRequest) {
		// TODO Auto-generated method stub
		int numberOfBorrowedBooks=borrowedBookService
				.countBorrowedBooksForDate(dailyReportRequest.getReportDate());
		
		DailyReport dailyReport = new DailyReport();
	    dailyReport.setReportDate(dailyReportRequest.getReportDate());
	    dailyReport.setNumberOfBorrowedBooks(numberOfBorrowedBooks);

	    this.reportRepository.save(dailyReport);
		
		
	}


	@Override
	public DailyReportDto convertDailyReportToDailyReportDto(
			DailyReport dailyReport) {
		// TODO Auto-generated method stub
		 DailyReportDto dailyReportDto=new DailyReportDto();
		 dailyReportDto=entityToDailyReportDtoService.convert(dailyReport);
		 return dailyReportDto;
	}


	@Override
	public DailyReport convertDailyReportDtoToDailyReport(CreateDailyReportRequest dailyReportRequest) {
		// TODO Auto-generated method stub
		modelMapper.getConfiguration()
        .setMatchingStrategy(MatchingStrategies.STANDARD);
		DailyReport dailyReport=new DailyReport();
		dailyReport=modelMapper.map(dailyReportRequest, DailyReport.class);
		return dailyReport;
	}
	
	

	
		
	}


