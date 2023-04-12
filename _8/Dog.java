package AdvancedJavaOOP._8;

public class Dog extends Animal {

    private String breed;


    public Dog(String breed, double height, double weight) {
        super(height, weight);
        this.breed=breed;

    }

    public String getBreed(){
        return breed;
    }
    public void setBreed(String breed){
        this.breed=breed;
    }
    public void printDog(){
        System.out.println("Dog breed : "+breed+ " ; height : " +height+ " cm. ; weight : "+weight+ " kg");
    }
    public static double runSpeedMetersPerSecond(Dog dog){
        double result = height *2;
        System.out.println("The dog is running at this speed : " +result);
        return result;

    }
}
