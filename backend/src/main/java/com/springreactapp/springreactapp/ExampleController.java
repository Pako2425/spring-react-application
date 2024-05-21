package com.springreactapp.springreactapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ExampleController {

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping(value = "/home/example-url")
    @ResponseBody
    public ExampleAnswer exampleRequest() {
        return new ExampleAnswer();
    }
}
