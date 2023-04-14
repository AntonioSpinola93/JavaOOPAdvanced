package AdvancedJavaOOP._9;

public abstract class Instrument implements Playable {
    public String instrumentName;
    public String brand;

    public Instrument(String instrumentName, String brand) {
        this.instrumentName = instrumentName;
        this.brand = brand;
    }

    public String getInstrumentName() {
        return instrumentName;
    }

    public void setInstrumentName(String instrumentName) {
        this.instrumentName = instrumentName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
