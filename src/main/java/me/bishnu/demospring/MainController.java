package me.bishnu.demospring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController
public class MainController {




    @RequestMapping("/user")
    public String showIndex() {

        String userName = "";
        Scanner keyboard = new Scanner(System.in);
        userName = keyboard.nextLine();
        String greet = "Hello" + userName;
        System.out.println(greet);
        return greet;



    }
}
