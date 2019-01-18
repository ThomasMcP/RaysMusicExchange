public enum InstrumentFamilyType {
    STRINGS("Strings"),
    WOODWIND("Woodind"),
    BRASS("Brass"),
    KEYBOARD("Keyboard"),
    PERCUSSION("Percussion");

    String value;

    InstrumentFamilyType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
