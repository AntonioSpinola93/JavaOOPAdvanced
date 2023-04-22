package AdvancedJavaOOP._8;

public class Bird extends Animal {
    private String birdBreed;
    private double wingSpan;

    public Bird(String birdBreed , double wingSpan, double height, double weight) {
        super(height, weight);
        this.birdBreed= birdBreed;
        this.wingSpan = wingSpan;
    }

    public String getBirdBreed() {
        return birdBreed;
    }

    public void setBirdBreed(String birdBreed) {
        this.birdBreed = birdBreed;
    }

    public double getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(double wingSpan) {
        this.wingSpan = wingSpan;
    }
    public void printBird(){
        System.out.println("BirdBreed : "+ getBirdBreed()+ " WingSpan : "+getWingSpan()+ " ; Bird height : "+getHeight()+ " ; Bird weight : "+getWeight());
    }
    public double flySpeedMetersPerSecond(){
        double flySpeed= getWingSpan()*4;
        return flySpeed;
    }


}
