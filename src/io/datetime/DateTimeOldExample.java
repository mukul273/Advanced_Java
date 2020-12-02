package io.datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

public class DateTimeOldExample {

    public static void main(String[] args) {
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
        System.out.println("df.format():" + dateFormat.format(date));

        dateFormat = new SimpleDateFormat("HH:mm:ss");
        System.out.println("dateFormat = " + dateFormat.format(date));

        System.out.println(Calendar.getInstance().getTime());

        //New Libraries in Java8+
        LocalDate localDate = LocalDate.now();
        System.out.println("localDate = " + localDate);

        LocalTime localTime = LocalTime.now();
        System.out.println("localTime = " + localTime);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime = " + localDateTime);
    }
}
