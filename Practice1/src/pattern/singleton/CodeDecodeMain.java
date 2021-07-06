package pattern.singleton;

public class CodeDecodeMain {

    public static void main(String[] args) {

        CodeDecodeSingleton cds = CodeDecodeSingleton.getInstance();
        cds.simpleMethod();

        CodeDecodeSingleton cds1 = CodeDecodeSingleton.getInstance();
        cds1.simpleMethod();

        CodeDecodeSingleton cds2 = CodeDecodeSingleton.getInstance();
        cds2.simpleMethod();

    }

}
