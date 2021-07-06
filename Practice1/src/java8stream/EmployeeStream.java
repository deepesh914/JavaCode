package java8stream;

//sort the employee class based on salary

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeStream {

    private String eName;
    private int    eSalary;

    public EmployeeStream(String eName, int eSalary) {
        super();
        this.eName = eName;
        this.eSalary = eSalary;
    }

    public static void main(String[] args) {

        EmployeeStream e1 = new EmployeeStream("ABC1", 28000);
        EmployeeStream e2 = new EmployeeStream("ABC2", 29000);
        EmployeeStream e3 = new EmployeeStream("ABC3", 38000);
        EmployeeStream e4 = new EmployeeStream("ABC4", 34000);
        EmployeeStream e5 = new EmployeeStream("ABC5", 20000);

        List<EmployeeStream> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);

        Collections.sort(list, new Comparator<EmployeeStream>() {

            @Override
            public int compare(EmployeeStream o1, EmployeeStream o2) {
                return -(o1.geteSalary() - o2.geteSalary());
            }
        });
        System.out.println(list.toString());

        // Stream<IterateEmployee> list = l.stream().sorted(Comparator.comparingInt(IterateEmployee::geteSalary).reversed());
        // System.out.println(list.toString());

        List<EmployeeStream> employeesSortedList1 = list.stream().sorted((o1, o2) -> (o2.geteSalary() - o1.geteSalary()))
                                                        .collect(Collectors.toList());
        System.out.println(employeesSortedList1);

        List<EmployeeStream> salaryValue = list.stream().filter(abc -> abc.geteSalary() > 30000).collect(Collectors.toList());
        System.out.println(salaryValue);

        List<EmployeeStream> employeesSortedList2 = list.stream().sorted(Comparator.comparing(EmployeeStream::geteSalary))
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
