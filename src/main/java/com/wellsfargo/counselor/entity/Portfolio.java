package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioId;

    @Column(nullable = false)
    private long clientIdId;

    @Column(nullable = false)
    private String creationDate;

    Portfolio(long portfolioIdId, long clientIdId, String creationDate){

        this.portfolioId = portfolioIdId;
        this.clientIdId = clientIdId;
        this.creationDate = creationDate;

    }

    public long getPortfoloId() {return portfolioId;}
    public long getClientIdId() {return clientIdId;}
    public String getCreationDate() {return creationDate;}

    public void setClientIdId(long clientIdId) {this.clientIdId = clientIdId;}
    public void setCreationDate(String creationDate) {this.creationDate = creationDate;}




}
