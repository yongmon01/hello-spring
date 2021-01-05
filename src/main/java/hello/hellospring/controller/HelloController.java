package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @GetMapping("hello") //      /hello에 들어왔을때 호출된다.
    public String hello(Model model) {
        model.addAttribute("data", "hello!!");
        return "hello"; //     /hello 로 data를 넘겨준다
    }

    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam("enterName") String name, Model model) {
        model.addAttribute("enterName", name);
        return "hello-template";
    }

    //
    @GetMapping("hello-string")
    @ResponseBody
    public String helloString(@RequestParam("name") String name){
        return "hi " + name;
    }

    @GetMapping("hello-api")
    @ResponseBody
    public Hello helloApi(@RequestParam("name") String name){
        Hello hello = new Hello();
        hello.setName(name);
        return hello;
    }

    static class Hello{
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

}
