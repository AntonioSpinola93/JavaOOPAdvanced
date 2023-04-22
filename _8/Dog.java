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
        System.out.println("Dog breed : "+getBreed()+ " ; height : " +getHeight()+ " cm. ; weight : "+getWeight()+ " kg");
    }
    public double runSpeedMetersPerSecond() {
        double runSpeed = getHeight()*2;
        return runSpeed;

    }



}
