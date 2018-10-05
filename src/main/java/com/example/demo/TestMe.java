package com.example.demo;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class TestMe {
    public static void main(String[] args) {
        String[] wordlist = {""};
        Scanner sc = new Scanner(System.in);
        String referenceWord = "Someone";
        String[] word = referenceWord.split("");

        String foundLetters[]= new String[word.length];

        //      Fill the Found Letters string with asterisks
        for(int i=0; i<word.length; i++)
        {
            foundLetters[i]="*";
        }
        System.out.println("Found letters:"+foundLetters);
        String showFound =Arrays.toString(foundLetters);
        System.out.println("Enter your guess");
        String guess="";

//      Check to see if the letter matches any of the letters at a specific position in the array
         while(showFound.contains("*")){
            System.out.println("Enter a letter");
            guess=sc.nextLine();
            for(int i=0; i<word.length; i++)
            {
                if(guess.equalsIgnoreCase(word[i]))
                {
                    foundLetters[i]=guess;

                    showFound = Arrays.toString(foundLetters);
                }
            }
            System.out.println(showFound);


        }
        if(!showFound.contains("*"))
            System.out.println("Congratulations! You guessed the word!!!");

    }
}
