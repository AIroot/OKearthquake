package com.webephase.www.okearthquake;


/**
 * An {@ Link Earthquake} object contains information related to a single earthquake.
 */
public class OkEarthquake {
    /* Magnitude of the earthquake */
    private String mMagnitude;

    /**
     * Location of the earthquake
     */
    private String mLocation;

    /**
     * Date of the earthquake
     */
    private String mDate;

    /**
     * Constructs a new {@link OkEarthquake} object.
     *
     * @param magnitude is the magnitude of the earthquake
     * @param location  is the city location of the earthquake
     * @param date      is the date the earthquake happened
     */
    public OkEarthquake(String magnitude, String location, String date) {
        mMagnitude = magnitude;
        mLocation = location;
        mDate = date;
    }

    /**
     * Returns the magnitude of the earthquake.
     */
    public String getmMagnitude() {
        return mMagnitude;
    }

    /**
     * Return the location of the earthquake.
     */
    public String getmDate() {
        return mDate;
    }

    /**
     * Return the location of the earthquake.
     */
    public String getmLocation() {
        return mLocation;
    }
}
