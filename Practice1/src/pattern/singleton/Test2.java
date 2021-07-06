package pattern.singleton;

public class Test2 {

    private static Test2 t = new Test2();

    private Test2() {
        System.out.println("Constructor");
    }

    public static Test2 getTest() {
        return t;
    }

    public static void main(String[] args) {
        Test2 t1 = t.getTest();
        Test2 t2 = t.getTest();
        Test2 t3 = t.getTest();
        Test2 t4 = t.getTest();
    }

}
