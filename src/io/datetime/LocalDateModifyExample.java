package io.datetime;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class LocalDateModifyExample {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        System.out.println("localDate = " + localDate);
        System.out.println("localDate (plusDays())= " + localDate.plusDays(4));

        System.out.println("localDate (plusMonths) = " + localDate.plusMonths(3));
        System.out.println("localDate (plusYears) = " + localDate.plusYears(3));

        System.out.println("localDate (minusMonths) = " + localDate.minusMonths(3));

        System.out.println("localDate (with ChronoField) = " + localDate.with(ChronoField.YEAR, 2022));
        System.out.println("localDate (with TemporalAdjusters) = " + localDate.with(TemporalAdjusters.firstDayOfMonth()));
    }
}
