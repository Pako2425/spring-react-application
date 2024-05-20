package com.springreactapp.springreactapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExampleController {

    @GetMapping("/home/example-url/")
    public String exampleRequest() {

        return "JSON data";
    }
}
