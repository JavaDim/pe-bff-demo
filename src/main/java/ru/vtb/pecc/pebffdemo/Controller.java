package ru.vtb.pecc.pebffdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("bff")
public class Controller {

    @GetMapping("{name}/hello")
    public String getHello(@PathVariable String name) {
        return "Hello dear " + name;
    }
}
