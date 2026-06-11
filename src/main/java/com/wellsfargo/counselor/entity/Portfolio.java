package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioId;

    @Column(nullable = false)
    private String createdDate;

    @Column(nullable = false)
    private double portfolioValue;

    protected Portfolio() {
    }

    public Portfolio(String createdDate, double portfolioValue) {
        this.createdDate = createdDate;
        this.portfolioValue = portfolioValue;
    }

    public Long getPortfolioId() {
        return portfolioId;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public double getPortfolioValue() {
        return portfolioValue;
    }

    public void setPortfolioValue(double portfolioValue) {
        this.portfolioValue = portfolioValue;
    }
}
