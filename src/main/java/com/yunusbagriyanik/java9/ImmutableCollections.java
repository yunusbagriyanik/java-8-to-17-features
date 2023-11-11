package com.yunusbagriyanik.java9;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;

/**
 * In Java SE 8 and earlier versions, the unmodifiable methods of the collections class can be used to create immutable collection objects.
 * Factory methods List.of(), Set.of(), Map.of(), and Map.ofEntries() introduced in Java 9 are used to create immutable objects.
 * - Immutability
 * - Fixed-size
 * - Does not allow null elements
 */
public class ImmutableCollections {
    protected static final Logger logger = LogManager.getLogger(ImmutableCollections.class);

    public static void main(String[] args) {
        // before java 9 unmodifiable list
        Map<String, Integer> mapping = new HashMap<>();
        mapping.put(UUID.randomUUID().toString(), 1);
        mapping.put(UUID.randomUUID().toString(), 2);
        mapping.put(UUID.randomUUID().toString(), 3);

        // create two members
        Map<String, Integer> stringIntegerMap = Collections.unmodifiableMap(mapping);
        logger.info(stringIntegerMap);
        //stringIntegerMap.put(UUID.randomUUID().toString(), 4); // UnsupportedOperationException

        // java 9
        List<String> immutableList = List.of("test", "test2", "test3");
        //immutableList.add("test4"); // UnsupportedOperationException
        //immutableList.add(null); // NullPointerException

        Map<String, String> mutableMap = Map.of("key1", "value1", "key2", "value2");
        //mutableMap.put("key3", "value3"); // UnsupportedOperationException

        Map<Integer, String> map = Map.of(100, "XX", 101, "YY", 102, "ZZ");
        map.forEach((k, v) -> logger.info(k + " - " + v));
        //map.put(103, "WW"); // UnsupportedOperationException

        Map.Entry<Integer, String> integerStringEntry = Map.entry(1, "1");
        Map.Entry<Integer, String> integerStringEntry2 = Map.entry(2, "2");
        Map<Integer, String> integerStringMap = Map.ofEntries(integerStringEntry, integerStringEntry2);
        integerStringMap.forEach((k, v) -> logger.info(k + " - " + v));
        integerStringMap.put(3, "3"); // UnsupportedOperationException
    }
}
