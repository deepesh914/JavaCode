package com.Collection;

import java.util.HashSet;

public class HashSetDuplicate {

    public static void main(String[] args) {
        Employee e1 = new Employee("Deep", 123);
        Employee e2 = new Employee("Deep", 123);
        Employee e3 = new Employee("Deep", 1234);
        Employee e4 = new Employee("DeepeshGp", 123);

        HashSet<Employee> set = new HashSet<Employee>();
        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);

        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());
        System.out.println(e3.hashCode());
        System.out.println(e4.hashCode());
        System.out.println(e1.equals(e2));
        System.out.println(e2.equals(e3));
        System.out.println(e2.equals(e4));

        // System.out.println(set);
        for (Employee e : set) {
            System.out.println(e.name + " " + e.id);
        }
        System.out.println(set.size());
    }

}


class Employee {
    String name;
    int    id;

    public Employee(String name, int id) {
        super();
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

}