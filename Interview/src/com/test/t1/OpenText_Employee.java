package com.test.t1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class OpenText_Employee {

    private int    id;
    private String name;
    private String dept;
    private double salary;

    public OpenText_Employee(int id, String name, String dept, double salary) {
        super();
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "EmployeeClass [id=" + id + ", name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
    }

    public static void main(String[] args) {

        OpenText_Employee e1 = new OpenText_Employee(1, "ABC1", "HR", 30000.0);
        OpenText_Employee e2 = new OpenText_Employee(2, "ABC2", "JAVA", 35000.0);
        OpenText_Employee e3 = new OpenText_Employee(3, "ABC3", "HR", 25000.0);
        OpenText_Employee e4 = new OpenText_Employee(4, "ABC4", "IT", 40000.0);
        OpenText_Employee e5 = new OpenText_Employee(5, "ABC5", "JAVA", 45000.0);
        OpenText_Employee e6 = new OpenText_Employee(6, "ABC6", "MGMT", 50000.0);

        List<OpenText_Employee> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);
        list.add(e6);

        List<OpenText_Employee> l = list.stream().filter(emp -> emp.getSalary() > 30000.0).collect(Collectors.toList());
        System.out.println("More than 30k salary: " + l);

        List<OpenText_Employee> nameList = l.stream().sorted((emp1, emp2) -> emp2.getName().compareTo(emp1.getName()))
                                        .collect(Collectors.toList());
        System.out.println("Employee Name more than 30k salary: " + nameList);

        // Combination of above two scenarios
        List<OpenText_Employee> l1 = list.stream().filter(emp -> emp.getSalary() > 30000.0)
                                     .sorted((emp1, emp2) -> emp2.getName().compareTo(emp1.getName())).collect(Collectors.toList());
        System.out.println("Employee class object more than 30k salary: " + l1);

        List<String> l2 = list.stream().filter(emp -> emp.getSalary() > 30000.0)
                              .sorted((emp1, emp2) -> emp2.getName().compareTo(emp1.getName())).map(OpenText_Employee::getName)
                              .collect(Collectors.toList());
        System.out.println("Employee Name more than 30k salary: " + l2);

        // Count of employees working in specific department
        HashMap<String, Integer> map = new HashMap<>();
        Iterator<OpenText_Employee> itr = list.listIterator();
        while (itr.hasNext()) {
            OpenText_Employee e = itr.next();
            if (map.containsKey(e.getDept()))
                map.put(e.getDept(), map.get(e.getDept()) + 1);
            else
                map.put(e.getDept(), 1);
        }
        System.out.println("The count of employees working in specific department: " + map);
    }
}
