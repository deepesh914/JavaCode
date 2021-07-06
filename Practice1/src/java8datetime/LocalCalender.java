package java8datetime;

import java.time.LocalDateTime;
import java.time.Month;

public class LocalCalender {

    public static void main(String[] args) {

        LocalDateTime ldt = LocalDateTime.of(1995, Month.APRIL, 28, 12, 45);
        System.out.println("Now: " + ldt);
        System.out.println("After six months: " + ldt.plusMonths(6));
        System.out.println("Before six months: " + ldt.minusMonths(6));
    }

}
