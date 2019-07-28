package Instruments;

import Interfaces.IPlay;

public abstract class Instrument implements IPlay {

    private String colour;
    private String type;

    public Instrument(String colour, String type) {
        this.colour = colour;
        this.type = type;
    }

    public String getColour() {
        return colour;
    }

    public String getType() {
        return type;
    }
}
