package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("hello") //      /hello에 들어왔을때 호출된다.
    public String hello(Model model){
        model.addAttribute("data", "hello!!");
        return "hello";
    }
}
