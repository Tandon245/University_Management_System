package com.example.UniverSity_Mangement_System.service;

import com.example.UniverSity_Mangement_System.model.Event;
import com.example.UniverSity_Mangement_System.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EventService {
private  static List<Event> events=new ArrayList<>();
static {
    events.add(new Event(1,"Music","Bhopal","14-02-2022","08:00AM","10:00PM"));
    events.add(new Event(2,"Dance","Indore","15-02-2022","08:00AM","10:00PM"));
    events.add(new Event(3,"Cricket","Jaipur","16-02-2022","08:00AM","10:00PM"));
    events.add(new Event(4,"Football","Udaiypur","17-02-2022","08:00AM","10:00PM"));
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
