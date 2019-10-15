package Tdatas.test;

import java.util.Calendar;
import java.util.Date;

public class ManipulaçãoDeDatasTest {
    public static void main(String[] args) {
        Date date = new Date();
        date.setTime(date.getTime()+ 3_600_000L);
        System.out.println(date);

        Calendar c = Calendar.getInstance();
        c.setTime(date);
        if (Calendar.SUNDAY==c.getFirstDayOfWeek()){
            System.out.println("Domingo é o primeiro dia da semana");
        }
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.DAY_OF_YEAR));
        c.add(Calendar.HOUR,24);
        Date date1=c.getTime();
        System.out.println(date1);

    }
    //NumberFormat,locale,Calendar,Date,DateFormat
}
