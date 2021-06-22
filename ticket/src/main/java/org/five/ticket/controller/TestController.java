package org.five.ticket.controller;

import java.util.Map;
import org.five.ticket.entity.display.DisplayEntity;
import org.five.ticket.entity.location.DisplayLocation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/ticket")
public class TestController {

    @Autowired
    @Qualifier(value = "movieDisplayMap")
    public Map<String, DisplayEntity> movieDisplayMap;


    @GetMapping("/test")
    public String hello()
    {
        movieDisplayMap.forEach((k,v)->{
            System.out.println(v);
        });
        return "hello";
    }


}
