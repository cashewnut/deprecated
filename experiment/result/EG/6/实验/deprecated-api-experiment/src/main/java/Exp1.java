import java.util.Calendar;
import java.util.Date;

public class Exp1 {

    public Date getNextDay(Date date) {
        int[][] days = {{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}};
        Calendar calendar = Calendar.getInstance();
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int month = calendar.get(Calendar.MONTH);
        int year = calendar.get(Calendar.YEAR);
        int leap = isLeapYear(calendar);

        int addMonth = (day + 1) / days[leap][month];
        day = (day + 1) % days[leap][month];
        month += addMonth;

        year += month / 12;
        month %= 12;
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month);
        calendar.set(Calendar.DAY_OF_MONTH, day);
        return date;
    }

    private int isLeapYear(Calendar calendar) {
        int year = calendar.get(Calendar.YEAR);
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? 1 : 0;
    }


}
