package no.uib.ii.inf102.f18.mandatory2;

import java.util.*;

/**
 * @author Torstein Almighty
 */
public class Calendar {
    Map<Date, Set<Event>> days = new HashMap<>();

    public void addEvent(Event event) {
        if (!this.days.containsKey(event.date)) {
            this.days.put(event.date, new HashSet<>());
        }
        this.days.get(event.date).add(event);
    }

    public Set<Event> eventsOnDate(Date date) {
        return this.days.get(date);
    }
}
