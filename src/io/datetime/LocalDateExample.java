package io.datetime;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class LocalDateExample {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        System.out.println("localDate (prints local computers date) = " + localDate);

        localDate = LocalDate.ofYearDay(2021, 273);
        System.out.println("localDate (Day of the year) = " + localDate);

        localDate = LocalDate.of(2020, 9, 27);
        System.out.println("localDate = " + localDate);

        localDate = LocalDate.now();
        System.out.println("localDate.getMonth() = " + localDate.getMonth());
        System.out.println("localDate.getEra() = " + localDate.getEra());
        System.out.println("localDate.getDayOfMonth() = " + localDate.getDayOfMonth());
        System.out.println("localDate.getMonth() = " + localDate.getMonthValue());
        System.out.println("localDate.getDayOfWeek() = " + localDate.getDayOfWeek());
        System.out.println("localDate.getDayOfYear() = " + localDate.getDayOfYear());
        System.out.println("localDate.getDayOfYear() = " + localDate.get(ChronoField.DAY_OF_WEEK));

    }
}
