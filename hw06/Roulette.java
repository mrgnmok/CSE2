// Morgan Mok
// mwm217
// Brian Chen
// Homework 06

/* this is a simulation of the game roulette, played with 100 dollars and 1 dollar bets. The entire sequence is done 10 times making
a total of 1000 plays over 10 sessions. The result of each session is recorded */
//Imports the tools needed for this to run. A random number generator and a input device.
import java.util.Random;
import java.util.Scanner;
// define the public class.
public class  Roulette {
    
   public static void main (String [] args) {
       //produces the text in the quotes below.
       System.out.println ("Pick a number on the Roulette board, 0 typed as 37 and 00 typed as 38");
       //user input. pick a number.
       Scanner myScanner = new Scanner(System.in);
       int nRoulette = myScanner.nextInt ();
       
     // The random number generator generates numbers.
   Random randomGenerator = new Random();
   int nTotalWins=0;
   int nTotalLoss=0;
   for (int i=0; i<10; i++) {
   //these variables are the total wins in terms of 100 game sets.
   
   int nWins=0;

   
   
   // basically, 100 games are played and a number between 1-38 is picked. 37 and 38 don't exist in roulette but represent 0 and 00.
    for (int idx = 1; idx <= 100; ++idx){
      int randomInt = randomGenerator.nextInt(38)+1;
    
    // if the number generated matches the number picked, a win is counted.  
      if (randomInt==nRoulette) {
        nWins=nWins+1;
      }
     
    }
    // if 3 wins are counted in a set, the user goes net positive because the payout is 1:36. 36*3=108. So he profits.
    if (nWins>=3){
        nTotalWins++;
    }
    else if (nWins==0){  // this is the scenario in which the user wins no games and loses all his money.
        nTotalLoss++;
    }


    // the following text is printed to show how many net positives and total losses happened in the 10 sets of 100 games.
    }
    System.out.println ("You have gone net positive " + nTotalWins + " times.");
    System.out.println ("You have lost all of your money " + nTotalLoss + " times.");
    }
}