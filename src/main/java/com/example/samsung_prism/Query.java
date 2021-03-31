package com.example.samsung_prism;

public class Query {
    private String action;
    private String state;
    private String device;
    private String room;

    public String getAction() {
        return action;
    }

    public String getDevice() {
        return device;
    }

    public String getRoom() {
        return room;
    }

    public String getState() {
        return state;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public void setState(String state) {
        this.state = state;
    }
}
