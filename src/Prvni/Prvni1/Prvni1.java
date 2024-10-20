package Prvni.Prvni1;

public class Prvni1 {
    public static void mainx() {

        Student s1 = new Student();
        s1.age = 20;
        s1.scholarship = 1500;

        Accountant a1 = new Accountant();
        a1.age = 35;
        a1.salary = 20000;

        Teacher t1 = new Teacher();
        t1.age = 40;
        t1.salary = 60000;
        t1.teachingTime = 20;


        s1.writeInfo();
        a1.writeInfo();
        t1.writeInfo();
    }
}

class Student  {
    public int age;
    public int scholarship;

    public void writeInfo() {
        System.out.println("Student: Age = " + age + ", Scholarship = " + scholarship);
    }

}

class Accountant  {
    public int age;
    public int salary;

    public void writeInfo() {
        System.out.println("Accountant: Age = " + age + ", Salary = " + salary);
    }

}

class Teacher {
    public int age;
    public int salary;
    public int teachingTime;

    public void writeInfo() {
        System.out.println("Teacher: Age = " + age + ", Salary = " + salary + ", Teaching Time = " + teachingTime);
    }

}







