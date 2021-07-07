package com.test.t2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Veri2_D2 {

    public static void main(String[] args) {

        Employee e1 = new Employee("ABC1", 25000);
        Employee e2 = new Employee("ABC2", 30000);
        Employee e3 = new Employee("ABC3", 45000);
        Employee e4 = new Employee("ABC4", 15000);
        Employee e5 = new Employee("ABC5", 35000);

        List<Employee> l = new ArrayList<>();
        l.add(e1);
        l.add(e2);
        l.add(e3);
        l.add(e4);
        l.add(e5);

        Employee max = Collections.max(l, (emp1, emp2) -> -emp1.getSalary().compareTo(emp2.getSalary()));

        List<Employee> list = l.stream().sorted((emp1, emp2) -> -emp1.getSalary().compareTo(emp2.getSalary())).collect(Collectors.toList());
        // System.out.println(list);

        Iterator<Employee> itr = list.listIterator();
        while (itr.hasNext()) {
            Employee ea = itr.next();
            if (ea.getSalary() < max.getSalary()) {
                System.out.println(ea.getName() + " " + ea.getSalary());

            }
        }

    }
}


class Employee {
    private String  name;
    private Integer salary;

    public Employee(String name, Integer salary) {
        super();
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public Integer getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", salary=" + salary + "]";
    }

}