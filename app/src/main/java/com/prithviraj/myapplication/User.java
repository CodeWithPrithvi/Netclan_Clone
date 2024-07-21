package com.prithviraj.myapplication;

public class User {
    private String userName;
    private String city;
    private String occupation;
    private int distance;


    public User(String userName, String city, String occupation, int distance) {
        this.userName = userName;
        this.city = city;
        this.occupation = occupation;
        this.distance = distance;
    }

    // Getters
    public String getUserName() { return userName; }
    public String getCity() { return city; }
    public String getOccupation() { return occupation; }
    public int getDistance() { return distance; }
}

