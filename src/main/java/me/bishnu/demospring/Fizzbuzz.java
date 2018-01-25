package me.bishnu.demospring;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController
public class Fizzbuzz {

    @RequestMapping("/")
    public String fizzBuzz() {
        String output = "";



            for (int i = 1; i <= 100; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("fizzBuzz");
                    output += "Fizzbuzz" + "<br>";

                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                    output += "Fizz" + "<br>";
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                    output += "Buzz" + "<br>";
                } else {
                    System.out.println(i);
                    output += String.valueOf(i) + "<br>";
                }


            }
        return output;

        }

    @RequestMapping("/fizzbonus")
    public String fizzBuzzBonus() {
        Scanner keyboard = new Scanner(System.in);
        String output2 = "";
        int ct7=0, ct17=0, ct23=0;

        System.out.println("How many numbers? ");
        int last = keyboard.nextInt();
        for (int i = 1; i <= last; i++) {
            if (i % 7 == 0)
                ct7++;
            if (i % 17 == 0)
                ct17++;
            if (i % 23 == 0)
                ct23++;

            output2 = fizzBuzz()+"The number of multiples of 7 are "+ String.valueOf(ct7)+"</br>"+"The number of multiples of 17 are "+ String.valueOf(ct17)+"</br>"+"The number of multiples of 23 are "+ String.valueOf(ct23)+"</br>";


        }
        return output2;

    }

    }

