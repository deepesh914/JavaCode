package java8lambda;

interface Inter {
    public int square(int x);
}


public class SquareLambda {

    public static void main(String[] args) {

        Inter i = (x) -> x * x;
        System.out.println("3 square is : " + i.square(3));
        System.out.println("5 square is : " + i.square(5));
    }
}
