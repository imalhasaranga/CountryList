# CountryList

Utility Maven Library for Getting the com.imalhasaranga.Countries and Corresponding States
 
###install 

````xml
<repositories>
    <repository>
        <snapshots>
            <enabled>false</enabled>
        </snapshots>
        <id>bintray-imalhasaranga365-CountryList</id>
        <name>bintray</name>
        <url>http://imalhasaranga365.bintray.com/CountryList</url>
    </repository>
</repositories>
````
````xml
 <dependency>
     <groupId>com.imalhasaranga</groupId>
     <artifactId>country-list</artifactId>
     <version>1.1.1</version>
 </dependency>
 
````

###Use

````

  Countries countries = Countries.getInstance();
        //All com.imalhasaranga.Countries
  List<Country> countryList =  countries.getCountryList();
        //Single com.imalhasaranga.Country by Alpha 2 code
  Country country = countries.getCountryByAlpha2Code("US");
        //com.imalhasaranga.State info
  List<State> countryStates = country.getStates();


````