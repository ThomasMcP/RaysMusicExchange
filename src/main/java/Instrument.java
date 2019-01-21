public abstract class Instrument {
    private InstrumentFamilyType family;
    private InstrumentColourType colour;
    private InstrumentMakeType make;
    private InstrumentModelType model;
    private int price;

    public Instrument(InstrumentFamilyType family, InstrumentColourType colour, InstrumentMakeType make, InstrumentModelType model, int price) {
        this.family = family;
        this.colour = colour;
        this.make = make;
        this.model = model;
        this.price = price;
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

    public int getPrice(){
        return price;
    }


}
