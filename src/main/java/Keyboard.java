public class Keyboard extends Instrument implements IPlay{

    public Keyboard(InstrumentFamilyType family, InstrumentColourType colour, InstrumentMakeType make, InstrumentModelType model, int price) {
        super(family, colour, make, model, price);
    }

    @Override
    public String play(Instrument instrument) {
        return "Keyboard playing";
    }
}
