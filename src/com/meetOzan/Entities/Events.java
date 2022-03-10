package com.meetOzan.Entities;

public class Events {

    private String eventName;
    private double disCount;
    private boolean isActive;
    private int howManyDays;

    public Events(){
    }

    public Events(String eventName, double disCount, boolean isActive) {
        this.eventName = eventName;
        this.disCount = disCount;
        this.isActive = isActive;
        this.howManyDays = howManyDays;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public double getDisCount() {
        return disCount;
    }

    public void setDisCount(double disCount) {
        this.disCount = disCount;
    }

    public int getHowManyDays() {
        return howManyDays;
    }

    public void setHowManyDays(int howManyDays) {
        this.howManyDays = howManyDays;
    }

}
