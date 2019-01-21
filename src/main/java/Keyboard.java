public class Keyboard extends Instrument implements IPlay, ISell{

    public Keyboard(InstrumentFamilyType family, InstrumentColourType colour, InstrumentMakeType make, InstrumentModelType model, int price) {
        super(family, colour, make, model, price);
    }

    @Override
    public String play(Instrument instrument) {
        return "Keyboard playing";
    }


    @Override
    public double calculateMarkup() {
        return this.getPrice() * 2;
    }
}
