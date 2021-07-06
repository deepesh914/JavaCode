package java8lambda;

public class RunnableLambda {

    public static void main(String[] args) {

        Runnable r = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Child Thread: " + i);
            }
        };
        Thread t = new Thread(r);
        t.start();

        for (int j = 0; j < 5; j++) {
            System.out.println("Main Thread: " + j);
        }

    }

}
