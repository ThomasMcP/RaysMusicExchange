public class Keyboard extends Instrument implements IPlay{

    public Keyboard(InstrumentFamilyType family, InstrumentColourType colour, InstrumentMakeType make, InstrumentModelType model) {
        super(family, colour, make, model);
    }

    @Override
    public String play(Instrument instrument) {
        return "Keyboard playing";
    }
}
