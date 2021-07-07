package com.test.t2;

import java.util.HashSet;

public class Customer {

    String name;
    int    age;

    Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // @Override
    // public int hashCode() {
    // final int prime = 31;
    // int result = 1;
    // result = prime * result + age;
    // result = prime * result + ((name == null) ? 0 : name.hashCode());
    // return result;
    // }
    //
    // @Override
    // public boolean equals(Object obj) {
    // if (this == obj)
    // return true;
    // if (obj == null)
    // return false;
    // if (getClass() != obj.getClass())
    // return false;
    // Customer other = (Customer) obj;
    // if (age != other.age)
    // return false;
    // if (name == null) {
    // if (other.name != null)
    // return false;
    // } else if (!name.equals(other.name))
    // return false;
    // return true;
    // }

    public static void main(String[] args) {

        Customer c1 = new Customer("John", 20);
        Customer c2 = new Customer("John", 20);

        HashSet<Customer> customerSet = new HashSet<>();
        customerSet.add(c1);
        customerSet.add(c2);

        System.out.println("Size: " + customerSet.size());
        // 2 (w/o override hash-code and equals method)
        // 1 (with override hash-code and equals method)
        System.out.println(customerSet.toString());

    }

    @Override
    public String toString() {
        return "Customer [name=" + name + ", age=" + age + "]";
    }
}
