package io.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalDateTimeExample {

    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime = " + localDateTime);

        localDateTime = LocalDateTime.of(2022, 12, 02, 15, 52, 30);
        System.out.println("localDateTime = " + localDateTime);

        localDateTime = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        System.out.println("localDateTime = " + localDateTime);

        System.out.println("localDateTime.getHour() = " + localDateTime.getHour());
        System.out.println("localDateTime.getMinute() = " + localDateTime.getMinute());
        System.out.println("localDateTime.getSecond() = " + localDateTime.getSecond());
        System.out.println("localDateTime.getDayOfMonth() = " + localDateTime.getDayOfMonth());

        System.out.println("localDateTime.get(ChronoField.DAY_OF_WEEK) = " + localDateTime.get(ChronoField.DAY_OF_WEEK));

        System.out.println("localDateTime.plusHours(3) = " + localDateTime.plusHours(3));
        System.out.println("localDateTime.plusMinutes(30) = " + localDateTime.plusMinutes(30));
        System.out.println("localDateTime.with(ChronoField.HOUR_OF_DAY, 3) = " + localDateTime.with(ChronoField.HOUR_OF_DAY, 4));
        System.out.println("localDateTime.with(LocalTime.MIDNIGHT) = " + localDateTime.with(LocalTime.MIDNIGHT));
        
    }
}
