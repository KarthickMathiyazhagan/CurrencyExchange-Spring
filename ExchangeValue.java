package com.microservice.CS;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "exchange_value")
public class ExchangeValue {

    @Id
    @Column(name = "id")
    private long id;

    @Column(name = "currencyfrom")
    private String fromCurrency;

    @Column(name = "currencyto")
    private String toCurrency;

    private BigDecimal conversionMultiple;

    @Column(name = "port")
    private int port;

    public ExchangeValue() {
        // Default constructor for JPA
    }

    public ExchangeValue(long id, String fromCurrency, String toCurrency, BigDecimal conversionMultiple, int port) {
        this.id = id;
        this.fromCurrency = fromCurrency;
        this.toCurrency = toCurrency;
        this.conversionMultiple = conversionMultiple;
        this.port = port;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFromCurrency() {
        return fromCurrency;
    }

    public void setFromCurrency(String fromCurrency) {
        this.fromCurrency = fromCurrency;
    }

    public String getToCurrency() {
        return toCurrency;
    }

    public void setToCurrency(String toCurrency) {
        this.toCurrency = toCurrency;
    }

    public BigDecimal getConversionMultiple() {
        return conversionMultiple;
    }

    public void setConversionMultiple(BigDecimal conversionMultiple) {
        this.conversionMultiple = conversionMultiple;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
