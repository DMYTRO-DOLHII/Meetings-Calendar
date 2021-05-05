package com.example.MeetingsCalendar;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Controller
public class MainController {

    MeetingService meetingService = new MeetingService();

    @GetMapping({"/", "/main"})
    public String main(Model model) {
        return "main";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    @ResponseBody
    public List<Meeting> meetings() {
        return meetingService.list();
    }

    @GetMapping("/add-meeting")
    public String addMeeting(Model model) {
        return "add-meeting";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public void add(@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) ZonedDateTime timeStart,
                      @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) ZonedDateTime timeEnd,
                     @RequestParam String description) {

        Meeting meeting = Meeting
                .newBuilder()
                .id(UUID.randomUUID().toString())
                .startsAt(timeStart)
                .duration(Duration.between(timeStart, timeEnd))
                .description(description)
                .build();

        meetingService.addMeeting(meeting);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public void delete(@RequestParam String id) {
        meetingService.deleteMeeting(id);
    }

}
