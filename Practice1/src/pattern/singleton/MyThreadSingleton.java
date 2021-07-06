package pattern.singleton;

public class MyThreadSingleton {

    private static volatile MyThreadSingleton s = null;

    private MyThreadSingleton() {
        System.out.println("Constructor");
    }

    public static MyThreadSingleton Test() {
        if (s == null) {
            synchronized (MyThreadSingleton.class) {
                if (s == null) {
                    s = new MyThreadSingleton();
                }
            }
        }
        return s;
    }

    public void show() {
        System.out.println("Instance : " + s);
    }

    public static void main(String[] args) {
        MyThreadSingleton s1 = MyThreadSingleton.Test();
        s1.show();
        MyThreadSingleton s2 = MyThreadSingleton.Test();
        s2.show();

    }

}
