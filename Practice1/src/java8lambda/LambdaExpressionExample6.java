package java8lambda;

import java.util.ArrayList;

public class LambdaExpressionExample6 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Name");
        list.add("Address");
        list.add("DOB");
        list.add("Phone No");

        list.forEach(n -> System.out.println(n));

        System.out.println("--------------");

        for (String string : list) {
            System.out.println(string);
        }
    }
}
