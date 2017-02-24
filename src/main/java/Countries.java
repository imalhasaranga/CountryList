import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.*;

/**
 * Created by imal365 on 2/23/17.
 */
public class Countries {

    private List<Country> countryList = null;
    private final ObjectMapper map = new ObjectMapper();
    private static Countries countries;

    private Countries() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File json = new File(classLoader.getResource("countries.json").getFile());
            this.countryList = map.readValue(json, new TypeReference<List<Country>>() {
            });
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

    public Country getCountryByAlpha2Code(String alpha2code){
        alpha2code = alpha2code.toUpperCase();
        Country contry = new Country(alpha2code);
        if(this.countryList.contains(contry)){
            return this.countryList.get(this.countryList.indexOf(contry));
        }
        return null;
    }

}
