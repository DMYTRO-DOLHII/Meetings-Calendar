package com.example.MeetingsCalendar;

import java.util.ArrayList;
import java.util.List;

public class MeetingService {
    private List<Meeting> meetings = new ArrayList<>();

    public void addMeeting(Meeting meeting){
        meetings.add(meeting);
    }

    public void deleteMeeting(String id){

    }

}
