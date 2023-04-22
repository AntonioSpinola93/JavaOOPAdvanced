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
        System.out.println("Fish specie : "+getSpecies()+ " ; Fish height : "+getHeight()+ " ; Fish weight : "+getWeight());
    }
    public double swimSpeedMetersPerSecond() {
        double swimSpeed = getWeight()*2;
        return swimSpeed;

    }


    }

