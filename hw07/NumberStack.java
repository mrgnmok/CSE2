//Morgan Mok
// hw07
// Number Stack

/* this is a program that will stack numbers from 1 to up to the user's choice (below 9).*/

//import the scanner utility
import java.util.Scanner;
//define public class
public class NumberStack {
    public static void main (String [] args){
        // take input 
        Scanner myScanner = new Scanner(System.in);
        // prompts user for number
        System.out.println ("Pick an integer between 1 and 9");
        //nNumber is the declared name for the input number.
       int nNumber = myScanner.nextInt();
      
        int numberHolder = 1; // a placeholder variable.
        int width = 0;        // number of characters deep a line goes.
        while(numberHolder <= nNumber){ //nested loop. deals with the rows.
            int rows = 1;
            while(rows <= numberHolder){ // second nested loops. deals with the number of characters per row (width).
                width = 1 + ((numberHolder-1) * 2);
                while(width > 0){ // third nested loop. helps program to change the count of the width so that the loop knows when to terminate.
                    System.out.print(numberHolder);
                    width--;
                }
            System.out.println(); // space for formatting the stack.
            rows++; // adds 1 to "row". This way the stack can grow taller! (: everyone wins.
            }
            width = 1 + ((numberHolder-1) * 2); // formula for how the stack grows wider per new number. 
                while(width > 0){
                    System.out.print('-');
                    width--; // again, this nested loop is to change the count so that the loop terminates at the right place based on give constraints.
                } 
            System.out.println();
            numberHolder++;
        } 
        
        System.out.println ("Using DoWhile loops");
          numberHolder=1;
         do {
            int rows = 1;
            do {
                width = 1 + ((numberHolder-1) * 2);
                do {
                    System.out.print(numberHolder);
                    width--;
                } while(width > 0); // third nested loop. helps program to change the count of the width so that the loop knows when to terminate.
            System.out.println(); // space for formatting the stack.
            rows++; // adds 1 to "row". This way the stack can grow taller! (: everyone wins.
            } while(rows <= numberHolder); // second nested loops. deals with the number of characters per row (width).
            width = 1 + ((numberHolder-1) * 2); // formula for how the stack grows wider per new number. 
                do {
                    System.out.print('-');
                    width--; // again, this nested loop is to change the count so that the loop terminates at the right place based on give constraints.
                } while(width > 0);
            System.out.println();
            numberHolder++;
        } while(numberHolder <= nNumber);//nested loop. deals with the rows.
        
        System.out.println ("Using ForWhile Loops");
        
            for( int numberHolder =1 ; numberHolder <= nNumber; numberHolder++){ //nested loop. deals with the rows.
            
            for( int rows = 1; rows <= numberHolder; rows++){  // second nested loops. deals with the number of characters per row (width).
                
                for( int width = 1 + ((numberHolder-1) * 2); width > 0; width--) { // third nested loop. helps program to change the count of the width so that the loop knows when to terminate.
                    System.out.print(numberHolder);
                   
                }
            System.out.println(); // space for formatting the stack.
          
            } 
            
                for( int width = numberHolder*2+1; width > 0; width--) {
                    System.out.print('-');
                   
                } 
            System.out.println();

        }
    }
}   
        
    




