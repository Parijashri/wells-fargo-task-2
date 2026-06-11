package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioId;

    @OneToOne
    private Client client;

    @Column(nullable = false)
    private String creationDate;

    @OneToMany
    private List<Security> securities;

    protected Portfolio() {
    }

    public Portfolio(Client client, String creationDate,
                     List<Security> securities) {
        this.client = client;
        this.creationDate = creationDate;
        this.securities = securities;
    }

    public Long getPortfolioId() {
        return portfolioId;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public List<Security> getSecurities() {
        return securities;
    }

    public void setSecurities(List<Security> securities) {
        this.securities = securities;
    }
}
