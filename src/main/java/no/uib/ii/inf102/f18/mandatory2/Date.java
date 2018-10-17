package no.uib.ii.inf102.f18.mandatory2;

import java.util.Objects;

/**
 * @author You
 */
public final class Date {
    final Month month;
    final int year;
    final int day;

    public Date(Month month, int year, int day) {
        this.month = month;
        this.year = year;
        this.day = day;
    }
}
