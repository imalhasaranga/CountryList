package com.imalhasaranga;

import java.util.List;

/**
 * Created by imal365 on 2/23/17.
 */
public class Country {
    private String name;
    private String alpha2Code;
    private List<State> states;

    public Country(String name, String alpha2Code){
        this.name = name;
        this.alpha2Code = alpha2Code;
    }
    public Country(String alpha2Code){
        this.alpha2Code = alpha2Code;
    }

    public Country(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlpha2Code() {
        return alpha2Code;
    }

    public void setAlpha2Code(String alpha2Code) {
        this.alpha2Code = alpha2Code;
    }

    public List<State> getStates() {
        return states;
    }

    public void setStates(List<State> states) {
        this.states = states;
    }

    @Override
    public boolean equals(Object obj) {
        return this.alpha2Code.equals(((Country)obj).getAlpha2Code());
    }
}
