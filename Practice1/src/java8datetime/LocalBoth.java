package java8datetime;

import java.time.LocalDateTime;

public class LocalBoth {

    public static void main(String[] args) {

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);
        System.out.println("------------------------");
        int dd = dt.getDayOfMonth();
        int mm = dt.getMonthValue();
        int yy = dt.getYear();
        System.out.printf("%d-%d-%d", dd, mm, yy);
        System.out.println();
        System.out.println("------------------------");
        int h = dt.getHour();
        int m = dt.getMinute();
        int s = dt.getSecond();
        int n = dt.getNano();
        System.out.printf("%d:%d:%d:%d", h, m, s, n);
    }

}
