package Rozhrani.Rozhrani1;

public class Rozhrani1 {

    public static void mainx() {

        /*Dog dog = new Dog("Rex");
        Cat cat = new Cat("Snowball");
        Turtle turtle = new Turtle("Tank");*/


        /*Animal[] animals = new Animal[Animal.countOfAnimals];
        animals[0] = dog;
        animals[1] = cat;
        animals[2] = turtle;*/

        Animal[] animals = {new Dog("Rex"), new Cat("Snowball"), new Turtle("Tank")};

        for(int i = 0; i < animals.length; i++){
            System.out.println(animals[i].getClass().getSimpleName() + ": " + animals[i].name);
        }
        System.out.println("Count of animals: " + Animal.countOfAnimals);


    }

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
