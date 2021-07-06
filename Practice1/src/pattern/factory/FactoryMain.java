package pattern.factory;

public class FactoryMain {

    public static void main(String[] args) {

        // OS os1 = new Android();
        // os1.spec();

        OperatingSystemFactory osf = new OperatingSystemFactory();
        InterfaceOS os = osf.getInstance("ios");
        os.spec();
    }

}
