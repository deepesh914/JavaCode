package java8datetime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneExample {

    public static void main(String[] args) {
        ZoneId z = ZoneId.systemDefault();
        System.out.println(z);

        ZoneId la = ZoneId.of("America/Los_Angeles");
        ZonedDateTime zt = ZonedDateTime.now(la);
        System.out.println(zt);

    }

}
