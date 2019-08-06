import java.util.Calendar;
import java.util.Date;

public class Exp1 {

    public Date getNextDay(Date date) {
        Calendar Calendar = java.util.Calendar.getInstance();
        int[][] days = {{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}};
        int day = Calendar.get(Calendar.DAY_OF_MONTH);
        int month = Calendar.get(Calendar.MONTH);
        int year = Calendar.get(Calendar.YEAR) - 1900;
        int leap = isLeapYear(date);

        int addMonth = (day + 1) / days[leap][month];
        day = (day + 1) % days[leap][month];
        month += addMonth;

        year += month / 12;
        month %= 12;
        Calendar.set(Calendar.YEAR, year);
        Calendar.set(Calendar.MONTH, month);
        Calendar.set(Calendar.DAY_OF_MONTH, day);
        return date;
    }

    private int isLeapYear(Date date) {
        Calendar Calendar = java.util.Calendar.getInstance();
        int year = Calendar.get(Calendar.YEAR);
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? 1 : 0;
    }

}
