package com.company;
import java.util.Random;
import java.util.Scanner;
class game{
    public int number;
    public int inputnumber;
    public int getNoOfGuesses;


    public int getGetNoOfGuesses() {
        return getNoOfGuesses;
    }

    public void setGetNoOfGuesses(int getNoOfGuesses) {
        this.getNoOfGuesses = getNoOfGuesses;
    }

    public void game(){
        Random rand = new Random();
        this.number = rand.nextInt(100 );
        System.out.println(number);
    }
    public int userInput(){
        System.out.println("no to be guessesed");
        Scanner sc = new Scanner(System.in);
        inputnumber = sc.nextInt();
        return inputnumber;
    }
    boolean isCorrectNumber() {
        if (inputnumber == number) {
            return true;
        } else if (inputnumber < number) {
            System.out.println("too less" + inputnumber);
        } else if (inputnumber > number) {
            System.out.println("too high" + inputnumber);
        }
            return false;
        }

}
public class CWS_EX3_guessthenumber {
    public static void main(String[] args) {
        System.out.println("exercise 3 : guess the number");
        /*
        * Create a class game which allows a user to play "guess the number".
        * game once game should have the following methods:
        * 1. construsctor to generate the random number
        * 2. takeuserinput() to take a user input of number
        * 3. takeuserinput() to detect whether the number entered by the user is true
        * 4. getter and setter for no of guesses
        * use properties such as noofguesses(int) etc to get this task done  */

        game g = new game();
        boolean b=false;
        g.game();
        while(!b) {
            g.userInput();
            b = g.isCorrectNumber();
            System.out.println(b);
        }
    }
}
