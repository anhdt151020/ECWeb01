package com.example.webtutorials01.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String homePage(){
        return "index";
    }
    @GetMapping("/home")
    public String homePageForAnotherSite(){
        return "index";
    }
    @GetMapping ("/about")
    public String aboutPage(){
        return "about";
    }
    @GetMapping ("/testimonial")
    public String testimonialPage(){
        return "testimonial";
    }
    @GetMapping ("/blog")
    public String blogPage(){
        return "blog_list";
    }
    @GetMapping ("/product")
    public String productPage(){
        return "product";
    }
    @GetMapping ("/contact")
    public String contactPage(){
        return "contact";
    }
    @GetMapping ("/cart")
    public String cartPage(){
        return "cart";
    }
    @GetMapping ("/login")
    public String loginPage(){
        return "login";
    }
    @GetMapping ("/register")
    public String registerPage(){
        return "register";
    }
}
