/*
 * INSERT COPYRIGHT HERE
 */

package com.goldengekko.meetr.json;

import com.wadpam.open.json.JBaseObject;

/**
 *
 * @author sosandstrom
 */
public class JAccount extends JBaseObject {
    
    private String name;
    
    private String phone;
    
    private String shippingCity;
    private String shippingCountry;
    private String shippingPostalCode;
    private String shippingState;
    private String shippingStreet;
    
    private String wwwUrl;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getShippingCity() {
        return shippingCity;
    }

    public void setShippingCity(String shippingCity) {
        this.shippingCity = shippingCity;
    }

    public String getShippingCountry() {
        return shippingCountry;
    }

    public void setShippingCountry(String shippingCountry) {
        this.shippingCountry = shippingCountry;
    }

    public String getShippingPostalCode() {
        return shippingPostalCode;
    }

    public void setShippingPostalCode(String shippingPostalCode) {
        this.shippingPostalCode = shippingPostalCode;
    }

    public String getShippingState() {
        return shippingState;
    }

    public void setShippingState(String shippingState) {
        this.shippingState = shippingState;
    }

    public String getShippingStreet() {
        return shippingStreet;
    }

    public void setShippingStreet(String shippingStreet) {
        this.shippingStreet = shippingStreet;
    }

    public String getWwwUrl() {
        return wwwUrl;
    }

    public void setWwwUrl(String wwwUrl) {
        this.wwwUrl = wwwUrl;
    }
    
    
}