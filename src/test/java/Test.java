import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by imal365 on 2/23/17.
 */
public class Test {

    public static void main(String[] args) {
        Countries countryx = Countries.getInstance();
        System.out.println(countryx.getCountryList().size());
        Country country = countryx.getCountryByAlpha2Code("US");
        System.out.println(country.getName());
        System.out.println(Arrays.toString(country.getStates().toArray()));
    }
}
