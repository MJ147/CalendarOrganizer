package com.mj147;

import java.util.Collections;
import java.util.List;

public class main {

    public static void main(String[] args) {

        Organizer organizer = new Organizer();

        organizer.addEvent("Spotkanie z Tomkiem", "2019-10-21T18:30", "2019-10-21T20:30" );
        organizer.addEvent("Urodziny dziadka", "2019-10-21T19:00", "2019-10-21T21:30" );
        organizer.addEvent("Wyjazd do Szwecji", "2019-05-03T08:00", "2019-05-10T18:30" );
        organizer.addEvent("Spotkanie z Anną", "2019-07-15T10:30", "2019-07-15T12:30" );
        organizer.addEvent("Spotkanie z Pawłem", "2019-10-15T13:00", "2019-10-21T16:00" );
        organizer.addEvent("Urodziny Roberta", "2019-04-24T14:30", "2019-04-24T15:30" );

        organizer.removeEvent("Urodziny Roberta");

        organizer.editEvent( "Spotkanie z Tomkiem", "2019-10-21T14:30", "2019-10-21T15:30" );
        organizer.editEvent( "Spotkanie z Jurkiem", "2022-12-24T18:30", "2019-10-21T19:30" );

        List<Event> eventList = organizer.getEventList();
        Collections.sort(eventList);

        for (Event event : eventList) {

            System.out.println(event);
        }
    }
}
