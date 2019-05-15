package controller;


import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class TestController {


    @RequestMapping("/")
    public String name() {
        return "form";
    }

    @RequestMapping("/form")
    public String form(@Valid User user, Errors error){
        if (error.hasErrors()){
            System.out.println("有错误呀");
            return "form";
        }
        System.out.println(user);
        return "index";
    }
}
