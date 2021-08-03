package com.coffeesoft.mono.sdk.open.service.dto;

public class Currency {
    private String currencyCodeA;
    private String currencyCodeB;
    private Long date;
    private Float rateSell;
    private Float rateBuy;
    private Float rateCross;

    public String getCurrencyCodeA() {
        return currencyCodeA;
    }

    public void setCurrencyCodeA(String currencyCodeA) {
        this.currencyCodeA = currencyCodeA;
    }

    public String getCurrencyCodeB() {
        return currencyCodeB;
    }

    public void setCurrencyCodeB(String currencyCodeB) {
        this.currencyCodeB = currencyCodeB;
    }

    public Long getDate() {
        return date;
    }

    public void setDate(Long date) {
        this.date = date;
    }

    public Float getRateSell() {
        return rateSell;
    }

    public void setRateSell(Float rateSell) {
        this.rateSell = rateSell;
    }

    public Float getRateBuy() {
        return rateBuy;
    }

    public void setRateBuy(Float rateBuy) {
        this.rateBuy = rateBuy;
    }

    public Float getRateCross() {
        return rateCross;
    }

    public void setRateCross(Float rateCross) {
        this.rateCross = rateCross;
    }

    @Override
    public String toString() {
        return "Currency{" +
                "currencyCodeA='" + currencyCodeA + '\'' +
                ", currencyCodeB='" + currencyCodeB + '\'' +
                ", date=" + date +
                ", rateSell=" + rateSell +
                ", rateBuy=" + rateBuy +
                ", rateCross=" + rateCross +
                '}';
    }
}
