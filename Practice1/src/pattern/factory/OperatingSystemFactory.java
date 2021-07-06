package pattern.factory;

public class OperatingSystemFactory {

    public InterfaceOS getInstance(String s) {

        if (s.equalsIgnoreCase("Windows"))
            return new ImplWindows();

        else if (s.equalsIgnoreCase("IOS"))
            return new ImplIOS();

        else
            return new ImplAndroid();

    }
}
