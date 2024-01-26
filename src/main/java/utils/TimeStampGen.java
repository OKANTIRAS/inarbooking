package utils;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class TimeStampGen {

    /**
     * Creates a timestamp with the specified pattern.
     * patterns:
     *          dd.MM.yyyy HH:mm:ss
     *          dd.MM HH:mm:ss
     *          ...
     * @param pattern the pattern for the timestamp
     * @return the generated timestamp
     */
    public static String  createTimeStamp(String pattern){
        LocalDateTime currentTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return currentTime.format(formatter);
    }

    /**
     * Retrieves the current date in the "dd-MM-yyyy" format.
     *
     * @return the current date in the "dd-MM-yyyy" format
     */
    public static String getCurrentDateDDMMYYYY() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date currentDate = new Date();
        return dateFormat.format(currentDate);
    }

    /**
     * Retrieves the current date in the "dd.MM.yyyy" format.
     * @return the current date in the "dd.MM.yyyy" format
     */
    public static String getCurrentDateWithDotsDDMMYYYY() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        Date currentDate = new Date();
        return dateFormat.format(currentDate);
    }

    /**
     * Retrieves the current time in the "HH.mm.ss" format.
     *
     * @return the current time in the "HH.mm.ss" format
     */
    public static String getCurrentDateHHMMSS(){
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH.mm.ss");
        return now.format(formatter);
    }

    /**
     * Creates a timestamp for an order number using the current time.
     *
     * @return the timestamp for the order number
     */
    public static String createTimeStampForOrderNo(){
        return getCurrentDateHHMMSS();
    }

    /**
     * Retrieves the current date in the "MM-dd-yyyy" format.
     *
     * @return the current date in the "MM-dd-yyyy" format
     */
    public static String getCurrentDateMMDDYYYY() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
        Date currentDate = new Date();
        return dateFormat.format(currentDate);
    }
}
