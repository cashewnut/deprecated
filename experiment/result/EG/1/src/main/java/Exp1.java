import java.util.Date;
import java.util.Calendar;

public class Exp1 {

    public Date getNextDay(Date date) {
        int[][] days = { { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 } };
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int month = calendar.get(Calendar.MONTH);
        int year = calendar.get(Calendar.YEAR);
        int leap = isLeapYear(date);
        int addMonth = (day + 1) / days[leap][month];
        day = (day + 1) % days[leap][month];
        month += addMonth;
        year += month / 12;
        month %= 12;
        calendar.set(year,month-1,day);
       // init Calendar;Calendar.setTime(date);Calendar.set(Calendar.YEAR, year);
        //Calendar.set(Calendar.MONTH, month);
        //Calendar.set(Calendar.DAY_OF_MONTH, day);
        Date newDate = calendar.getTime();
        return newDate;
    }

    private int isLeapYear(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int year = calendar.get(Calendar.YEAR);
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? 1 : 0;
    }
}
