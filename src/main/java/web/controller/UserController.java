package web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {


    @GetMapping("/hello")
    public String sayHello() {
        return "/hello";
    }


}


