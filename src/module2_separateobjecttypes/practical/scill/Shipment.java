package module2_separateobjecttypes.practical.scill;

import java.math.BigDecimal;

public record Shipment(
        Dimensions dimensions,
        BigDecimal weight,
        String description) {

}
