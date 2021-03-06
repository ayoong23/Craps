
/**
 * The craps game in code
 *
 * @author Andy Yoong
 * @version 1/18/22
 */

import java.util.Scanner;

public class Craps
{

    public static void main(String[] args)
    {
        //creating the object for the game
        Die d1 = new Die();
        Die d2 = new Die();
        
        int roll1 = d1.roll();
        int roll2 = d2.roll();
        int rollTotal = roll1 + roll2;
        Scanner in = new Scanner(System.in);

        while (true)
        {
            //opening and rules
            d1 = new Die();
            d2 = new Die();
            roll1 = d1.roll();
            roll2 = d2.roll();
            rollTotal = roll1 + roll2;
            System.out.println("Let's play Craps!");
            System.out.println("Would you like to know the rules? (y/n)");
            String rules = in.nextLine();
            if(rules.substring(0,1).equals("y"))
                {
                   System.out.println("     A player rolls two six-sided dice and adds the numbers rolled together.");
                   System.out.println("     On the first roll, a 7 or an 11 automatically wins, and a 2,3 or 12 automatically loses.");
                   System.out.println("     If a 4, 5, 6, 8, 9, or 10 is rolled on the first roll, that number becomes the 'point'");
                   System.out.println("     The player continues to roll the two dice until one of two things happens:");
                   System.out.println("     either they roll the 'point' from that first roll again, in which they win;");
                   System.out.println("     or they roll a 7 in which case they lose.");
                }
            
            //rolling first dice
            System.out.println("Press [Enter] to roll the dice...");
            in.nextLine();
            System.out.println("You rolled a " + roll1 + " and a " + roll2);
            int total = d1.roll() + d2.roll();
            System.out.println("for a total of " + rollTotal);
            //first automatic outcomes
            if(rollTotal == 7 || rollTotal == 11)
            {
                System.out.println("You won!");
            }
            else if (rollTotal == 2 || rollTotal == 3 || rollTotal == 12)
            {
                System.out.println("You lose!");
            }
            else
            {
                int point = rollTotal;
                //continuation of the game if they do not automatically win or lose
                boolean keepPlaying = true;
                while(keepPlaying)
                {
                    System.out.println("Your point is " + point + " try to match your point to win");
                    System.out.println("Press [Enter] to roll the dice...");
                    in.nextLine();

                    roll1 = d1.roll();
                    roll2 = d2.roll();
                    rollTotal = roll1 + roll2;
                    
                    System.out.println("You rolled a " + roll1 + " and a " + roll2);
                    System.out.println("for a total of " + rollTotal);
                    

                    if (rollTotal == point)
                    {
                        System.out.println("You matched your point. You win!");
                        keepPlaying = false;
                    }
                    else if (rollTotal == 7)
                    {
                        System.out.println("Your rolled a 7. You lose!");
                        keepPlaying = false;
                    }
                }
                //ending of game and if they want to play again
                
            }
            System.out.println("Good Game!");
                System.out.println("Do you want to play again? (y/n)");
                String playAgain = in.nextLine();
                if(playAgain.equals(""))
                {
                    break;
                }
                if(playAgain.substring(0,1).equals("n"))
                {
                    break;
                }
        }
        System.out.println("Thank you for playing!");
    }
}

/*

COMMENTS FROM THE INSTRUCTOR:

This is such a *clean* program, Andy, in the way you've arranged the code on the
page--it makes it much more legible to read, and perhaps reflects your organized
approach to writing it. You have correctly implemented the rules of the game, and
the flow of play is quite good.

Here are some recommendations for you.

1. You implemented a "default Yes/No" feature for the play again question, and 
   that worked well. Ideally, you would indicate that by saying "(Y/n)", with
   the capital letter indicating the default option. And the default option at
   the end of the game *should* be to keep playing, not to quit. Make it as
   easy as possible for people to keep playing the game!

2. Along those lines, it's pretty annoying to have to refuse the instructions
   everytime a new game begins. It probably makes sense to put that question
   before the main game loop starts so the player doesn't have to keep dealing
   with that.

3. A very small point: In the main part of the game you actually get the dice
   rolls right after the user hits [Enter], and that's a good, logical place
   to make that happen. In the first roll, you set up the dice and roll them
   (twice?) before you've even gotten to asking them to roll the dice, which
   is a little confusing, and inconsistent with what you did later. I'd move
   that code to a more logical place in your program.

Otherwise, really nice work on this! I'm looking forward to seeing more  of
it when we start our next project next week!!

SCORE: 49/50

*/

