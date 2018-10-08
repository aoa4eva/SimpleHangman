package me.afua;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TestMe {
    public static void main(String[] args) {
//      Simple - without a loop
        String[] wordList = {"Tree","Rain","Bear","Encourage","Promise","Soup","Chess","Insurance","Pancakes","Stream"};
        Scanner sc = new Scanner(System.in);
        String referenceWord = wordList[new Random().nextInt(wordList.length)];
        String[] word = referenceWord.split("");
        String asterisks = "";

        String foundLetters[]= new String[word.length];

        //      Fill the Found Letters string with asterisks
        for(int i=0; i<word.length; i++)
        {
            foundLetters[i]=" * ";
        }

//     Uncomment this to see the referenced word
//     System.out.println("Guess word:"+referenceWord);


        String showFound = Arrays.toString(foundLetters);
        System.out.println("Enter your guess");
        String guess="";

//      Check to see if the letter matches any of the letters at a specific position in the array
         while(showFound.contains("*")){
            System.out.println("Enter a letter");

//       Get the guess from the user
            guess=sc.nextLine();
            for(int i=0; i<word.length; i++) {
                if (guess.equalsIgnoreCase(word[i])) {
//                  Replace the asterisks with letters that have been found
                    foundLetters[i] = guess;

//                  Re-generate the string that displays without arraylist formatting
                    showFound = Arrays.toString(foundLetters);
                }
            }
//          Print the array with corresponding positions
            System.out.println(showFound);

        }
        if(!showFound.contains("*"))
            System.out.println("Congratulations! You guessed the word!!!");

    }
}
