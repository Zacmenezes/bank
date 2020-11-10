package com.isaac.bank.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContaController {

    @GetMapping("/test")
    String test() {
        return "Hello world";
    }
}
