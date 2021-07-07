package com.test.t1;

import java.util.HashMap;
import java.util.Map;

public class Person {

    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int hashCode() {
        return 13;
    }

    @Override
    public String toString() {
        return "Person [firstName=" + firstName + ", lastName=" + lastName + "]";
    }

    public static void main(String[] args) {
        Person p1 = new Person("Deep", "G");
        Person p2 = new Person("Jay", "Gupta");

        Map<Person, String> m = new HashMap<>();
        m.put(p1, "Hi");
        m.put(p2, "Hello");
        System.out.println(m);

        m.put(new Person("Deep", "G"), "New Hi");
        System.out.println(m);

        System.out.println(m.size());
        System.out.println(m.get(new Person("Deep", "G")));
        System.out.println(m.get(p2));

    }

}
