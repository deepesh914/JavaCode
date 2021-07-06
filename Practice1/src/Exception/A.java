package Exception;

import java.io.IOException;

import javax.xml.bind.JAXBException;

public class A {

    public static void main(String[] args) {
        try {
            // foo();
            Integer hack[] = new Integer[1];
            hack[0] = null;
            System.out.println(hack.length);
            // } catch (IOException | JAXBException e) {
            // // e = new Exception("");
            // // e.printStackTrace();
            // } catch (Exception e) {
            // // e = new Exception("");
            // // e.printStackTrace();
            // }
        } catch (NullPointerException e) {
            System.out.println("Hello");
        } catch (Exception e) {
            System.out.println("Hi");
        }
        System.out.println("Hacker earth");
    }

    public static void foo() throws IOException, JAXBException {

    }
}