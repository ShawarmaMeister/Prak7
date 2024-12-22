import java.util.Random;
import java.util.GregorianCalendar;
public class Main {
    public static void main(String[] args) {
        final int MILLISECONDS_PER_SECOND = 1000, SECONDS_PER_MINUTE = 60,
                MINUTES_PER_HOUR = 60, HOURS_PER_DAY = 24;

        long totalMilliseconds, totalSeconds, currentSecond,
                totalMinutes, currentMinute, totalHours, currentHour;
        totalMilliseconds = System.currentTimeMillis();
        totalSeconds = totalMilliseconds / MILLISECONDS_PER_SECOND;
        currentSecond = totalSeconds % SECONDS_PER_MINUTE;
        totalMinutes = totalSeconds / SECONDS_PER_MINUTE;
        currentMinute = totalMinutes % MINUTES_PER_HOUR;
        totalHours = totalMinutes / MINUTES_PER_HOUR;
        currentHour = totalHours % HOURS_PER_DAY;

        System.out.println("Текущее время равно " + currentHour + ":"
                + currentMinute + ":" + currentSecond + " GMT.");
        java.util.Date date = new java.util.Date(); System.out.println("Время, прошедшее с 1 января 1970 г., равно " + date.getTime() + " миллисекунд.");
        System.out.println(date.toString());
        Random generator1 = new Random(3);
        System.out.print("Из generator1: ");
        for (int i = 0; i < 10; i++)
            System.out.print(generator1.nextInt(1000) + " ");
        Random generator2 = new Random(3);
        System.out.print("\nИз generator2: ");
        for (int i = 0; i < 10; i++)
            System.out.print(generator2.nextInt(1000) + " ");

        java.util.Date date1 = new java.util.Date(10000); System.out.println(date1.toString());
        java.util.Date date2 = new java.util.Date(100000); System.out.println(date2.toString());
        java.util.Date date3 = new java.util.Date(1000000); System.out.println(date3.toString());
        java.util.Date date4 = new java.util.Date(10000000); System.out.println(date4.toString());
        java.util.Date date5 = new java.util.Date(100000000); System.out.println(date5.toString());
        java.util.Date date6 = new java.util.Date(1000000000); System.out.println(date6.toString());
        java.util.Date date7 = new java.util.Date(10000000000L); System.out.println(date7.toString());
        java.util.Date date8 = new java.util.Date(100000000000L); System.out.println(date8.toString());

        Random random = new Random(1000);
//За
        for (int i = 0; i < 50; i++) {
            int randomNumber = random.nextInt(100);
            System.out.println("Случайное число " + (i + 1) + ": " + randomNumber);
        }

        java.util.Date datea = new java.util.Date(); System.out.println(datea.toString());

        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTimeInMillis(1234567898765L);

        int year = calendar.get(GregorianCalendar.YEAR);
        int month = calendar.get(GregorianCalendar.MONTH) + 1;
        int day = calendar.get(GregorianCalendar.DAY_OF_MONTH);

        System.out.println("Год: " + year);
        System.out.println("Месяц: " + month);
        System.out.println("День: " + day);


    }
}