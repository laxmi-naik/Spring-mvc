package com.xworkz.job.controller;

import com.xworkz.job.Service.JobService;
import com.xworkz.job.dto.JobDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/")

public class JobController {
    @Autowired
private JobService jobService;
    public JobController()
    {
        System.out.println("Running in FromsController");
    }

    @RequestMapping("/apply" )

    public String onSave(JobDTO jobDTO) {
        System.out.println("onSave running in FromsController");
        System.out.println(jobDTO.toString());
        boolean save=this.jobService.saveAndValid(jobDTO);
        if(save){
            System.out.println("is connected");
        }
        else {
            System.err.println("not connected");
        }

        return "index.jsp";
    }
}
