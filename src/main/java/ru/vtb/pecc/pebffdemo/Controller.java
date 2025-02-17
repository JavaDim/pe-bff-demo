package ru.vtb.pecc.pebffdemo;

import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("bff")
public class Controller {

    @Data
    public static class Body {
        private Integer first;
        private Integer second;
    }

    @GetMapping("{name}/hello")
    public String getHello(@PathVariable String name) {
        return "Hello dear " + name;
    }

    @PostMapping("/test")
    public Integer sum(@RequestBody Body body) {
        return body.first + body.second;
    }
}
