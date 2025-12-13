package objectTypes_2.practic;

import java.math.BigDecimal;

public record Shipment(Dimensions dimensions,
                       String destination,
                       BigDecimal weight
) {
}
