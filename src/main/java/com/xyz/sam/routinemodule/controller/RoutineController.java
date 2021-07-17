package com.xyz.sam.routinemodule.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/routine")
public class RoutineController {

    @GetMapping("/pushmessage")
    public String pushMessage(){
        return "Push Message Sent, No Messaged in queue.";
    }
}
