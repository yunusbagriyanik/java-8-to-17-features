package com.yunusbagriyanik.java16.patternmatching;

import java.util.Collection;
import java.util.List;
import java.util.Stack;

// since Java 14
public class PatternMatching {
    public static void main(String[] args) {
        Collection<Stack> stackCollection = new Stack<>();
        previouslyCode(stackCollection);
        java16InstanceOf(stackCollection);
    }

    public static void previouslyCode(Collection<Stack> collection) {
        if (collection instanceof Stack) {
            Stack s = (Stack) collection;
            System.out.println("Collection's hashcode is: " + s.hashCode());
        } else if (collection instanceof Collection) {
            Collection c = collection;
            System.out.println("Collection's hashcode is: " + c.hashCode());
        }
    }

    public static void java16InstanceOf(Collection<Stack> collection) {
        if (collection instanceof Stack s) {
            System.out.println("Collection's hashcode is: " + s.hashCode());
        } else if (collection instanceof List c) {
            System.out.println("Collection's hashcode is: " + c.hashCode());
        }
    }
}
