package mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("/hello")
    public String killMe() {
        return "hello";
    }
    @GetMapping("hello")
    public String killUs() {
        return "hello";
    }
}
