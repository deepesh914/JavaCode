package java8lambda;

@FunctionalInterface
interface Sayable {
    public String say(String name);
}


public class LambdaExpressionExample3 {

    public static void main(String[] args) {

        Sayable s = (name) -> "Hello " + name;
        System.out.println(s.say("sonu"));

        Sayable s1 = (name) -> "Hello " + name;
        System.out.println(s1.say("Titu"));
    }

}
