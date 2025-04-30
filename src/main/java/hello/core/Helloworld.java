package hello.core;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Helloworld {
    @RequestMapping("/")
    public String helloWorld() {
        return "Hello World";
    }

    @RequestMapping("/test")
    public String test() {
        return "test";
    }
}
