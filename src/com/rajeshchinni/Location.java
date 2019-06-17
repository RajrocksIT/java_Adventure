package com.rajeshchinni;

import java.util.HashMap;
import java.util.Map;

public class Location {
    private final int locationID;
    private final String description;
    private final Map<String, Integer> exits;

    public Location(int locationID, String description) {
        this.locationID = locationID;
        this.description = description;
        this.exits = new HashMap<String, Integer>();    // manually added
    }

    // getters
    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExits() {
        //return exits;
        return new HashMap<String, Integer>(exits);       // creating a new HashMap instead of just returning the exits map.
                                                         // so the getter returns a copy of the exits.
    }

    // methods
    public void addExit(String direction, int location){
        exits.put(direction, location);
    }
}
