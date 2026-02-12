package module10_functionalprogramming2.practice;

import java.time.LocalDateTime;

public record ActivityEvent(
        String userId,
        EventType type,
        LocalDateTime timestamp
) {
}
