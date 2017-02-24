import com.imalhasaranga.Countries;
import com.imalhasaranga.Country;
import com.imalhasaranga.State;

import java.util.List;

/**
 * Created by imal365 on 2/23/17.
 */
public class Test {

    public static void main(String[] args) {
        Countries countries = Countries.getInstance();
        //All Countries
        List<Country> countryList =  countries.getCountryList();
        //Single Country by Alpha 2 code
        Country country = countries.getCountryByAlpha2Code("US");
        //State info
        List<State> countryStates = country.getStates();
        System.out.println(countryStates.size());
    }
}
