package objectTypes_2.class_Record_4.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record Transaction(
        String id,
        BigDecimal amount,
        String fromAccountId,
        String toAccountId,
        LocalDateTime timestamp
) {
    public boolean isDebitTo(String accountId) {
        return toAccountId.equals(accountId);
    }
}
