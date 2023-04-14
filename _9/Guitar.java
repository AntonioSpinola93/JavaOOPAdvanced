package AdvancedJavaOOP._9;

public class Guitar extends Instrument implements Playable {
    public Guitar(String instrumentName, String brand) {
        super(instrumentName, brand);
    }

    @Override
    public void play() {

        System.out.println("La chitarra suona un arpeggio ");

    }
}
