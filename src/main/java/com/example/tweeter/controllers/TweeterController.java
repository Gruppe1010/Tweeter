package com.example.tweeter.controllers;

import com.example.tweeter.models.Twit;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;

import java.util.ArrayList;
import java.util.Date;

@Controller
public class TweeterController
{
    private ArrayList<Twit> publicTwitList = new ArrayList<Twit>();
    private ArrayList<Twit> hiddenTwitList = new ArrayList<Twit>();
    
    
    
    @GetMapping("/")
    public String index(Model twitModel)
    {
        
        
        return "index";
    }
    
    @PostMapping("/postTwit")
    public String postTwit(WebRequest dataFromTwitForm)
    {
        
        Twit twit = new Twit(new Date(), dataFromTwitForm.getParameter("authorinput"), dataFromTwitForm.getParameter(
                "twittextinput"), dataFromTwitForm.getParameter("publicorhiddeninput"));
        
        if(twit.getPublicOrPrivate().equals("No"))
        {
            publicTwitList.add(twit);
        }
        else
        {
            hiddenTwitList.add(twit);
        }
        
    
        return "redirect:/";
    }
    
    
    
    
    
}
