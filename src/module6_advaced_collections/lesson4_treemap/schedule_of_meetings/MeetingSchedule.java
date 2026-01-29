package module6_advaced_collections.lesson4_treemap.schedule_of_meetings;

import java.time.LocalTime;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class MeetingSchedule {

    private final TreeMap<LocalTime, String> meetings = new TreeMap<>();

    public void addMeeting(LocalTime startTime, String title) {
        meetings.put(startTime, title);
    }

    public String getNextMeeting(LocalTime afterTime) {
        // Получаем подмапу со временем строго ПОСЛЕ afterTime
        SortedMap<LocalTime, String> tail = meetings.tailMap(afterTime, false);
        if (tail.isEmpty()) {
            return null;
        }
        // Берём первую (самую раннюю) встречу из оставшихся
        LocalTime nextTime = tail.firstKey();
        return tail.get(nextTime);
    }

    public Map<LocalTime, String> getMeetingsInRange(LocalTime from, LocalTime to) {
        // Возвращаем подмапу с включёнными границами [from, to]
        return meetings.subMap(from, true, to, true);
    }
}