package com.example.UniverSity_Mangement_System.model;

import java.sql.Struct;

public class Event {


    private  int EventId;
    private  String EventName;
    private  String LocationOfEvent;
    private  String Date;
    private String StartTime;
    private String EndTime;

    public Event(int EventId, String EventName, String LocationOfEvent, String Date, String StartTime, String EndTime) {
        this.EventId = EventId;
        this.EventName = EventName;
        this.LocationOfEvent = LocationOfEvent;
        this.Date = Date;
        this.StartTime = StartTime;
        this.EndTime = EndTime;
    }

    public int getEventId() {
        return EventId;
    }

    public void setEventId(int eventId) {
        EventId = eventId;
    }

    public String getEventName() {
        return EventName;
    }

    public void setEventName(String eventName) {
        EventName = eventName;
    }

    public String getLocationOfEvent() {
        return LocationOfEvent;
    }

    public void setLocationOfEvent(String locationOfEvent) {
        LocationOfEvent = locationOfEvent;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getStartTime() {
        return StartTime;
    }

    public void setStartTime(String startTime) {
        StartTime = startTime;
    }

    public String getEndTime() {
        return EndTime;
    }

    public void setEndTime(String endTime) {
        EndTime = endTime;
    }

    @Override
    public String toString() {
        return "Event{" +
                "EventId=" + EventId +
                ", EventName='" + EventName + '\'' +
                ", LocationOfEvent='" + LocationOfEvent + '\'' +
                ", Date='" + Date + '\'' +
                ", StartTime='" + StartTime + '\'' +
                ", EndTime='" + EndTime + '\'' +
                '}';
    }
}
