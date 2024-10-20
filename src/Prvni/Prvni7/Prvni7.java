package Prvni.Prvni7;

public class Prvni7 {
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

    /*public Person() {
    }*/

    public Person(int age) {
        this.age = age;
    }

    public void writeInfo() {
        System.out.print("Age = " + age);
    }

    public void info() {
        System.out.println("Age = " + age);
    }
}

class Employee extends Person{
    public int salary;

    /*public Employee() {
    }*/

    public Employee(int age, int salary) {
        super(age);
        this.salary = salary;
    }

    @Override
    public void writeInfo() {
        super.writeInfo();
        System.out.print(", Salary = " + salary);
    }
}

class Student extends Person {
    public int scholarship;

    public Student(int age) {
        super(age);
    }

    public Student(int age, int scholarship) {
        super(age);
        this.scholarship = scholarship;
    }

    public void writeInfo() {
        super.writeInfo();
        System.out.println(", Scholarship = " + scholarship);
        info();


    }

}

class Accountant extends Employee {

    public Accountant(int age, int salary) {
        super(age, salary);
    }

    public void writeInfo() {
        super.writeInfo();
        System.out.println();
    }

}

class Teacher extends Employee {
    public int teachingTime;

    public Teacher(int age, int salary, int teachingTime) {
        super(age, salary);
        this.teachingTime = teachingTime;
    }

    public void writeInfo() {
        super.writeInfo();
        System.out.println(", Teaching Time = " + teachingTime);
    }

}







