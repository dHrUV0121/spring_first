package com.dhruv.spring_first;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    // this is the method and to map this with url we use annotation used just above.
    public String hello(){
        return "Hello World";
    }

    @PostMapping("/hello")
    public String helloPost(@RequestBody String name){
        return "Hello" + name + "!"; // here to get name as input we used @RequestBody above which will request an input from user for the name using tool like postman etc.
    }
}
