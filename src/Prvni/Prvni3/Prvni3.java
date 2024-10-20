package Prvni.Prvni3;

public class Prvni3 {
    public static void mainx() {

        Student s1 = new Student(20, 1500);
        s1.writeInfo();

        Accountant a1 = new Accountant(35, 20000);
        a1.writeInfo();

        Teacher t1 = new Teacher(40, 60000, 20);
        t1.writeInfo();


    }
}

class Person {
    public int age;
}

class Employee extends Person{
    public int salary;
}

class Student extends Person {
    public int scholarship;

    public Student(int age, int scholarship) {
        this.age = age;
        this.scholarship = scholarship;
    }

    public void writeInfo() {
        System.out.println("Student: Age = " + age + ", Scholarship = " + scholarship);
    }

}

class Accountant extends Employee {

    public Accountant(int age, int salary) {
        this.age = age;
        this.salary = salary;
    }

    public void writeInfo() {
        System.out.println("Accountant: Age = " + age + ", Salary = " + salary);
    }

}

class Teacher extends Employee {
    public int teachingTime;

    public Teacher(int age, int salary, int teachingTime) {
        this.age = age;
        this.salary = salary;
        this.teachingTime = teachingTime;
    }

    public void writeInfo() {
        System.out.println("Teacher: Age = " + age + ", Salary = " + salary + ", Teaching Time = " + teachingTime);
    }

}







