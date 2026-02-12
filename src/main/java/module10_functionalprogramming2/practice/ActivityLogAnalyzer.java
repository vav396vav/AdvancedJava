package module10_functionalprogramming2.practice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class ActivityLogAnalyzer {

    public static void main(String[] args) {
        // === Шаг 1: Создаём тестовый журнал событий ===
        List<ActivityEvent> journal = List.of(
                new ActivityEvent("user_001", EventType.LOGIN, LocalDateTime.of(2026, 2, 1, 9, 15)),
                new ActivityEvent("user_001", EventType.VIEW_PROFILE, LocalDateTime.of(2026, 2, 1, 9, 20)),
                new ActivityEvent("user_002", EventType.LOGIN, LocalDateTime.of(2026, 2, 2, 10, 0)),
                new ActivityEvent("user_002", EventType.EDIT_PROFILE, LocalDateTime.of(2026, 2, 2, 10, 10)),
                new ActivityEvent("admin_01", EventType.LOGIN, LocalDateTime.of(2026, 2, 3, 8, 30)),
                new ActivityEvent("user_001", EventType.PAYMENT, LocalDateTime.of(2026, 2, 3, 14, 20)),
                new ActivityEvent("user_003", EventType.LOGIN, LocalDateTime.of(2026, 2, 4, 11, 5)),
                new ActivityEvent("user_003", EventType.PAYMENT, LocalDateTime.of(2026, 2, 4, 11, 15)),
                new ActivityEvent("user_002", EventType.LOGOUT, LocalDateTime.of(2026, 2, 4, 18, 0)),
                new ActivityEvent("user_001", EventType.EDIT_PROFILE, LocalDateTime.of(2026, 2, 5, 9, 30)),
                new ActivityEvent("user_004", EventType.LOGIN, LocalDateTime.of(2026, 2, 5, 10, 0)),
                new ActivityEvent("user_004", EventType.PAYMENT, LocalDateTime.of(2026, 2, 5, 10, 5)),
                new ActivityEvent("user_004", EventType.PAYMENT, LocalDateTime.of(2026, 2, 5, 10, 7)),
                new ActivityEvent("admin_01", EventType.EDIT_PROFILE, LocalDateTime.of(2026, 2, 5, 12, 0)),
                new ActivityEvent("user_001", EventType.LOGOUT, LocalDateTime.of(2026, 2, 5, 17, 45))
        );

        System.out.println("=== АНАЛИЗ ЖУРНАЛА АКТИВНОСТИ ===\n");

        // === Запрос 1: Активные пользователи за последние 3 дня ===
        LocalDate threeDaysAgo = LocalDate.now().minusDays(3);
        List<String> activeUsers = journal.stream()
                .filter(event -> event.timestamp().toLocalDate().isAfter(threeDaysAgo) ||
                        event.timestamp().toLocalDate().isEqual(threeDaysAgo))
                .map(ActivityEvent::userId)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Активные пользователи за последние 3 дня: " + activeUsers);

        // === Запрос 2: Количество платёжных операций ===
        long paymentCount = journal.stream()
                .filter(event -> event.type() == EventType.PAYMENT)
                .count();
        System.out.println("Всего платежей: " + paymentCount);

        // === Запрос 3: Последнее действие каждого пользователя ===
        Map<String, Optional<ActivityEvent>> lastActionsByUser = journal.stream()
                .collect(Collectors.groupingBy(
                        ActivityEvent::userId,
                        Collectors.maxBy(Comparator.comparing(ActivityEvent::timestamp))
                ));

        System.out.println("\nПоследние действия:");
        lastActionsByUser.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(entry -> {
                    String userId = entry.getKey();
                    Optional<ActivityEvent> lastEvent = entry.getValue();
                    if (lastEvent.isPresent()) {
                        ActivityEvent event = lastEvent.get();
                        System.out.printf("  %s: %s в %s%n",
                                userId, event.type(), event.timestamp());
                    }
                });

        // === Запрос 4: Редактировали профиль, но не совершали платёж ===
        // Получаем всех, кто редактировал
        List<String> editors = journal.stream()
                .filter(event -> event.type() == EventType.EDIT_PROFILE)
                .map(ActivityEvent::userId)
                .distinct()
                .collect(Collectors.toList());

        // Получаем всех, кто платил
        List<String> payers = journal.stream()
                .filter(event -> event.type() == EventType.PAYMENT)
                .map(ActivityEvent::userId)
                .distinct()
                .collect(Collectors.toList());

        // Исключаем плативших из редакторов
        List<String> editorsWithoutPayments = editors.stream()
                .filter(editor -> !payers.contains(editor))
                .sorted()
                .collect(Collectors.toList());

        System.out.println("\nРедактировали профиль без платежей: " + editorsWithoutPayments);

        // === Запрос 5: Хронология событий за вчера ===
        LocalDate yesterday = LocalDate.now().minusDays(1);
        List<String> yesterdayEvents = journal.stream()
                .filter(event -> event.timestamp().toLocalDate().isEqual(yesterday))
                .sorted(Comparator.comparing(ActivityEvent::timestamp))
                .map(event -> String.format("%s — %s — %s",
                        event.timestamp().toLocalDate(),
                        event.userId(),
                        event.type()))
                .collect(Collectors.toList());

        System.out.println("\nСобытия за вчера:");
        if (yesterdayEvents.isEmpty()) {
            System.out.println("  Нет событий");
        } else {
            yesterdayEvents.forEach(event -> System.out.println("  " + event));
        }
    }
}