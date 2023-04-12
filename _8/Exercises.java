package AdvancedJavaOOP._8;

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
        Dog dog1 = new Dog("Shiba inu",35,12);
        dog1.printDog();

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
        Bird bird1 = new Bird(1.5,75,2.0);
        Fish fish1= new Fish("Cernia Bruna",150,50);
        bird1.printBird();
        fish1.printFish();
        // Your code here
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
        Dog dog1 = new Dog("Shiba inu",35,12);
        Bird bird1 = new Bird(150,75,2.0);
        Fish fish1= new Fish("Cernia Bruna",150,50);

        //Dog.runSpeedMetersPerSecond(dog1);
        //Bird.flySpeedMetersPerSecond(bird1);
        //Fish.swimSpeedMetersPerSecond(fish1);
        ArrayList<Object> animals = new ArrayList<Object>();
        animals.add(dog1);
        animals.add(bird1);
        animals.add(fish1);
        double theFaster= Double.MIN_VALUE;
        double dogSpeed= (double) Dog.runSpeedMetersPerSecond(dog1);
        double birdSpeed= (double) Bird.flySpeedMetersPerSecond(bird1);
        double fishSpeed= (double) Fish.swimSpeedMetersPerSecond(fish1);

        for (int i=0;i< animals.size();i++){
            if( theFaster<dogSpeed){
                theFaster=dogSpeed;
            }
            if(theFaster<birdSpeed){
                theFaster=birdSpeed;
            }
            if(theFaster<fishSpeed){
                theFaster=fishSpeed;
            }
        }
        System.out.println("The faster animal reach the speed : "+theFaster);
    }
}
