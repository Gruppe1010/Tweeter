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

        twitModel.addAttribute("publicTwitList", publicTwitList);
        //SLET DEM NÅR VI HAR TESTET
        publicTwitList.add(new Twit(new Date(), "Hejejejejsa ", "Hejejejejsa Hejejejejsa Hejejejejsa Hejejejejsa Hejejejejsa Hejejejejsa Hejejejejsa Hejejejejsa Hejejejejsa Hejejejejsa Hejejejejsa Hejejejejsa Hejejejejsa Hejejejejsa Hejejejejsa ", "public"));
        hiddenTwitList.add(new Twit(new Date(), "Hejejejejsa ", "Hejejejejsa Hejejejejsa Hejejejejsa Hejejejejsa Hejejejejsa Hejejejejsa Hejejejejsa Hejejejejsa Hejejejejsa Hejejejejsa Hejejejejsa Hejejejejsa Hejejejejsa Hejejejejsa Hejejejejsa ", "hidden"));
        return "index";
    }
    
    @PostMapping("/postTwit")
    public String postTwit(WebRequest dataFromTwitForm)
    {
        
        Twit twit = new Twit(new Date(), dataFromTwitForm.getParameter("authorinput"), dataFromTwitForm.getParameter(
                "twittextinput"), dataFromTwitForm.getParameter("publicorhiddeninput"));
        
        if(twit.getPublicOrPrivate().equalsIgnoreCase("Public"))
        {
            publicTwitList.add(twit);
            //System.out.println(publicTwitList);
        }
        else
        {
            hiddenTwitList.add(twit);
            //System.out.println(hiddenTwitList.get(0).getPublicOrPrivate());
        }
        
        //
            //System.out.println(hiddenTwitList.get(0).getAuthor());

        return "redirect:/";
    }
    
    
    
    
    
}
