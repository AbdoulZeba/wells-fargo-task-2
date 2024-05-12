package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public class Security {
    @Id
    @GeneratedValue()
    private long securityId;

    @Column(nullable = false)
    private String portfolioId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private double purchasePrice;

    @Column(nullable = false)
    private String purchaseDate;
    @Column(nullable = false)
    private double quantity;

    Security(long securityId, String portfolioId, String name, String category, double purchasePrice, String purchaseDate, double quantity ) {
        this.securityId = securityId;
        this.portfolioId = portfolioId;
        this.name = name;
        this.category = category;
        this.purchasePrice = purchasePrice;
        this.purchaseDate = purchaseDate;
        this.quantity = quantity;

    }
    public long getSecurityId() {return this.securityId;}
    public String getPortfolioId() {return this.portfolioId;}
    public String getName() {return this.name;}
    public String getCategory() { return this.category;}
    public double getPurchasePrice() { return this.purchasePrice;}
    public String getPurchaseDate() { return this.purchaseDate;}
    public double getQuantity() { return this.quantity;}


    public void setPortfolioId(String portfolioId) {this.portfolioId = portfolioId;}
    public void setName(String name) {this.name = name;}
    public void setCategory(String category) {this.category = category;}
    public void setPurchasePrice(double purchasePrice) {this.purchasePrice = purchasePrice;}
    public void setPurchaseDate(String purchaseDate) {this.purchaseDate = purchaseDate;}
    public void setQuantity(double quantity) {this.quantity = quantity;}


}
