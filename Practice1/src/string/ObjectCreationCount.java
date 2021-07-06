package string;

public class ObjectCreationCount {

    static int count = 0;
    {
        count++;
    }

    public ObjectCreationCount() {

    }

    ObjectCreationCount(int i) {

    }

    ObjectCreationCount(double i) {

    }

    public static void main(String[] args) {
        ObjectCreationCount o1 = new ObjectCreationCount();
        ObjectCreationCount o2 = new ObjectCreationCount(10);
        ObjectCreationCount o3 = new ObjectCreationCount(10.5);
        System.out.println(count);
    }

}
