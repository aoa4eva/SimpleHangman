package me.afua;

import java.util.Scanner;

public class AllowOnlySix {
    public static void main(String[] args) {
//    Indicate how many more times a person can try (based on how many times they have already tried)
        int moreTries = 6;

//     Indicate how many times a person has tried
        int counter=1;

        Scanner keyboard = new Scanner(System.in);
        String userInput="";

//        First loop : Counting down. Keep counting till one condition is met
        do{

            System.out.println("Enter input. You have to enter an 'A' (doesn't matter what case)");
            userInput = keyboard.nextLine();
            System.out.println("You have "+(moreTries-1)+" more tries");
            moreTries--;
        }while(moreTries>0 && !userInput.equalsIgnoreCase("a"));


//        Second loop: Counting up. Keep counting until condition is met.

        do{

            System.out.println("Enter input. You have to enter an 'A' (doesn't matter what case)");
            userInput = keyboard.nextLine();
            System.out.println("You have tried "+counter+" time(s)");
            counter++;
        }while(counter<7 && !userInput.equalsIgnoreCase("a"));
    }
}
