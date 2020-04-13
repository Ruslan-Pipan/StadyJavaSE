package tasks.shipsMultithreding.enums;

public enum ShipSize {
    TEN(10), FIFTY(50), HUNDRET(100);
    private int size;
    ShipSize(int size) {
        this.size = size;
    }
    public int getSize() {
        return size;
    }
}
