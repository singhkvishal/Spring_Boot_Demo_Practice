package com.example.Spring_Boot_Demo_Practice.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    //expose "/" that return the Hello World
    @GetMapping("/")
    public String HelloWorld(){
        return "Hello World";
    }

    //Expose the new End point

    @GetMapping("/workout")
    public String WorkOut(){
        return  "Run a hard 5k!";
    }

    //Inject Properties for
    @Value("${team.name}")
    private String teamName;

    @Value("${team.manager}")
    private String teamManager;

    //Expose the team info

    @GetMapping("/teaminfo")
    public String GetTeamInfo(){
        return "Team name:" + teamName + " Team manager name : "+teamManager;
    }
}
