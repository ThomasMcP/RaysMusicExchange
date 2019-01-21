public class Guitar extends Instrument implements IPlay, ISell {

    private GuitarType type;
    private int numberOfStrings;


    public Guitar(InstrumentFamilyType family, InstrumentColourType colour, InstrumentMakeType make, InstrumentModelType model, int price, int numberOfStrings, GuitarType type) {
        super(family, colour, make, model, price);
        this.numberOfStrings = numberOfStrings;
        this.type = type;
    }

    public GuitarType getType() {
        return type;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String play(Instrument instrument) {
        return "Guitar playing";
    }

    public double calculateMarkup() {
        int sellPrice = getPrice() * 2;
        return sellPrice - getPrice();
    }
}
