package AdvancedJavaOOP._8;

public class Bird extends Animal {
    private double wingSpan;

    public Bird(double birdSpan, double height, double weight) {
        super(height, weight);
        this.wingSpan = birdSpan;
    }

    public double getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(double wingSpan) {
        this.wingSpan = wingSpan;
    }
    public void printBird(){
        System.out.println("WingSpan : "+ wingSpan+ " ; Bird height : "+height+ " ; Bird weight : "+weight);
    }

    public static Object flySpeedMetersPerSecond(Bird bird) {
        double result = bird.wingSpan * 4;
        System.out.println("The bird is flying at this speed : " + result);
        return result;

    }
}
