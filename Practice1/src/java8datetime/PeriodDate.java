package java8datetime;

import java.time.LocalDate;
import java.time.Period;

public class PeriodDate {

    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(1990, 12, 23);
        LocalDate today = LocalDate.now();
        Period p = Period.between(birthday, today);
        System.out.printf("your age is %d years %d months %d days", p.getYears(), p.getMonths(), p.getDays());

        LocalDate deathday = LocalDate.of(1990 + 60, 12, 23);
        Period p1 = Period.between(today, deathday);
        int d = p.getYears() * 365 + p.getMonths() * 30 + p.getDays();
        System.out.printf("\nyou will be on earth for %d days. ", d);
    }

}
