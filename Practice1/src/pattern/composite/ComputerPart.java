package pattern.composite;

import java.util.ArrayList;
import java.util.List;

interface Component {
    void showPrice();
}


class Leaf implements Component {

    int    price;
    String name;

    public Leaf(int price, String name) {
        super();
        this.price = price;
        this.name = name;
    }

    @Override
    public void showPrice() {
        System.out.println(name + " -> " + price);
    }

}


class Composite implements Component {

    String          name;
    List<Component> components = new ArrayList<Component>();

    public Composite(String name) {
        super();
        this.name = name;
    }

    public void addComponent(Component com) {
        components.add(com);
    }

    @Override
    public void showPrice() {
        System.out.println(name);
        for (Component c : components) {
            c.showPrice();
        }
    }

}