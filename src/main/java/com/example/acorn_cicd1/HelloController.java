package com.example.acorn_cicd1;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @ResponseBody
    @GetMapping("/hi")
    public String  hello(){
        return  "hello  ^.^  !! 0609^^^~******";
    }
}
