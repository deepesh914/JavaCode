package Exception;

public class OwnException {

    public static void main(String[] args) {

        int age = 34;
        try {
            if (age > 60) {
                throw new TooOld("You are too old");
            } else if (age < 18) {
                throw new TooYoung("You are too young");
            } else {
                System.out.println("You can vote");
            }
        } catch (RuntimeException ex) {
            ex.printStackTrace();
        }
    }

}


class TooYoung extends RuntimeException {

    TooYoung(String s) {
        super(s);
    }

}


class TooOld extends RuntimeException {

    TooOld(String s) {
        super(s);
    }
}