package org.five.ticket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/ticket")
public class TestController {

    @GetMapping("/test")
    public String hello()
    {
        return "hello";
    }


}
