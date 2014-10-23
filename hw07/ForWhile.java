//import the scanner utility
import java.util.Scanner;
//define public class
public class ForWhile {
    public static void main (String [] args){
        // take input 
        Scanner myScanner = new Scanner(System.in);
        // prompts user for number
        System.out.println ("Pick an integer between 1 and 9");
        //nNumber is the declared name for the input number.
       int nNumber = myScanner.nextInt();
        for( int numberHolder =1 ; numberHolder <= nNumber; numberHolder++){ //nested loop. deals with the rows.
            
            for( int rows = 1; rows <= numberHolder; rows++){  // second nested loops. deals with the number of characters per row (width).
                
                for( int width = numberHolder*2+1; width > 0; width--); { // third nested loop. helps program to change the count of the width so that the loop knows when to terminate.
                    System.out.print(numberHolder);
                   
                }
            System.out.println(); // space for formatting the stack.
          
            } 
            
                for( int width = numberHolder*2+1; width > 0; width--); {
                    System.out.print('-');
                   
                } 
            System.out.println();

        }
    }
}   