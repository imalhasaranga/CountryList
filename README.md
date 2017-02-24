# CountryList

Utility Maven Library for Getting the com.imalhasaranga.Countries and Corresponding States
 
###install 

````xml
 <dependency>
    <groupId>com.imalhasaranga</groupId>
    <artifactId>country-list</artifactId>
    <version>1.0.0</version>
    <type>pom</type>
 </dependency>
````

###Use

````java

  com.imalhasaranga.Countries countries = com.imalhasaranga.Countries.getInstance();
        //All com.imalhasaranga.Countries
  List<com.imalhasaranga.Country> countryList =  countries.getCountryList();
        //Single com.imalhasaranga.Country by Alpha 2 code
  com.imalhasaranga.Country country = countries.getCountryByAlpha2Code("US");
        //com.imalhasaranga.State info
  List<com.imalhasaranga.State> countryStates = country.getStates();


````