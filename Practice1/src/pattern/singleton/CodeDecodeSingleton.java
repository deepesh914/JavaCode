package pattern.singleton;

public class CodeDecodeSingleton {

    private static CodeDecodeSingleton codeDecodeSingleton = new CodeDecodeSingleton();

    private CodeDecodeSingleton() {

    }

    // Only getter no setter
    public static CodeDecodeSingleton getInstance() {
        return codeDecodeSingleton;
    }

    public void simpleMethod() {
        System.out.println("Singleton Instance created: -> " + codeDecodeSingleton);
    }

}
