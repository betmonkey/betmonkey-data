package com.betmonkey.domain;


public class Session {
    private String token;
    private String product;
    private String status;
    private String error;

    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getProduct() {
        return this.product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getStatus() {
        return this.status;
    }

    public void setSession(String status) {
        this.status = status;
    }

    public String toString() {
        return "Session{token='" + this.token + '\'' + ", product='" + this.product + '\'' + ", status='" + this.status + '\'' + ", error='" + this.error + '\'' + '}';
    }

    public String getError() {
        return this.error;
    }

    public void setError(String error) {
        this.error = error;
    }
}