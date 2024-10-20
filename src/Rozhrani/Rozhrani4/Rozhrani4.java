package Rozhrani.Rozhrani4;

public class Rozhrani4
{

    public static void mainx() {

        

        Animal[] animals = {new Dog("Rex"), new Cat("Snowball"), new Turtle("Tank")};

            Dog dog = (Dog) animals[0];
                Cat cat = (Cat) animals[1];

                /*if(animals[1].getClass() == Dog.class){
                    System.out.println("Dog sound: ");
                    dog.sound();
                }else if(animals[1].getClass() == Cat.class){
                    System.out.print("Cat sound: ");
                    cat.sound();
                }*/

                 System.out.print(animals[1].getClass() == Dog.class ? "Dog sound: " : (animals[1].getClass() == Cat.class ? "Cat sound: " : "Unknown animal")
                 );
                    if (animals[1].getClass() == Dog.class){
                        dog.sound();
                    }else{
                        cat.sound();
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
