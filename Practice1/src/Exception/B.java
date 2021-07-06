package Exception;

public class B {

    @SuppressWarnings("finally")
    public static void main(String[] args) {

        try {
            int i = 10 / 0;
            System.out.println("Try");
            return;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException Catch");
            return;
        } catch (Exception e) {
            System.out.println("Exception Catch");
            return;
        } finally {
            System.out.println("Finally");
            return;
        }

    }

}
