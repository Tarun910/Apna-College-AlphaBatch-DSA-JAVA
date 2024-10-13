package OOPS;

public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Tarun");
        Student s3 = new Student(123);
    }
}

class Student {
    String name;
    int roll;

    // constructor -> 3 Types
    // 1. Non-parameterized
    // 2. Parameterized
    // 3. Copy Constructor

    Student() {
        System.out.println("Constructor is called!");
    }

    Student(String name) {
        this.name = name;
    }

    Student(int roll) {
        this.roll = roll;
    }
}