// Morgan Mok
// mwm217
// lab 5
// "Random Games"

/* this is a program that will allow the user to select a game of chance and play */



import java.util.Scanner;
// define public class
    public class RandomGames {
    public static void main (String [] args) {
        //create instance of "scanner", a featuer allowing user input.
            Scanner myScanner = new Scanner (System.in);
        //the following text is displayed to the user to promt input.
            System.out.print ("Type the game you wish to play");
            System.out.print (" as R for Roulette, C for Craps, P for pick-a-card." );
            
        //the character typed by the user will be trigger the game.
        
        char cGame= myScanner.nextchar (); 
        
        String gameString;
        switch (game) {
            case 1:  gameString = "Roulette";
                     int (Math.random() * (37-0) + (0))
            case 2:  gameString = "Craps";
                     break;
            case 3:  gameString = "Pick-a-card";
           
                     break;
            default: gameString = "Invalid input";
                     break;
        }
        System.out.println(gameString);
    }
}
    }
    }