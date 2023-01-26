import java.util.*;
 
public class game {
 
    // Function that implements the
    // number guessing game with a certain number attempts
    public static void guessingNumberGame()
    {
        // Scanner Class
        Scanner sc = new Scanner(System.in);
 
        // Generate the numbers
        int number = 1 + (int)(100 * Math.random());
 
        // Given k trials
        int k = 10;
 
        int i, guess;
        int score=0;
 
        System.out.println("A number is chosen" + " between 1 to 100.");
        System.out.println("Guess the number" + " within 10 trials.");
 
        // Iterate over K Trials
        for (i = 1; i <= k; i++) {
 
            System.out.println(
                "Guess the number:");
 
            // Take input for guessing
            guess = sc.nextInt();
 
            // If the number is guessed
            if (number == guess) {
                System.out.println(
                    "Congratulations!"
                    + " You guessed the number in "+ i+" guesses.");
                if(i==1)
                	score= i*100;
                else
                	score= (k-i)*10;
                System.out.println("Number of trials = "+i+"/"+k);
                break;
            }
            else if (number > guess
                     && i != k - 1) {
                System.out.println(
                    "The number is "
                    + "greater than " + guess);
            }
            else if (number < guess
                     && i != k - 1) {
                System.out.println(
                    "The number is"
                    + " less than " + guess);
            }
        }
        System.out.println("Final score = "+score);
                 
        if (i == k) {
            System.out.println(
                "You have exhausted"
                + " k trials.");
 
            System.out.println("The number was " + number);
        }
    }
 
    public static void main(String arg[])
    {
 
        // Function Call
        guessingNumberGame();
    }
}
