public enum InstrumentColourType {
    RED("#f44242"),
    BLUE("#4156f4"),
    GREEN("#64f441");

    String colourCode;

    InstrumentColourType(String colourCode) {
        this.colourCode = colourCode;
    }

    public String getColourCode() {
        return colourCode;
    }
}
