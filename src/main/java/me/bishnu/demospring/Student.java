package me.bishnu.demospring;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController

public class Student {

    @RequestMapping("/a")

    public String show()
    {




        return "this is from the student class";

    }
}
