package com.yunusbagriyanik.java14.switchexp;

import com.yunusbagriyanik.java14.record.RecordMain;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.Month;

public class SwitchExpressionsMain {
    protected static final Logger logger = LogManager.getLogger(RecordMain.class);

    public static void main(String[] args) {
        logger.info(before14(Month.FEBRUARY));
        logger.info(after14(Month.FEBRUARY));
        logger.info(isTodayHoliday("SUNDAY"));
    }

    public static int before14(Month month) {
        int days;
        switch (month) {
            case JANUARY, MARCH, MAY, JULY, AUGUST, OCTOBER, DECEMBER:
                days = 31;
                break;
            case FEBRUARY:
                days = 28;
                break;
            case APRIL, JUNE, SEPTEMBER, NOVEMBER:
                days = 30;
                break;
            default:
                throw new IllegalStateException();
        }

        return days;
    }

    public static int after14(Month month) {
        int days;
        days = switch (month) {
            case JANUARY, MARCH, MAY, JULY, AUGUST, OCTOBER, DECEMBER -> 31;
            case FEBRUARY -> 28;
            case APRIL, JUNE, SEPTEMBER, NOVEMBER -> 30;
        };

        return days;
    }

    public static boolean isTodayHoliday(String day) {
        boolean isTodayHoliday;
        switch (day) {
            case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" -> isTodayHoliday = false;
            case "SATURDAY", "SUNDAY" -> isTodayHoliday = true;
            default -> throw new IllegalArgumentException("Unexpected value: " + day);
        }

        return isTodayHoliday;
    }
}
