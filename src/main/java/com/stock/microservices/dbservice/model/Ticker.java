package com.stock.microservices.dbservice.model;

//import static javax.persistence.GenerationType.AUTO;
import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Tickers")
public class Ticker {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name="ID", updatable = false, nullable = false)
    private int id;

    @Column(name="ticker_name")
    private String tickerName;

    protected Ticker(){}

    public Ticker(String tickerName){
        this.tickerName = tickerName;
    }

    public int getId() {
        return id;
    }

    public String getTickerName() {
        return tickerName;
    }

    public void setTickerName(String tickerName) {
        this.tickerName = tickerName;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString(){
        return String.format("Ticker[id=%d, tickerName'%s']", id, tickerName);
    }


}