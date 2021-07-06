package java8lambda;

//sort the employee class based on salary

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeLambda {

    private String eName;
    private int    eSalary;

    public EmployeeLambda(String eName, int eSalary) {
        super();
        this.eName = eName;
        this.eSalary = eSalary;
    }

    public static void main(String[] args) {

        EmployeeLambda e1 = new EmployeeLambda("ABC1", 28000);
        EmployeeLambda e2 = new EmployeeLambda("ABC2", 29000);
        EmployeeLambda e3 = new EmployeeLambda("ABC3", 38000);
        EmployeeLambda e4 = new EmployeeLambda("ABC4", 34000);
        EmployeeLambda e5 = new EmployeeLambda("ABC5", 20000);

        List<EmployeeLambda> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);

        Collections.sort(list, new Comparator<EmployeeLambda>() {

            @Override
            public int compare(EmployeeLambda o1, EmployeeLambda o2) {
                return -(o1.geteSalary() - o2.geteSalary());
            }
        });
        System.out.println("Without Lambda" + list.toString());

        Collections.sort(list, (o1, o2) -> -(o1.geteSalary() - o2.geteSalary()));
        // Collections.sort(list, (o1, o2) -> o1.geteSalary() > o2.geteSalary() ? -1 : o1.geteSalary() < o2.geteSalary() ? 1 : 0);
        System.out.println("With Lambda   " + list.toString());

        // Stream<IterateEmployee> list = l.stream().sorted(Comparator.comparingInt(IterateEmployee::geteSalary).reversed());
        // System.out.println(list.toString());

        List<EmployeeLambda> employeesSortedList1 = list.stream().sorted((o1, o2) -> (o2.geteSalary() - o1.geteSalary()))
                                                        .collect(Collectors.toList());
        System.out.println(employeesSortedList1);

        List<EmployeeLambda> salaryValue = list.stream().filter(salary -> salary.geteSalary() > 30000).collect(Collectors.toList());
        System.out.println(salaryValue);

        List<EmployeeLambda> employeesSortedList2 = list.stream().sorted(Comparator.comparing(EmployeeLambda::geteSalary))
                                                        .collect(Collectors.toList()); // ascending
        System.out.println(employeesSortedList2);
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
