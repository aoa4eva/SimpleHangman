package me.afua;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class WithStringBuilder {
    public static void main(String[] args) {

//      Create a list of random words:
        List<String> wordList = Arrays.asList("Tree","Rain","Bear","Encourage","Promise","Soup","Chess","Insurance","Pancakes","Stream");
        Scanner userInput = new Scanner(System.in);
        StringBuilder guessedLetters = new StringBuilder();
        boolean tryAgain;
        int numberOfTries=1;
        boolean guessed=false;

        do {
//          Reset the variables
            guessed=false;
            numberOfTries=1;
            //      Select a random number
            int r = new Random().nextInt(10);

            //      Create a new StringBuilder
            guessedLetters = new StringBuilder();

            //      Get a word from that random number
            String theWord = wordList.get(r).toLowerCase();
            for (int i = 0; i < theWord.length(); i++) {
                guessedLetters.append("*");
            }


            do {
                //      Prompt user for output
                System.out.println("Enter a letter you think is in the word");

                //      Display the selected word for testing
                System.out.println("The selected word:" + theWord);


                //      Get the user input and make sure it contains only the letter entered
                String guess = userInput.nextLine().trim();

                //      See if the word contains the guessed letter
                if (theWord.contains(guess)) {
                    for (int i = 0; i < theWord.length(); i++) {
                        //  Replace the letter with the correct value in the sequence
                        if (String.valueOf(theWord.charAt(i)).equalsIgnoreCase(guess)) {
                            guessedLetters.replace(i, i + 1, guess);
                        }
                    }
                }
                System.out.println(guessedLetters);

                if(theWord.indexOf(guess)==-1)
                {
                    numberOfTries++;
                }

                if(guessedLetters.indexOf("*")==-1)
                {
                    guessed=true;
                }
            } while (numberOfTries < 7 && !guessed);

            if (numberOfTries > 5) {
                tryAgain = false;
                System.out.println("You have exceeded the maximum number of tries. The word is:" + theWord);
            }

            if (guessed)
            {
                System.out.println("Congratulations! You guessed the word!! ");
            }


                //     Prompt the user to try with another word
                System.out.println("Would you like to try again?");
                tryAgain = userInput.nextLine().equalsIgnoreCase("y");
                if(!tryAgain)
                    System.out.println("Thank you for playing!");



        }while(tryAgain);





    }
}
