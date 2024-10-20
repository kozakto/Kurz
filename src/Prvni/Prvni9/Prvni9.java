package Prvni.Prvni9;

public class Prvni9 {
    public static void mainx() {

        Student s1 = new Student(20, 1500);
        s1.writeInfo();
        //Student s2 = new Student();
        //s2.writeInfo();
        //System.out.println(s1.getAge());


        Accountant a1 = new Accountant(35, 20000);
        a1.writeInfo();

        Teacher t1 = new Teacher(40, 60000, 20);
        t1.writeInfo();
        t1.getSalary();
        //t1.setTeachingTime(42);


    }
}

class Person {
    private int age;

    protected static int count = 0;

    public Person() {
        count++;
    }

    public Person(int age) {
        this.age = age;
        count++;
    }

    public void writeInfo() {
        System.out.print("Age = " + age + ", count: " + count);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static int getCount() {
        return count;
    }


    /*public void info() {
        System.out.println("Age = " + age);
    }*/
}

class Employee extends Person{
    private int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

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

    public Student() {
    }

    /*public Student(int age) {
        super(age);
    }*/

    public Student(int age, int scholarship) {
        super(age);
        this.scholarship = scholarship;
    }

    public void writeInfo() {
        super.writeInfo();
        System.out.println(", Scholarship = " + scholarship);
        //info();


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
    private int teachingTime;

    public Teacher(int age, int salary, int teachingTime) {
        super(age, salary);
        setTeachingTime(teachingTime);

    }

    public int getTeachingTime() {
        return teachingTime;
    }

    public void setTeachingTime(int teachingTime) {

        if(teachingTime > 40){
            System.out.println("Teaching time can't be bigger than 40");
        }else{

        }
        this.teachingTime = teachingTime;
    }

    public void writeInfo() {
        super.writeInfo();
        System.out.println(", Teaching Time = " + teachingTime);
    }

}







