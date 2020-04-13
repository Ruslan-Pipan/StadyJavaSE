package tasks.shipsMultithreding.enums;

public enum ShipType {
    BANANNAS("Banannas"), CLOTHINGS("Clothings"), BOOKS("Books");

    private String type;

    ShipType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
