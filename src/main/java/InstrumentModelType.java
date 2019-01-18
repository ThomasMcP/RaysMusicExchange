public enum InstrumentModelType {

    STRATOCASTER("HA3455T"),
    SELMERPARISMARKIV("SPMRK4"),
    KEILWORTHSX90R("KWSX90");

    String modelNumber;

    InstrumentModelType(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getModelNumber() {
        return modelNumber;
    }
}
