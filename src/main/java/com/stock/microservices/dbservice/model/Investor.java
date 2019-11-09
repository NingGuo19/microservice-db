package com.stock.microservices.dbservice.model;

import static javax.persistence.GenerationType.AUTO;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Investor")
public class Investor {

    @Id
    @GeneratedValue(strategy = AUTO)
    private Integer investorId;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="career")
    private String career;

    protected Investor(){}

    public Investor( String firstName, String lastName, String career ){
        this.firstName = firstName;
        this.lastName = lastName;
        this.career = career;
    }

    public Integer getInvestorId() {
        return investorId;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setInvestorId(Integer investorId) {
        this.investorId = investorId;
    }

    @Override
    public String toString(){
        return String.format("Investor[id=%d, firstName='%s', lastName='%s', career='%s']", investorId, firstName, lastName, career);
    }


}