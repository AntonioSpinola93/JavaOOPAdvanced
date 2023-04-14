package AdvancedJavaOOP._9;

public class Car implements Movable{
    @Override
    public void moveForward() {
        System.out.println("L' auto sta accelerando");

    }

    @Override
    public void moveBackward() {
        System.out.println("L' auto mette Retromarcia");

    }
}
