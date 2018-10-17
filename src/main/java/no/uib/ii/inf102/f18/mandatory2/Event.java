package no.uib.ii.inf102.f18.mandatory2;

import java.util.Objects;

/**
 * @author You
 */
public class Event {
    final Date date;
    final String title;
    String description;

    public Event(Date date, String title) {
        this.date = date;
        this.title = title;
    }
}
