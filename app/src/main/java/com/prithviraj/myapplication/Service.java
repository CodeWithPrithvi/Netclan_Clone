package com.prithviraj.myapplication;

public class Service {
    private String userName;
    private String city;
    private String distance;
    private int profileScore;
    private String occupation;
    private int yearsOfExperience;
    private String availabilityMessage;

    public Service(String userName, String city, String distance, int profileScore, String occupation, int yearsOfExperience, String availabilityMessage) {
        this.userName = userName;
        this.city = city;
        this.distance = distance;
        this.profileScore = profileScore;
        this.occupation = occupation;
        this.yearsOfExperience = yearsOfExperience;
        this.availabilityMessage = availabilityMessage;
    }


    public String getUserName() { return userName; }
    public String getCity() { return city; }
    public String getDistance() { return distance; }
    public int getProfileScore() { return profileScore; }
    public String getOccupation() { return occupation; }
    public int getYearsOfExperience() { return yearsOfExperience; }
    public String getAvailabilityMessage() { return availabilityMessage; }
}
