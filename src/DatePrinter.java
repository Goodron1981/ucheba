import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class DatePrinter {

    public static void main(String[] args) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        String[] timeZones = TimeZone.getAvailableIDs();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm");
        for (String timeZone : timeZones) {
            dateFormat.setTimeZone(TimeZone.getTimeZone(timeZone));
            System.out.printf("For %s time is : %s \n", timeZone, dateFormat.format(gregorianCalendar.getTime()));
        }
    }

}
