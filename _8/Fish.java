package AdvancedJavaOOP._8;

public class Fish extends Animal {
    private String species;
    public Fish(String species, double height, double weight) {
        super(height, weight);
        this.species=species;
    }
    public String getSpecies(){
        return species;
    }
    public void setSpecies(String species){
        this.species=species;
    }
    public void printFish(){
        System.out.println("Fish specie : "+species+ " ; Fish height : "+height+ " ; Fish weight : "+weight);
    }
    public static Object swimSpeedMetersPerSecond(Fish fish){
        double result = Fish.weight * 2;
        System.out.println("The fish is swimming at this speed : " +result);
        return result;


    }
}
