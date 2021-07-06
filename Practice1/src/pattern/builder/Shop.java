package pattern.builder;

public class Shop {

    public static void main(String[] args) {

        Phone p = new PhoneBuilder().setOs("OS").setRam(2).setBattery(3000).getPhone();
        System.out.println(p);
    }

}
