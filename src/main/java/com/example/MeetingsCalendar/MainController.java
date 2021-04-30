package com.example.MeetingsCalendar;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
public class MainController {

    Meeting meetings = new Meeting();

    @GetMapping({"/", "/main"})
    public String main(Model model){
        return "main";
    }


    @RequestMapping(value="/", method = RequestMethod.POST)
    @ResponseBody
    public Map send(@RequestParam(required = false) String id){
        return meetings.getAllMeetings();
    }

    @RequestMapping(value="/send", method = RequestMethod.POST)
    @ResponseBody
    public String send(){
        meetings.addMeeting("31.12.1999", "19:00", "Audio", "Test", "About...");
        return "Check it!";
    }


}
