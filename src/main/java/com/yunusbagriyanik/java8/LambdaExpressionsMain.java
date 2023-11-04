package com.yunusbagriyanik.java8;

import com.yunusbagriyanik.java14.record.RecordMain;
import com.yunusbagriyanik.java8.model.Bicycle;
import com.yunusbagriyanik.java8.model.MountainBike;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Lambda Expressions is a feature introduced in Java 8. This feature
 * supports functional programming approach in Java programming and allows
 * writing shorter and more readable code.
 */
public class LambdaExpressionsMain {
    protected static final Logger logger = LogManager.getLogger(RecordMain.class);

    public static void main(String[] args) {
        List<Bicycle> bicycles = initData();
        filterWithLambda(bicycles).forEach(logger::info);
        List<Bicycle> result = filterWithoutLambda(bicycles);
        logger.info(result);
    }

    /**
     * Filters bicycles with speed greater than or equal to 3 using Lambda Expressions.
     *
     * @param bikes List of bicycles
     * @return Filtered list of bicycles
     */
    public static List<Bicycle> filterWithLambda(List<Bicycle> bikes) {
        return bikes.stream()
                .filter(bicycle -> bicycle.speed >= 3)
                .collect(Collectors.toList());
    }

    /**
     * Filters bicycles with speed greater than or equal to 3 without using Lambda Expressions.
     *
     * @param bikes List of bicycles
     * @return Filtered list of bicycles
     */
    public static List<Bicycle> filterWithoutLambda(List<Bicycle> bikes) {
        List<Bicycle> filteredBikes = new ArrayList<>();
        for (Bicycle bike : bikes) {
            if (bike.speed >= 3) {
                filteredBikes.add(bike);
            }
        }
        return filteredBikes;
    }

    /**
     * Initializes a list of bicycles with sample data.
     *
     * @return List of bicycles
     */
    public static List<Bicycle> initData() {
        List<Bicycle> bikes = new ArrayList<>();
        bikes.add(new Bicycle(5, 20, 3));
        bikes.add(new Bicycle(6, 18, 4));
        bikes.add(new MountainBike(25, 7, 5, 30));
        bikes.add(new MountainBike(27, 8, 6, 35));

        return bikes;
    }
}
