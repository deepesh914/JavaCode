package Interface;

public class Example {

    static {
        System.out.println("Static method");
    }

    public static void main(String[] args) {
        Example.main();
        System.out.println("Main method");

    }

    public static void main() {
        System.out.println("Main Static method");
    }
}
