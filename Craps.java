
/**
 * Write a description of class Craps here.
 *
 * @author Andy, Sabrina, Aria
 * @version (a version number or a date)
 */

import java.util.Scanner;
import java.util.Random;
public class Craps
{

    public static void main(String[] args)
    {
        System.out.println("Do you want to play a game (yes/no)?");
        Scanner scan = new Scanner(System.in);
        String answer = scan.nextLine();
        while(answer.equals("yes") || answer.equals("Yes"))
        {
            System.out.println("Enter a number (1-10): ");
            int guess = scan.nextInt();
            Random rand = new Random();
            int computerGuess = (int) (Math.random() *10 +1);
            int i = 1;
            while(i <= 2 && computerGuess != guess)
            {   
                 if(computerGuess < guess)
                {
                    System.out.println("Your guess is too high");
                    System.out.println("Enter a number (1-10): ");
                    guess = scan.nextInt();
                    i++;
                }
                else if(computerGuess > guess)
                {
                    System.out.println("Your guess is too low");
                    System.out.println("Enter a number (1-10): ");
                    guess = scan.nextInt();
                    i++;
                }
                
            }
            if(guess == computerGuess)
            {
                System.out.println("You are right!");
                Syst
                em.out.println("Do you want to continue to play the game (yes/no)?");
                scan.nextLine();
                answer = scan.nextLine();
            }
            else if(guess != computerGuess)
            {
                System.out.println("The correct number is " + computerGuess);
                System.out.println("Do you want to continue to play the game (yes/no)?");
                scan.nextLine();
                answer = scan.nextLine();
            }
        }
        System.out.println("Thank you for playing my game!");
    }
}