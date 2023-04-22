package AdvancedJavaOOP._8;

import java.awt.*;
import java.util.ArrayList;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1:
     *
     *
     * Create a class called "Dog" that extends the Animal class.
     *
     * Add a new field called "breed" to the Dog class.
     *
     * Write a constructor for the Dog class that takes in a breed, height, and weight as parameters, and passes the height and weight to the superclass constructor.
     *
     * Write getters and setters for the breed field.
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        Dog dog1 = new Dog("Shiba inu",39.5,15);
        Dog dog2 = new Dog("German Sheperd",60,39);
        dog1.printDog();
        dog2.printDog();

        // Your code here
    }

    /**
     * 2:
     *
     *
     * Create new classes called "Fish" and "Bird" that extends the Animal class.
     *
     * Add a new field called "species" to the Fish class and "wingSpan" to the Bird class.
     *
     * Also create constructors, getters and setters
     *
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        Bird bird1=new Bird("Falco pellegrino",1200,45,0.4);
        Fish fish1= new Fish("Cernia bruna",150,60);
        bird1.printBird();
        fish1.printFish();

    }


    /**
     * 3:
     *
     * In the dog class create a method called runSpeedMetersPerSecond() that returns the Dog's Height * 2
     * In the fish class create a method called swimSpeedMetersPerSecond() that returns the Fish's Weight * 2
     * In the bird class create a method called flySpeedMetersPerSecond() that returns the Bird's Wingspan * 4
     *
     * Create instances of each Animal: Dog, Fish and Bird. Fill the constructors with values of your choice
     * and print out which of the animals has the fastest movement speed in MetersPerSecond
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        Dog dog1 = new Dog("Shiba inu",39.5,15);
        Bird bird1=new Bird("Falco pellegrino",1200,45,0.4);
        Fish fish1= new Fish("Cernia bruna",150,60);
        System.out.println("The dog "+ dog1.getBreed() +" is running at this speed : " + dog1.runSpeedMetersPerSecond());
        System.out.println("The fish "+ fish1.getSpecies()+" is swimming at this speed : "+fish1.swimSpeedMetersPerSecond());
        System.out.println("The bird "+ bird1.getBirdBreed()+" is flying at this speed : "+bird1.flySpeedMetersPerSecond());
        ArrayList<Object> animalRace = new ArrayList<>();
        animalRace.add(dog1);
        animalRace.add(bird1);
        animalRace.add(fish1);
        double theFaster= Double.MIN_VALUE;
        String theWinner= " ";
        for (Object animal : animalRace){
            if (theFaster< dog1.runSpeedMetersPerSecond()){
                theFaster= dog1.runSpeedMetersPerSecond();
                theWinner= dog1.getBreed();

            }
            if(theFaster< bird1.flySpeedMetersPerSecond()){
                theFaster= bird1.flySpeedMetersPerSecond();
                theWinner=bird1.getBirdBreed();

            }
            if(theFaster<fish1.swimSpeedMetersPerSecond()){
                theFaster=fish1.swimSpeedMetersPerSecond();
                theWinner= fish1.getSpecies();

            }

        }

        System.out.println("The winner of the race is : "+theWinner+ " , reaching this speed in MetersPerSecond : "+theFaster);

    }
}
