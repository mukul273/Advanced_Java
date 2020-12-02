package io.zones;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonesExample {

    public static void main(String[] args) {
        //Prints available zones
        ZoneId.getAvailableZoneIds().stream().forEach(System.out::println);

        //Prints time in mentioned zone
        System.out.println("Europe/Amsterdam:"+ ZonedDateTime.now(ZoneId.of("Europe/Amsterdam")));

    }
}
