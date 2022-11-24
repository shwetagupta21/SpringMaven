package com.entities;

public class Hostel {
    private long hostelId;
    private String hostelName;
    private String landmark;
    private String address1;
    private String getAddress2;
    private String city;
    private String state;
    private String pinCode;
    private int roomsCount;
    private long hostId;

    public Hostel(long hostelId, String hostelName, String landmark, String address1, String getAddress2, String city, String state, String pinCode, int roomsCount, long hostId) {
        this.hostelId = hostelId;
        this.hostelName = hostelName;
        this.landmark = landmark;
        this.address1 = address1;
        this.getAddress2 = getAddress2;
        this.city = city;
        this.state = state;
        this.pinCode = pinCode;
        this.roomsCount = roomsCount;
        this.hostId = hostId;
    }

    public long getHostelId() {
        return hostelId;
    }

    public void setHostelId(long hostelId) {
        this.hostelId = hostelId;
    }

    public String getHostelName() {
        return hostelName;
    }

    public void setHostelName(String hostelName) {
        this.hostelName = hostelName;
    }

    public String getLandmark() {
        return landmark;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getGetAddress2() {
        return getAddress2;
    }

    public void setGetAddress2(String getAddress2) {
        this.getAddress2 = getAddress2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public int getRoomsCount() {
        return roomsCount;
    }

    public void setRoomsCount(int roomsCount) {
        this.roomsCount = roomsCount;
    }

    public long getHostId() {
        return hostId;
    }

    public void setHostId(long hostId) {
        this.hostId = hostId;
    }

    @Override
    public String toString() {
        return "Hostel{" +
                "hostelId=" + hostelId +
                ", hostelName='" + hostelName + '\'' +
                ", landmark='" + landmark + '\'' +
                ", address1='" + address1 + '\'' +
                ", getAddress2='" + getAddress2 + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", pinCode='" + pinCode + '\'' +
                ", roomsCount=" + roomsCount +
                ", hostId=" + hostId +
                '}';
    }
}


