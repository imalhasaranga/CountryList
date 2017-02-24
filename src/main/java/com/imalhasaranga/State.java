package com.imalhasaranga;

/**
 * Created by imal365 on 2/23/17.
 */
public class State {

    private String state;

    public State(String statename){

    }

    public State(){}

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return this.state;
    }
}
