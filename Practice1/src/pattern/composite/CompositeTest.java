package pattern.composite;

public class CompositeTest {

    public static void main(String[] args) {

        Component hd = new Leaf(4000, "HDD");
        Component mouse = new Leaf(500, "Mouse");
        Component monitor = new Leaf(8000, "Monitor");
        Component ram = new Leaf(3000, "RAM");
        Component cpu = new Leaf(7000, "CPU");

        Composite ph = new Composite("Peripheral");
        Composite cabinet = new Composite("Cabinet");
        Composite motherBoard = new Composite("MotherBoard");
        Composite computer = new Composite("Computer");

        motherBoard.addComponent(cpu);
        motherBoard.addComponent(ram);

        ph.addComponent(mouse);
        ph.addComponent(monitor);

        cabinet.addComponent(hd);
        cabinet.addComponent(motherBoard);

        computer.addComponent(cabinet);
        computer.addComponent(ph);

        // ram.showPrice();
        // ph.showPrice();
        computer.showPrice();
    }

}
