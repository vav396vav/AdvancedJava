package module6_advaced_collections.lesson4_treemap.schedule_of_meetings;

import java.time.LocalTime;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        MeetingSchedule schedule = new MeetingSchedule();

        schedule.addMeeting(LocalTime.of(9, 0), "Планирование");
        schedule.addMeeting(LocalTime.of(11, 30), "Обзор проекта");
        schedule.addMeeting(LocalTime.of(14, 0), "Клиентская встреча");
        schedule.addMeeting(LocalTime.of(16, 45), "Ретроспектива");

        // Следующая встреча после 10:00
        String next = schedule.getNextMeeting(LocalTime.of(10, 0));
        System.out.println("Следующая встреча после 10:00: " + next);

        // Встречи с 10:00 до 15:00 (включительно)
        Map<LocalTime, String> range = schedule.getMeetingsInRange(
                LocalTime.of(10, 0),
                LocalTime.of(15, 0)
        );

        for (var entry : range.entrySet()) {
            System.out.println(entry.getKey() + " — " + entry.getValue());
        }
    }
}