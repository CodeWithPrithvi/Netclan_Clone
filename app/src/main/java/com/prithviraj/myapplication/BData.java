package com.prithviraj.myapplication;

public class BData {
    private String name;
    private String city;
    private String dist;
    private int prog;
    private String desc;

    public BData(String name, String city, String dist, int prog, String desc) {
        this.name = name;
        this.city = city;
        this.dist = dist;
        this.prog = prog;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getDist() {
        return dist;
    }

    public int getProg() {
        return prog;
    }

    public String getDesc() {
        return desc;
    }
}
