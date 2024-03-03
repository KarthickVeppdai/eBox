package com.villageBiz.eBox;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class MainController {

    @GetMapping("/homepage")
    public String homepage()
    {
        return "pages/index";
    }

    @GetMapping("/student")
    public String studenthomepage()
    {
        return "pages/dashboard";
    }
    @GetMapping("/chat")
    public String chat()
    {
        return "pages/chat";
    }

    @GetMapping("/subscription")
    public String studentsubscription()
    {
        return "pages/subscription";
    }

    @GetMapping("/cart")
    public String studentcart()
    {
        return "pages/cart";
    }

    @GetMapping("/checkout")
    public String studentcheckout()
    {
        return "pages/checkout";
    }
    @GetMapping("/editprofile")
    public String studenteditprofile()
    {
        return "pages/editprofile";
    }

    @GetMapping("/paymenthistory")
    public String paymenthistory()
    {
        return "pages/paymenthistory";
    }

    @GetMapping("/addsubject")
    public String addsubject()
    {
        return "pages/addsubject";
    }
}
