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
        while(!stop){
            String initiate = "Start game";
            String config = "Change settings";
            String shutdown = "End application";
            System.out.print("Welcome to Higher or Lower! What will you do?");
            System.out.println(initiate);
            System.out.println(config);
            System.out.println(shutdown);
            String response = sc.nextLine();
            switch(response){
                case "Start game":
                    for(int guessNm = 3;guessNm > 0;guessNm--){
                        System.out.println("You have " + guessNm + "guess(es) left. What is your guess?");
                    }
                    break;
                case "Change settings":
                    
                    break;
                case "End application":
                    
                    break;
                
            }
        }
    }
}
