package com.sahaf.Sahaf.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sahaf.Sahaf.demo.model.DailyReport;

@Repository
public interface DailyReportRepository extends JpaRepository<DailyReport,Integer>{

}
