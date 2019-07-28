package Instruments;

public class Guitar extends Instrument{

    private int numberOfStrings;

    public Guitar(String colour, String type, int numberOfStrings) {
        super(colour, type);
        this.numberOfStrings = numberOfStrings;
    }

    public String play() {
        return "Strum";
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }
}
