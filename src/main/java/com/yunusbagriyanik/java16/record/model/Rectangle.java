package com.yunusbagriyanik.java16.record.model;

public record Rectangle(double length, double width) {
    // compact constructor whose signature is implicit (derived from the components automatically)
    public Rectangle {
        if (length <= 0 || width <= 0) {
            throw new IllegalArgumentException(String.format("Invalid dimensions: %f, %f", length, width));
        }
    }

    // public accessor method
    public double length() {
        System.out.println("Length is " + length);
        return length;
    }
}
