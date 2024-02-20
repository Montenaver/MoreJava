package org.example;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeDemo {
    public static void main(String[] args) {
        //TODO: data to read - https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
        LocalDate date = LocalDate.now();
        System.out.println(date);

        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = dateTime.format(formatter);
        System.out.println(formattedDate);

        //Wednesday, January 17 2024, 10:44 AM
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("EEEE, MMMM dd yyyy, HH:mm a");
        String formattedDate2 = dateTime.format(formatter2);
        System.out.println(formattedDate2);

        //Wed, Jan 17 2024, 10:46 AM
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("EEE, MMM dd yyyy, HH:mm a");
        String formattedDate3 = dateTime.format(formatter3);
        System.out.println(formattedDate3);
    }
}