package pattern.singleton;

public class Test {

    private static Test t     = new Test();

    static int          count = 1;

    private Test() {
        System.out.println("Constructor");
    }

    public static Test getValue() {
        System.out.println("count : " + count++);
        return t;
    }

    public static void main(String[] args) {
        Test t1 = Test.getValue();
        System.out.println("-----------------");
        Test t2 = Test.getValue();
        System.out.println("-----------------");
        Test t3 = Test.getValue();
        System.out.println("-----------------");
        Test t4 = Test.getValue();
        System.out.println("-----------------");
    }
}
