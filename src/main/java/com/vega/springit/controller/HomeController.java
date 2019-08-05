package com.vega.springit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RestController;

//@RestController
//public class HomeController {
//
//    @RequestMapping("/")
//    public String home(){
//        return " Hello, Spring Boot 2!";
//    }
//}


@Controller
public class HomeController {

    //    @RequestMapping("/")
    @RequestMapping(path = "/", method = RequestMethod.GET, consumes = "application/json", produces = "application/json")
    public String home() {
        return "index";
    }

//    @GetMapping("/hello")
//    public String handle(Model model){
//        model.addAttribute("message", "Hello World!"); //pass the data to the template index
//        return "index";
//    }
}
