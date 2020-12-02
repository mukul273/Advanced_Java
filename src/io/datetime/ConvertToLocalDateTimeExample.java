package io.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class ConvertToLocalDateTimeExample {

    public static void main(String[] args) {

        Date date = new Date();
        LocalDateTime localDateTime = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        System.out.println("localDateTime = " + localDateTime);

        java.sql.Date date1 = new java.sql.Date(System.currentTimeMillis());
        LocalDate localDate = date1.toLocalDate();
        System.out.println("localDate = " + localDate);
    }
}
