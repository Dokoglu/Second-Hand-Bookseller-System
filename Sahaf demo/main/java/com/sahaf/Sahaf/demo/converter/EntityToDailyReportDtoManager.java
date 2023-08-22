package com.sahaf.Sahaf.demo.converter;

import org.springframework.stereotype.Service;

import com.sahaf.Sahaf.demo.model.DailyReport;

@Service
public class EntityToDailyReportDtoManager implements EntityToDailyReportDtoService {

	@Override
	public DailyReportDto convert(DailyReport source) {
		// TODO Auto-generated method stub
		DailyReportDto dailyReportDto=new DailyReportDto();
		dailyReportDto.setReportDate(source.getReportDate());
		return dailyReportDto;
	}

}
