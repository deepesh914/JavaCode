package com.test.t1;

public class IBMDemo {

    int data = 50;

    public void Demo(int data) {
        data = data + 500;
    }

    public static void main(String[] args) {
        IBMDemo d = new IBMDemo();
        System.out.println(10 + 20 + "Add");
        System.out.println("Add" + 10 + 20);
        System.out.println(d.data);
        d.Demo(100);
        System.out.println(d.data);
    }

}
