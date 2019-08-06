import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Exp1 {

    public Date getNextDay(Date date) {
        int[][] days = {{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}};
        int day = date.getDate();
        int month = date.getMonth();
        int year = date.getYear();
        int leap = isLeapYear(date);

        int addMonth = (day + 1) / days[leap][month];
        day = (day + 1) % days[leap][month];
        month += addMonth;

        year += month / 12;
        month %= 12;
        date.setYear(year);
        date.setMonth(month);
        date.setDate(day);
        return date;
    }

    private int isLeapYear(Date date) {
        int year = date.getYear();
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? 1 : 0;
    }

    public static void main(String[] args) throws ParseException {
        Exp1 exp1 = new Exp1();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse("2020-12-31");
        Date tomorrow = exp1.getNextDay2(date);
        System.out.println(sdf.format(tomorrow));
    }

    public Date getNextDay2(Date date) {

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int[][] days = {{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}};
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int month = calendar.get(Calendar.MONTH);
        int year = calendar.get(Calendar.YEAR);
        int leap = isLeapYear(date);

        int addMonth = (day + 1) / days[leap][month];
        day = (day + 1) % days[leap][month];
        month += addMonth;

        year += month / 12;
        month %= 12;
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month);
        calendar.set(Calendar.DAY_OF_MONTH, day);
        return calendar.getTime();

    }

}
