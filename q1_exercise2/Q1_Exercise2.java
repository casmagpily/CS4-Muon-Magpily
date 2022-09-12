/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1_exercise2;

import java.util.Scanner;

/**
 *
 * @author MUON
 */
public class Q1_Exercise2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean stop = false;
        String initiate = "Start game";
        String config = "Change settings";
        String shutdown = "End application";
        int guessNm = 3, lowerLimit = -4, upperLimit = 4, range;
        range = Math.abs(lowerLimit) + Math.abs(upperLimit);
        while(!stop){
            int ranNum = (int) Math.floor(Math.random()*range) + lowerLimit;
            System.out.println("Welcome to Higher or Lower! What will you do?");
            System.out.println(initiate);
            System.out.println(config);
            System.out.println(shutdown);
            String response = sc.nextLine();
            switch(response){
                case "Start game":
                    while(guessNm > 0){
                        System.out.println("You have " + guessNm + " guess(es) left. What is your guess?");
                        int guess = Integer.parseInt(sc.nextLine());
                        guessNm--;
                        if(guess < ranNum){
                            System.out.println("Guess Higher! ");
                        } else if(guess > ranNum){
                            System.out.println("Guess Lower! ");
                        } else if(guess == ranNum){
                            System.out.println("Nice one! You got it!");
                            break;
                        }
                        
                    }
                    if(guessNm == 0){
                        System.out.println("You Lost... The answer was " + ranNum);
                    }
                    break;
                case "Change settings":
                    System.out.println("What is the lower limit of the random number?");
                    System.out.println("What is the upper limit of the random number?");
                    System.out.println("How many guesses are allowed?");
                    System.out.println("Lower Limit(currently at " + lowerLimit + "):");
                    lowerLimit = Integer.parseInt(sc.nextLine());
                    System.out.println("Lower Limit is now set to " + lowerLimit);
                    System.out.println("Upper Limit(currently at " + upperLimit + "):");
                    upperLimit = Integer.parseInt(sc.nextLine());
                    System.out.println("Upper Limit is now set to " + upperLimit);
                    System.out.println("Guesses(currently at " + guessNm + "):");
                    guessNm = Integer.parseInt(sc.nextLine());
                    System.out.println("Guesses are now set to " + guessNm);
                    break;
                case "End application":                   
                    stop = true;
                    break;
                
            }
        }
    }
}
