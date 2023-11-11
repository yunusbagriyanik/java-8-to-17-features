package com.yunusbagriyanik.java16.record.model;

import com.yunusbagriyanik.java16.record.Shape;

public record Rectangle(double length, double width) implements Shape {
    static double goldenRatio;

    static {
        goldenRatio = (1 + Math.sqrt(5)) / 2;
    }

    public static Rectangle createGoldenRectangle(double width) {
        return new Rectangle(width, width * goldenRatio);
    }

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

    @Override
    public double area() {
        return length * width;
    }

    // nested record class
    record RotationAngle(double angle) {
        public RotationAngle {
            angle = Math.toRadians(angle);
        }
    }

    // public instance method
    public Rectangle getRotatedRectangleBoundingBox(double angle) {
        RotationAngle ra = new RotationAngle(angle);
        double x = Math.abs(length * Math.cos(ra.angle())) + Math.abs(width * Math.sin(ra.angle()));
        double y = Math.abs(length * Math.sin(ra.angle())) + Math.abs(width * Math.cos(ra.angle()));
        return new Rectangle(x, y);
    }
}
