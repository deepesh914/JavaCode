package com.test.t1;

public class GenericsCode {

    public static void main(String[] args) {
        Car<String> c = new Car<>();
        Car c1 = c;

        System.out.println(c);
        System.out.println(c1);

    }

}


class Car<T> {
    void set(T t) {

    }
}
