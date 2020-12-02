package io.datetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationExample {

    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime localDateTime1 = LocalDateTime.now();

        Duration duration = Duration.between(localDateTime, localDateTime1);
        System.out.println("duration.toHours() = " + duration.toHours());
        System.out.println("duration.toMinutes() = " + duration.toMinutes());
        System.out.println("duration.toSeconds() = " + duration.toSeconds());
        System.out.println("duration.toMillis() = " + duration.toMillis());
        System.out.println();

        LocalTime localTime = LocalTime.now();
        LocalTime localTime1 = LocalTime.now();
        duration = Duration.between(localTime, localTime1);
        System.out.println("duration.toMinutes = " + duration.toMinutes());
        System.out.println("duration.toMillis = " + duration.toMillis());
        System.out.println("duration.toNanos = " + duration.toNanos());
        System.out.println();

        // Duration is not allowed for LocalDate, it's only allowed where time is in picture
        /*LocalDate localDate = LocalDate.now();
        LocalDate localDate1 = LocalDate.now();
        duration = Duration.between(localDate, localDate1);
        System.out.println("duration = " + duration.toDays());
        System.out.println("duration = " + duration.toDaysPart());*/
    }
}
