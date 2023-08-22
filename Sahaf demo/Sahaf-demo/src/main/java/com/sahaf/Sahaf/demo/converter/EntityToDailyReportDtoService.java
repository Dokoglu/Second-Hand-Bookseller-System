package com.sahaf.Sahaf.demo.converter;

import org.springframework.core.convert.converter.Converter;

import com.sahaf.Sahaf.demo.model.DailyReport;

public interface EntityToDailyReportDtoService extends Converter<DailyReport,DailyReportDto>{

}
