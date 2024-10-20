package Rozhrani.Rozhrani3;

public class Rozhrani3
{

    public static void mainx() {



        Animal[] animals = {new Dog("Rex"), new Cat("Snowball"), new Turtle("Tank")};

            /*if(animals[0]. instanceof Dog){
            Dog dog = (Dog) animals[0];
            dog.sound();*/

                if(animals[0].getClass() == Dog.class){
                    Dog dog = (Dog) animals[0];
                    dog.sound();
        }
    }

        /*for(Animal an : animals){
            System.out.println(an.getClass().getSimpleName() + ": " + an.name + " " );
        }
        System.out.println("Count of animals: " + Animal.countOfAnimals);*/


    }



abstract class Animal{
    public String name;
    public static int countOfAnimals = 0;


    public Animal() {
        countOfAnimals++;
    }

    public Animal(String name) {
        this.name = name;
        countOfAnimals++;
    }
}

class Dog extends Animal{
    public boolean isPedigree;

    public Dog(String name) {
        super(name);
    }
        public void sound(){
            System.out.println("haf");
        }


}

class Cat extends Animal{
    public boolean isPedigree;

    public Cat(String name) {
        super(name);
    }

    public void sound(){
        System.out.println("mnau");
    }
}

class Turtle extends Animal{
    public int speed;

    public Turtle(String name) {
        super(name);
    }
}
