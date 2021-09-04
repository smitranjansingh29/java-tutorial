package com.company;
import java.util.Scanner;
import java.util.Random;
public class cws_rockpaperscissors {
    public static void main(String[] args) {
        Scanner so = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("rock paper and scissors game let get sarted ");
        System.out.println("please choose one option\n 1.rock\n 2.paper\n 3.scissors");

        int user_input = so.nextInt();
        switch (user_input) {
            case 1 -> System.out.println("you enter rock");
            case 2 -> System.out.println("you enter paper");
            case 3 -> System.out.println("you enter scissors");
        }

        System.out.println("now its computer turn");
        int computer_input = rand.nextInt(3);
        System.out.println(computer_input);
        switch (computer_input) {
            case 1 -> System.out.println("you enter rock");
            case 2 -> System.out.println("you enter paper");
            case 3 -> System.out.println("you enter scissors");
        }

        if((user_input==1 && computer_input == 3)||(user_input == 2 && computer_input == 1) || (user_input == 3 && computer_input == 2))
        {
            System.out.println("you have won the game");
        }
        else if(user_input == computer_input)
        {
            System.out.println("game draw");
        }
        else
        {
            System.out.println("computer win better luck next time");
        }
    }
}
