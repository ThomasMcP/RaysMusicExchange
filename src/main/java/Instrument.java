public abstract class Instrument {
    private InstrumentFamilyType family;
    private InstrumentColourType colour;
    private InstrumentMakeType make;
    private InstrumentModelType model;

    public Instrument(InstrumentFamilyType family, InstrumentColourType colour, InstrumentMakeType make, InstrumentModelType model) {
        this.family = family;
        this.colour = colour;
        this.make = make;
        this.model = model;
    }

    public InstrumentFamilyType getFamily() {
        return family;
    }

    public InstrumentColourType getColour() {
        return colour;
    }

    public InstrumentMakeType getMake() {
        return make;
    }

    public InstrumentModelType getModel() {
        return model;
    }
}
