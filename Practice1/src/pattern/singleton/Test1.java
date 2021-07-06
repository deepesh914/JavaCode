package pattern.singleton;

public class Test1 {

    private static Test1 t;
    static int           count = 0;

    private Test1() {
        System.out.println("Constructor");
    }

    public static synchronized Test1 getValue() {
        if (t == null) {
            t = new Test1();
        }
        System.out.println(count++);
        return t;
    }

    public static void main(String[] args) {
        Test1 t1 = Test1.getValue();
        Test1 t2 = Test1.getValue();
        Test1 t3 = Test1.getValue();
        Test1 t4 = Test1.getValue();
        System.out.println(count);
    }

}
