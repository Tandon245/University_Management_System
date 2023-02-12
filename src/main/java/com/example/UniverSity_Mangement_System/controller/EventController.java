package com.example.UniverSity_Mangement_System.controller;

import com.example.UniverSity_Mangement_System.model.Event;

import com.example.UniverSity_Mangement_System.service.EventService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/UMS-Event")
public class EventController {
    private  final EventService eventService;


    public EventController(EventService eventService) {
        this.eventService = eventService;
    }
    @GetMapping("find-all-events")
  public  List<Event> findAllEvents(){
       return eventService.finAllEvents();
    }
    @PostMapping("add-Event")
    public  void addEvents(@RequestBody Event event) {
        eventService.addEvent(event);
    }
    @DeleteMapping("Delete-Event/id/{id}")
    public void deleteEvent(@PathVariable int id){
        eventService.deleteEvent(id);
    }

    @PutMapping("update-event/id/{id}")
    public  void updateEvent(@PathVariable int id, @RequestBody Event event){
        eventService.updateEvent(id,event);
    }
    @GetMapping("findById/id/{id}")
    public Event findEventById(@PathVariable int id){
        return eventService.findByEventId(id);
    }
}
