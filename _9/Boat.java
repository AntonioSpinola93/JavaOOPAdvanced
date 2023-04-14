package AdvancedJavaOOP._9;

public class Boat implements Movable{
    @Override
    public void moveForward() {
        System.out.println("La barca Sta avanzando");
    }

    @Override
    public void moveBackward() {
        System.out.println("La barca Torna indietro");

    }
}
