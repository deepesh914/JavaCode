package com.collection;

//sort the employee class based on salary

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Employee {

    private String eName;
    private int    eSalary;

    public Employee(String eName, int eSalary) {
        super();
        this.eName = eName;
        this.eSalary = eSalary;
    }

    // @Override
    // public int hashCode() {
    // final int prime = 31;
    // int result = 1;
    // result = prime * result + ((eName == null) ? 0 : eName.hashCode());
    // result = prime * result + eSalary;
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
    // Employee other = (Employee) obj;
    // if (eName == null) {
    // if (other.eName != null)
    // return false;
    // } else if (!eName.equals(other.eName))
    // return false;
    // if (eSalary != other.eSalary)
    // return false;
    // return true;
    // }

    public static void main(String[] args) {

        Employee e1 = new Employee("ABC1", 28000);
        Employee e2 = new Employee("ABC1", 28000);
        Employee e3 = new Employee("ABC3", 38000);
        Employee e4 = new Employee("ABC4", 34000);
        Employee e5 = new Employee("ABC5", 20000);

        List<Employee> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);

        Collections.sort(list, new Comparator<Employee>() {

            @Override
            public int compare(Employee o1, Employee o2) {
                return -(o1.geteSalary() - o2.geteSalary());
            }
        });
        System.out.println(list.toString());

        Set<Employee> set = new HashSet<>();
        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);
        System.out.println("Set: " + set); // w/o override hashcode and equals method

        List<Employee> employeesSortedList1 = list.stream().sorted((o1, o2) -> (int) (o2.geteSalary() - o1.geteSalary()))
                                                  .collect(Collectors.toList());
        System.out.println(employeesSortedList1);

        List<Employee> employeesSortedList2 = list.stream().sorted(Comparator.comparing(Employee::geteSalary)).collect(Collectors.toList()); // ascending
        System.out.println(employeesSortedList2);

        // Employee pe = list.stream()
        // .sorted((emp1, emp2) -> Integer.parseInt(emp2.geteSalary()).compareTo(Integer.parseInt(emp1.geteSalary())))
        // .skip(1).findFirst().orElse(null);

        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());
        System.out.println(e1.equals(e2));
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public int geteSalary() {
        return eSalary;
    }

    public void seteSalary(int eSalary) {
        this.eSalary = eSalary;
    }

    @Override
    public String toString() {
        return "Employee [eName=" + eName + ", eSalary=" + eSalary + "]";
    }

}
