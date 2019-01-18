public class Guitar extends Instrument {

    private GuitarType type;
    private int numberOfStrings;


    public Guitar(InstrumentFamilyType family, InstrumentColourType colour, InstrumentMakeType make, InstrumentModelType model, int numberOfStrings, GuitarType type) {
        super(family, colour, make, model);
        this.numberOfStrings = numberOfStrings;
        this.type = type;
    }

    public GuitarType getType() {
        return type;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }
}
