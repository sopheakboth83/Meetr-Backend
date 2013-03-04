package com.goldengekko.meetr.service.sugarcrm;

/**
 * Contains a list of name and values returned from SugarCRM.
 * @author mattiaslevin
 *
 */

public class SugarCRMNameValueListResponse {

    private SugarCRMNameValueResponse id;

    private SugarCRMNameValueResponse first_name;

    private SugarCRMNameValueResponse last_name;

    private SugarCRMNameValueResponse email;

    private SugarCRMNameValueResponse phone_work;

    private SugarCRMNameValueResponse primary_address_street;

    private SugarCRMNameValueResponse primary_address_city;

    private SugarCRMNameValueResponse primary_address_country;

    private SugarCRMNameValueResponse primary_address_postalcode;


    // Setters and getters
    public SugarCRMNameValueResponse getId() {
        return id;
    }

    public void setId(SugarCRMNameValueResponse id) {
        this.id = id;
    }

    public SugarCRMNameValueResponse getFirst_name() {
        return first_name;
    }

    public void setFirst_name(SugarCRMNameValueResponse first_name) {
        this.first_name = first_name;
    }

    public SugarCRMNameValueResponse getLast_name() {
        return last_name;
    }

    public void setLast_name(SugarCRMNameValueResponse last_name) {
        this.last_name = last_name;
    }

    public SugarCRMNameValueResponse getEmail() {
        return email;
    }

    public void setEmail(SugarCRMNameValueResponse email) {
        this.email = email;
    }

    public SugarCRMNameValueResponse getPhone_work() {
        return phone_work;
    }

    public void setPhone_work(SugarCRMNameValueResponse phone_work) {
        this.phone_work = phone_work;
    }

    public SugarCRMNameValueResponse getPrimary_address_street() {
        return primary_address_street;
    }

    public void setPrimary_address_street(SugarCRMNameValueResponse primary_address_street) {
        this.primary_address_street = primary_address_street;
    }

    public SugarCRMNameValueResponse getPrimary_address_city() {
        return primary_address_city;
    }

    public void setPrimary_address_city(SugarCRMNameValueResponse primary_address_city) {
        this.primary_address_city = primary_address_city;
    }

    public SugarCRMNameValueResponse getPrimary_address_country() {
        return primary_address_country;
    }

    public void setPrimary_address_country(SugarCRMNameValueResponse primary_address_country) {
        this.primary_address_country = primary_address_country;
    }

    public SugarCRMNameValueResponse getPrimary_address_postalcode() {
        return primary_address_postalcode;
    }

    public void setPrimary_address_postalcode(SugarCRMNameValueResponse primary_address_postalcode) {
        this.primary_address_postalcode = primary_address_postalcode;
    }
}
