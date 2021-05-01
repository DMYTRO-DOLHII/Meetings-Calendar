package com.example.MeetingsCalendar;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
public class MainController {

    @GetMapping({"/", "/main"})
    public String main(Model model){
        return "main";
    }

    @GetMapping("/add-meeting")
    public String addMeeting(Model model){
        return "add-meeting";
    }


    @RequestMapping(value="/", method = RequestMethod.POST)
    @ResponseBody
    public Map send(@RequestParam(required = false) String id){

    }

    @RequestMapping(value="/send", method = RequestMethod.POST)
    @ResponseBody
    public String send(){

    }

    @RequestMapping(value="/delete", method = RequestMethod.POST)
    public void delete(@RequestParam int id){

    }

}
