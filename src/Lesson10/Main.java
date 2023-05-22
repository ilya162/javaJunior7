package Lesson10;

public class Main {
    public static void main(String[] args) {


        Cat cat = new Cat();
        cat.voice();

        Dog dog = new Dog();
        dog.voice();

        dog.aport();
        Animal[] animals = new Animal[10];
        animals[0] = dog;
        animals[1] = cat;
        for (Animal animal : animals) {
            animal.voice();
            animals.getClass();
            animal.getName();

        }

        }

    }



