package module2_separateobjecttypes.practical.scill;

public enum CellStatus {
    WORK("работает"),
    AT_MAINTENANCE("в ремонте");

    private final String rusName;

    CellStatus(String rusName) {
        this.rusName = rusName;
    }

    public String getRusName() {
        return rusName;
    }
}
