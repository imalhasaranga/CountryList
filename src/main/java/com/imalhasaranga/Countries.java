package com.imalhasaranga;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by imal365 on 2/23/17.
 */
public class Countries {

    private List<Country> countryList = null;
    private List<Location> locations = null;

    private final ObjectMapper map = new ObjectMapper();
    private static Countries countries;

    private Countries() {
        try {
            InputStream stream = Countries.class.getResourceAsStream("/countries.json");
            this.countryList = map.readValue(stream, new TypeReference<List<Country>>() {});
            this.locations = new ArrayList<Location>();
            for(Country country : this.countryList){
                for(State state : country.getStates()){
                    Location location = new Location(country.getName(),country.getAlpha2Code(),state.getState());
                    this.locations.add(location);
                }
            }
        } catch (Exception e) {
            //not handled
            System.out.println(e);
        }
    }

    public static Countries getInstance() {
        if (countries == null) {
            countries = new Countries();
        }
        return countries;
    }

    public List<Country> getCountryList() {
        return countryList;
    }

    public List<Location> getLocations() {
        return locations;
    }

    public Country getCountryByAlpha2Code(String alpha2code){
        alpha2code = alpha2code.toUpperCase();
        Country contry = new Country(alpha2code);
        if(this.countryList.contains(contry)){
            return this.countryList.get(this.countryList.indexOf(contry));
        }
        return null;
    }

}
