package com.example.UniverSity_Mangement_System.service;

import com.example.UniverSity_Mangement_System.model.Event;
import com.example.UniverSity_Mangement_System.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EventService{
    private static List<Event>events = new ArrayList<>();

    static {
        Event e1 = new Event(11,"BirthdayParty","Bhopal","1/1/2023","6:00pm","11:00pm");
        Event e2 = new Event(12,"AnniversaryParty","Delhi","10/1/2023","7:00pm","12:00am");
        Event e3 = new Event(13,"RingCeremonyParty","Jaipur","20/1/2023","8:00pm","11:30pm");
        events.add(e1);
        events.add(e2);
        events.add(e3);
    }

    public  List<Event> finAllEvents() {
        return events;
    }
    public  Event findByEventId(int id){
        for(Event event:events){
            if(event.getEventId()==id){
                return event;
            }

        }
        return null;
    }

    public  void addEvent(Event event){

        events.add(event);
    }

    public void deleteEvent(int id){
        for(Event event:events){
            if(event.getEventId()==id){
                events.remove(event);
            }
        }

    }
    public void  updateEvent(int id,Event newEvent){
        Event event =findByEventId(id);
        event.setEventId(newEvent.getEventId());
    }




}
