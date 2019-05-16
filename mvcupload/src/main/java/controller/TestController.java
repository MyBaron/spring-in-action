package controller;


import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.support.MultipartFilter;

import javax.validation.Valid;

@Controller
public class TestController {


    @RequestMapping("/")
    public String name() {
        return "form";
    }

    @RequestMapping("/form")
    public String form(
            @RequestPart byte[] profilePicture){
        System.out.println(profilePicture.length);
        return "index";
    }
}
