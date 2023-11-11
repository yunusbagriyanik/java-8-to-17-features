package com.yunusbagriyanik.java16.record;


import com.yunusbagriyanik.java16.record.model.Rectangle;

public class RectangleRecordMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 20);
        rectangle.length();

        Rectangle rectangle2 = Rectangle.createGoldenRectangle(10);
        System.out.println("rectangle2: " + rectangle2);
        System.out.println("rectangle2 area: " + rectangle2.area());

        System.out.println(rectangle2.getRotatedRectangleBoundingBox(10));
    }
}
