package objectTypes_2.practic;

public class PostCell {
    private final Dimensions dimensions;
    private SellStatus sellStatus;
    private Shipment shipment;

    public PostCell(Dimensions dimensions) {
        this.dimensions = dimensions;
        sellStatus = SellStatus.WORK;
    }

    // Проверка, что ячейка свободна
    public boolean hasShipment() {
        return shipment != null;
    }

    // Проверка, что ячейка может принять груз
    public boolean canAcceptShipment(Shipment shipment) {
        if (hasShipment()) {
            return false;
        }
        if (sellStatus != SellStatus.WORK){
            return false;
        }
        return dimensions.canHold(shipment.dimensions()); // Проверка, что груз помещается в ячейку
    }

    // Размещение груза в ячейке
    public boolean putShipment(Shipment shipment) {
        if (!canAcceptShipment(shipment)) {
            System.out.println("Груз невозможно разместить в ячейке " + this);
            return false;
        }
        this.shipment = shipment;
        return true;
    }

    // Извлечение груза из ячейки
    public Shipment extractShipment() {
        var extractedShipment = this.shipment;
        this.shipment = null;
        return extractedShipment;
    }
}

