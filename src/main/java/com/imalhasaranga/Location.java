package com.imalhasaranga;

import org.apache.commons.codec.digest.DigestUtils;

import java.security.MessageDigest;

/**
 * Created by imal365 on 2/25/17.
 */
public class Location {

    private String id;
    private String countryName;
    private String countryAlpha2;
    private String state;
    private String locationName;

    public Location(){

    }

    public Location(String countryname, String countryAlpha2, String state){
            this.id = id;
            this.countryName = countryname;
            this.countryAlpha2 = countryAlpha2;
            this.state = state;
            this.locationName = this.countryName+", "+this.state;
            this.id = DigestUtils.md5Hex(this.countryAlpha2+this.state);
    }

    public String getId() {
        return id;
    }

    public String getCountryName() {
        return countryName;
    }

    public String getCountryAlpha2() {
        return countryAlpha2;
    }

    public String getState() {
        return state;
    }

    public String getLocationName() {
        return locationName;
    }
}
