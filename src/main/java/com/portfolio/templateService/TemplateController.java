package com.portfolio.templateService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TemplateController {

    @GetMapping("/")
    public String sayNothing() {
        return "Nothing!";
    }

    @GetMapping("/template")
    public String sayHello() {
        return "Hello, World!";
    }
}