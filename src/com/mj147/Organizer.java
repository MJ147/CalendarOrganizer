package com.mj147;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Organizer {

    private List<Event> eventList = new ArrayList<>();

    public List<Event> getEventList() {
        return eventList;
    }

    public void addEvent(String name, String startDateTime, String endDateTime) {

        Event event = new Event();

        event.setName(name);
        event.setStartDateTime(LocalDateTime.parse(startDateTime));
        event.setEndDateTime(LocalDateTime.parse(endDateTime));

        eventList.add(event);
    }

    public void removeEvent(String name) {

        int indexToRemove = -1;

        for ( Event event : eventList ) {
            if (event.getName().equals(name)) {
                indexToRemove = eventList.indexOf(event);
            }
        }

        if ( indexToRemove >= 0) {
            eventList.remove(indexToRemove);
        } else {
            System.out.println("Nie znaleziono wydarzenia: '" + name + "'");
        }

    }

    public void editEvent(String name, String startDateTime, String endDateTime) {

        int indexToRemove = -1;

        for ( Event event : eventList ) {
            if (event.getName().equals(name)) {
                indexToRemove = eventList.indexOf(event);
            }

        }

        if ( indexToRemove >= 0) {
            eventList.get(indexToRemove).setName(name);
            eventList.get(indexToRemove).setStartDateTime(LocalDateTime.parse(startDateTime));
            eventList.get(indexToRemove).setEndDateTime(LocalDateTime.parse(endDateTime));

        } else {
            System.out.println("Nie znaleziono wydarzenia: '" + name + "'");
        }

    }

}
