//import java.util.Date;
//
//public class Exp1 {
//
//    public Date getNextDay(Date date) {
//        int[][] days = {{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}};
//        int day = date.getDate();
//        int month = date.getMonth();
//        int year = date.getYear();
//        int leap = isLeapYear(date);
//
//        int addMonth = (day + 1) / days[leap][month];
//        day = (day + 1) % days[leap][month];
//        month += addMonth;
//
//        year += month / 12;
//        month %= 12;
//        date.setYear(year);
//        date.setMonth(month);
//        date.setDate(day);
//        return date;
//    }
//
//    private int isLeapYear(Date date) {
//        int year = date.getYear();
//        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? 1 : 0;
//    }
//
//}
//

import java.util.Date;
import java.util.Calendar;

public class Exp1 {

    public Date getNextDay(Date date) {
        int[][] days = { { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 } };
        Calendar day = Calendar.getInstance();
        day.set(2019,6,14);
        day.get(Calendar.DAY_OF_MONTH);
        int month = day.get(Calendar.MONTH);
        int year = day.get(Calendar.YEAR);
        int leap = isLeapYear(date);
        int addMonth = (month + 1) / days[leap][month];
        day = (day + 1) % days[leap][month];
        month += addMonth;
        year += month / 12;
        month %= 12;
        day.setTime(date);
        day.set(Calendar.YEAR, year);
        Calendar.set(Calendar.MONTH, month);
        Calendar.set(Calendar.DAY_OF_MONTH, day);
        return date;
    }

    private int isLeapYear(Date date) {
        int year = Calendar.get(Calendar.YEAR);
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? 1 : 0;
    }
}
