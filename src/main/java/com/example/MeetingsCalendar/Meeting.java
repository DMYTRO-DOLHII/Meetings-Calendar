package com.example.MeetingsCalendar;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Meeting {

    private Map<String, Map> meetings = new HashMap<>();
    private Map<String, String> description = new HashMap<>();



    public void addMeeting(String date, String time, String title, String task) {
        description.put("Time", time);
        description.put("Title", title);
        description.put("Task", task);
        meetings.put(date, description);
    }

    public void deleteMeeting(String key){
        meetings.remove(key);
    }

}
