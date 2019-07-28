package Instruments;

public class Trumpet extends Instrument {

    private int numberOfValves;

    public Trumpet(String colour, String type, int numberOfValves) {
        super(colour, type);
        this.numberOfValves = numberOfValves;
    }

    public int getNumberOfValves() {
        return numberOfValves;
    }

    public String play() {
        return "Tadaaaa";
    }
}
