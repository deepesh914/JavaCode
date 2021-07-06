package string;

class Phone {
    public Phone getMsg() {
        System.out.println("phone...");
        return new Phone();
    }
}


public class Samsung extends Phone {
    @Override
    public Samsung getMsg() {
        System.out.println("samsung...");
        return new Samsung();
    }

    public static void main(String[] args) {
        Phone p = new Samsung();
        p.getMsg();

        // final int a = 6;
        // int b = 7;
        // b = a;
        // System.out.println(a + " : " + b);
    }

}
