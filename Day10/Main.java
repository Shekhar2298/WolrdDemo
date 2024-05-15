package Day9;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        // Print current LocalDate
        LocalDate localDate = LocalDate.now();
        System.out.println("Current LocalDate: " + localDate);

        // Convert ZonedDateTime to LocalDate
        LocalDate localDate1 = LocalDate.from(ZonedDateTime.now());
        System.out.println("Converted LocalDate from ZonedDateTime: " + localDate1);

        // Print current LocalTime
        LocalTime localTime = LocalTime.from(ZonedDateTime.now());
        System.out.println("Current LocalTime: " + localTime);

        // Formatting LocalDate
        String s = "1995-05-11";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate localDate2 = LocalDate.now();
        String formattedDate = localDate2.format(dateTimeFormatter);
        System.out.println("Formatted LocalDate: " + formattedDate);

        // Parsing String to LocalDate
        LocalDate localDate3 = LocalDate.parse(s);
        String parsedDate = localDate3.format(dateTimeFormatter);
        System.out.println("Parsed LocalDate: " + parsedDate);
    }
}
