package Prvni.Prvni2;

public class Prvni2 {
    public static void mainx() {

        Student s1 = new Student(20, 1500);


        Accountant a1 = new Accountant(35, 20000);


        Teacher t1 = new Teacher(40, 60000, 20);



        s1.writeInfo();
        a1.writeInfo();
        t1.writeInfo();
    }
}

class Student  {
    public int age;
    public int scholarship;

    public Student(int age, int scholarship) {
        this.age = age;
        this.scholarship = scholarship;
    }

    public void writeInfo() {
        System.out.println("Student: Age = " + age + ", Scholarship = " + scholarship);
    }

}

class Accountant  {
    public int age;
    public int salary;

    public Accountant(int age, int salary) {
        this.age = age;
        this.salary = salary;
    }

    public void writeInfo() {
        System.out.println("Accountant: Age = " + age + ", Salary = " + salary);
    }

}

class Teacher {
    public int age;
    public int salary;
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







