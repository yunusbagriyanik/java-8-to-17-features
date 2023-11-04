package com.yunusbagriyanik.java8.model;

public class MountainBike extends Bicycle {
    public int seatHeight;

    public MountainBike(int seatHeight, int cadence, int gear, int speed) {
        super(cadence, gear, speed);
        this.seatHeight = seatHeight;
    }

    public void setHeight(int newValue) {
        seatHeight = newValue;
    }
}
