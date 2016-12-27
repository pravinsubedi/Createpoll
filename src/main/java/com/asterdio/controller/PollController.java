package com.asterdio.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Admin on 12/27/2016.
 */
@RestController
public class PollController {
    @RequestMapping("/polls")
    public String getPolls(){
        return "all polls";
    }
}
