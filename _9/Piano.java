package AdvancedJavaOOP._9;

public class Piano extends Instrument implements Playable{
    public Piano(String instrumentName, String brand) {
        super(instrumentName, brand);
    }

    @Override
    public void play() {
        System.out.println("Il piano suona Jazz ");

    }
}
