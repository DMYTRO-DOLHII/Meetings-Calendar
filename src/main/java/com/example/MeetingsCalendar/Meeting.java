package com.example.MeetingsCalendar;

import java.time.Duration;
import java.time.ZonedDateTime;
import java.util.HashMap;
import java.util.Map;

public class Meeting {

    private ZonedDateTime startsAt;
    private Duration duration;
    private String id;

    Meeting(ZonedDateTime startAt, Duration duration, String id){
        this.startsAt = startAt;
        this.duration = duration;
        this.id = id;
    }

}
