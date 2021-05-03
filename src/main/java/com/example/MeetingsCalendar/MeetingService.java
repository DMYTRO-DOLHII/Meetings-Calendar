package com.example.MeetingsCalendar;

import java.util.ArrayList;
import java.util.List;

public class MeetingService {
    private List<Meeting> meetings = new ArrayList<>();

    public List<Meeting> list(){
        return meetings;
    }


    public void addMeeting(Meeting meeting){
        meetings.add(meeting);
    }

    public void deleteMeeting(String id){
        for(int i = 0; i < meetings.size(); i++){
            if(meetings.get(i).getId() == id){
                meetings.remove(meetings.get(i));
            }
        }
    }

}
