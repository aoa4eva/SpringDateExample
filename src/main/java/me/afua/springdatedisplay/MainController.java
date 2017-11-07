package me.afua.springdatedisplay;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/")
    public String showMainPage(Model model)
    {
        MyDateClass dateClass = new MyDateClass();
        model.addAttribute("theDay",dateClass.getTheDay());
        model.addAttribute("theNiceDay",dateClass.getTheFormattedDay());
        model.addAttribute("fullDate",dateClass.getLongFormat());
        return "home";
    }
}
