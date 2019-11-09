package com.stock.microservices.dbservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.stock.microservices.dbservice.model.Ticker;

public interface TickerRepository extends JpaRepository<Ticker, Integer>{
    
}