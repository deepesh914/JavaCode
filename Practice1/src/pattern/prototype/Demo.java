package pattern.prototype;

public class Demo {

    public static void main(String[] args) throws CloneNotSupportedException {

        BookShop bs = new BookShop();
        bs.setShopName("GuptaJi");
        bs.loadData();

        BookShop bs1 = bs.clone();
        bs1.setShopName("SharmaJi");

        bs.getBooks().remove(2);

        System.out.println(bs);
        System.out.println(bs1);
    }
}
