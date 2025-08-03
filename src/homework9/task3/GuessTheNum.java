package homework9.task3;

import java.util.Scanner;
import java.util.Random;

/**
 * A simple number guessing game where the user has to guess a randomly generated number between 1 and 100.
 */
public class GuessTheNum {

  static Random random = new Random();
  private static int numberToGuess = random.nextInt(100) + 1;

  /**
   * Starts the number guessing game.
   * The user is prompted to guess a number between 1 and 100.
   * The game provides feedback on whether the guess is too low, too high, or correct.
   * The user can choose to play again after guessing correctly.
   */
  public static void guessTheNum(){
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter a number between 1 and 100: ");
      String usersGuess = scanner.nextLine();
      int userGuess = Integer.parseInt(usersGuess);
      if(userGuess < 1 || userGuess > 100) {
          System.out.println("Please enter a valid number between 1 and 100.");
          guessTheNum();
      }else if(userGuess < numberToGuess){
            System.out.println("Your guess is too low. Try again.");
            guessTheNum();
      }else if (userGuess > numberToGuess){
            System.out.println("Your guess is too high. Try again.");
            guessTheNum();
      }else{
            System.out.println("Congratulations! You've guessed the number: " + numberToGuess);
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scanner.nextLine();
            if(playAgain.equalsIgnoreCase("yes")){
                numberToGuess = random.nextInt(100) + 1; // Reset the number to guess
                guessTheNum();
            } else {
                System.out.println("Thank you for playing!");
            }
      }
  }

}
/**
  * A test class to run the GuessTheNum game.
 */
class TestToGuess {
    public static void main(String[] args) {
        GuessTheNum.guessTheNum();
    }
}
