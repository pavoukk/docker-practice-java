package net.thumbtack.exampleservice.endpoints;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class HelloController {

    @GetMapping(path = "/hello")
    public HashMap<String, String> hello() {
        return new HashMap<String, String>(){{
            put("greetings", "Hello!!!");
        }};
    }
}
