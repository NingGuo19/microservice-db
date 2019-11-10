package com.stock.microservices.dbservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;
//mport org.springframework.data.jpa.repository.Modifying;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;

import com.stock.microservices.dbservice.model.Ticker;

public interface TickerRepository extends JpaRepository<Ticker, Integer>{

    /*@Modifying(clearAutomatically = true)
    @Query("UPDATE TICKERS t SET t.ticker_name = :tickerName WHERE t.id = :id")
    int updateTickerName(@Param("id") int id, @Param("tickerName") String tickerName);*/
    
}