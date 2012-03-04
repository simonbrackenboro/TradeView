package com.company.client;

import java.io.Serializable;
import java.util.Date;

public class Trade implements Serializable {

    private String tradeName;
    private double im;
    private Date date = new Date();
    
    public Trade() {
    }

    public Trade(String tradeName, double im) {
        this.tradeName = tradeName;
        this.im = im;
    }
    
    public String getTradeName() {
        return tradeName;
    }

    public double getIm() {
        return im;
    }

    public Date getDate() {
        return date;
    }
}
