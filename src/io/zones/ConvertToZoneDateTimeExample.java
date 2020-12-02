package io.zones;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class ConvertToZoneDateTimeExample {

    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println("localDateTime = " + localDateTime);

        //Conversion
        ZonedDateTime zonedDateTime = localDateTime.atZone(ZoneId.of("Europe/Amsterdam"));
        System.out.println("zonedDateTime = " + zonedDateTime);

        ZonedDateTime newZonedDateTime = localDateTime.atZone(ZoneId.of("Asia/Singapore"));
        System.out.println("zonedDateTime = " + newZonedDateTime);

        System.out.println("localDateTime.atOffset(ZoneOffset.ofHours(-10)) = " + localDateTime.atOffset(ZoneOffset.ofHours(-10)));
    }
}
