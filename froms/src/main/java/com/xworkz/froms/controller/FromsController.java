package com.xworkz.froms.controller;


import com.xworkz.froms.Dto.FromsDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/")
public class FromsController {

    public FromsController()
    {
        System.out.println("Running in FromsController");
    }

    @RequestMapping("/apply" )

    public String onSave(FromsDTO fromDTO) {
        System.out.println("onSave running in FromsController");
        System.out.println(fromDTO.toString());
        return "index.jsp";
    }
}
