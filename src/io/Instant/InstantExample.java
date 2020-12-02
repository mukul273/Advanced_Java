package io.Instant;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class InstantExample {

    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println("instant = " + instant);
        System.out.println("instant.getNano() = " + instant.getNano());

        Instant instant1 = Instant.now().plusSeconds(3600);
        Duration duration = Duration.between(instant1, instant);
        System.out.println("duration.toSeconds() = " + duration.toSeconds());
        System.out.println("duration.toMinutes() = " + duration.toMinutes());
        System.out.println("duration.toHours() = " + duration.toHours());

        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant1, ZoneId.systemDefault());
        System.out.println("localDateTime = " + localDateTime);
    }
}
