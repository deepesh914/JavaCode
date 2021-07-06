package string;

//Driver class 
public class ImmutableClass {

    public static void main(String args[]) {

        Student s = new Student("ABC", 101);
        Student s1 = new Student("Ram", 102);
        System.out.println(s.getName());
        System.out.println(s.getRegNo());
        System.out.println(s1.getName());
        System.out.println(s1.getRegNo());
        System.out.println(s.getAge());
    }
}


final class Student {

    final String name;
    final int    regNo;
    int          age;

    public Student(String name, int regNo) {
        this.name = name;
        this.regNo = regNo;
    }

    public String getName() {
        return name;
    }

    public int getRegNo() {
        return regNo;
    }

    public int getAge() {
        return age;
    }
}
