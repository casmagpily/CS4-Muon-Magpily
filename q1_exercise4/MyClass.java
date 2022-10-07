/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q1_exercise4;

/**
 *
 * @author Akira
 */
public class MyClass {
    private double audienceRating;
    String audiencee;
    boolean applause;
    public MyClass(String name){
        audiencee = name;
        applause = true;
    }
    public void Review(){
        System.out.println("\nHello, I'm " + audiencee + " and i'd like to say"
        + " that your we appreciate your performance.");
    }
    public void Rating(){
        audienceRating = Math.floor(Math.random()*9) + 1;
        System.out.println("In my personal opinion, I'd rate your singing with"
                + " a " + audienceRating +"/10. Thank you.");
    }
    public void setRating(double rating){
        if(audienceRating == rating){
            rating++;
        }
        audienceRating = rating;
        System.out.println("We re-evaluated your performance, we now think that"
                + " it's a " + audienceRating +"/10. Thank you.");
        
    }
    public void Applause(){
        if(audienceRating >= 5){
            System.out.println("The audience cheerfully applaud the singer!");
        } else {
            applause = false;
            System.out.println("The audience hesistantly clapped...");
        }
    }
}
