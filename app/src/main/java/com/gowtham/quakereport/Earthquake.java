package com.gowtham.quakereport;

public class Earthquake {

    private final double magnitude;
    private final String location;
    private final String url;
    private final long timeInMilliseconds;

    public Earthquake(double magnitude, String location, String url, long timeInMilliseconds) {
        this.magnitude = magnitude;
        this.location = location;
        this.url = url;
        this.timeInMilliseconds = timeInMilliseconds;
    }

    public double getMagnitude() {
        return magnitude;
    }

    public String getLocation() {
        return location;
    }

    public String getUrl() {
        return url;
    }

    public long getTimeInMilliseconds() {
        return timeInMilliseconds;
    }
}
