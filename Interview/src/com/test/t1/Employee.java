package com.test.t1;

//sort the employee class based on salary

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {

    private String  eName;
    private Integer eSalary;

    public Employee(String eName, Integer eSalary) {
        super();
        this.eName = eName;
        this.eSalary = eSalary;
    }

    public static void main(String[] args) {

        Employee e1 = new Employee("ABC1", 28000);
        Employee e2 = new Employee("ABC2", 29000);
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

        // Stream<IterateEmployee> list = l.stream().sorted(Comparator.comparingInt(IterateEmployee::geteSalary).reversed());
        // System.out.println(list.toString());

        List<Employee> employeesSortedList1 = list.stream().sorted((o1, o2) -> (o2.geteSalary() - o1.geteSalary()))
                                                  .collect(Collectors.toList());
        System.out.println("Sorted salary in descending order: " + employeesSortedList1);

        List<Employee> salaryValue = list.stream().filter(abc -> abc.geteSalary() > 30000).collect(Collectors.toList());
        System.out.println(salaryValue);

        List<Employee> employeesSortedList2 = list.stream().sorted(Comparator.comparing(Employee::geteSalary)).collect(Collectors.toList()); // ascending
        System.out.println("Sorted salary in ascending order: " + employeesSortedList2);

        // Second Highest salary
        Employee emp = list.stream().sorted(Comparator.comparing(Employee::geteSalary).reversed()).skip(1).findFirst().orElse(null);
        System.out.println("Second Highest: " + emp.geteSalary() + " and Name: " + emp.geteName());

        // Works only with Integer rather then using int. Not working
        // Employee oe1 = list.stream().sorted((emp1, emp2) -> compare(emp2.geteSalary(),
        // emp1.geteSalary())).skip(1).findFirst().orElse(null);

        // Works only with Integer rather then using int.
        Employee pe = list.stream().sorted((emp1, emp2) -> emp2.geteSalary().compareTo(emp1.geteSalary())).skip(1).findFirst().orElse(null);
        System.out.println(pe.toString());

    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public Integer geteSalary() {
        return eSalary;
    }

    public void seteSalary(Integer eSalary) {
        this.eSalary = eSalary;
    }

    @Override
    public String toString() {
        return "Employee [eName=" + eName + ", eSalary=" + eSalary + "]";
    }

}
