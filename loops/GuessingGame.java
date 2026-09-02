package loops;

import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    /*
        Welcome! In this module, you will be creating a random number guessing game. 

        Please follow the prompts below, and write your code in the allotted sections. 
        When you are finished, run your code by clicking the triangle on the top-right corner.
    */
    public static void main(String[] args) {
        boolean isGuessCorrect = false;
        Random random = new Random();
        Scanner input = new Scanner(System.in); 
        // 1. Create a variable containing the secret number.
        // ---- BEGIN CODE ----

            int secretNum = random.nextInt(1, 101);

        // ---- END CODE ----
        while (!isGuessCorrect) {
            // 2. The code below asks the user for a number between 1 and 100 and converts that guess to a number.
            // Annotate it with comments. 
            
            System.out.println("Enter guess (1-100):");

            // Gets user input
            String guessStr = input.nextLine();
            // Converts user input into an integer
            int guess = Integer.parseInt(guessStr);      

            

            // 3. Write an if statement that tells the player whether their guess is too high or too low.
            // ---- BEGIN CODE ----

            if(guess > secretNum) {
                System.out.println("Your number is too high.");
            }
            else if(guess < secretNum) {
                System.out.println("Your number is too low.");
            }
            else if(guess == secretNum) {
                isGuessCorrect = true;
            }

            // ---- END CODE ----


        // 4. Uncomment and complete the while loop so that the game continues WHILE the guess is incorrect.
        //    Make sure the player can change their guess each time through the loop.


        // 6. Print a message when the player wins.
        // ---- BEGIN CODE ----

            if(isGuessCorrect) {
                System.out.println("You guessed correctly!");
            }

        // ---- END CODE ----

        // 7. Now make the variable an actual secret by randomly generating the number defined in step 1. 
        // Hint: use Java Random!
        }
        
        input.close();
    }
}
