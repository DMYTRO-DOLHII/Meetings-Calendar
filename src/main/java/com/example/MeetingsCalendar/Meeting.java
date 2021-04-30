package com.example.MeetingsCalendar;

import java.util.HashMap;
import java.util.Map;

public class Meeting {

    private Map<String, Map> meetings = new HashMap<>();
    private Map<String, String> description = new HashMap<>();



    public void addMeeting(String date, String time,String type, String title, String about) {
        description.put("Time", time);
        description.put("Type", type);
        description.put("Title", title);
        description.put("About", about);
        meetings.put(date, description);
    }

    public void deleteMeeting(String key){
        meetings.remove(key);
    }

    public Map<String, Map> getAllMeetings(){
        return meetings;
    }


}
