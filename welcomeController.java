package com.example.queation1spring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcomeController {

    @RequestMapping(value = "/hey", method = RequestMethod.GET)
    public String Heymessage() {

        return "hey from spring";
    }


    @RequestMapping(value = "/bye", method = RequestMethod.GET)
    public String Bye() {

        return "Bye ";
    }

    @RequestMapping(value = "/check/status", method = RequestMethod.GET)
    public String ok() {

        return "every thing is ok ";
    }

    @RequestMapping(value = "/health", method = RequestMethod.GET)
    public String health() {

        return "Server health is up and running ";
    }
}



