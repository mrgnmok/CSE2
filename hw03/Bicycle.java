// Morgan Mok
// CSE2
// Prof. Brian Chen
// hw03 - Bicycle


/////////////
/////////////
/* This is a program that will allow the user to input two numbers, one representing the number
of counts on a cyclometer, the latter, the duration in which the cycles take place (in seconds)
*/

import java.util.Scanner;

// define the public class
public class Bicycle {

    public static void main (String [] args) {
    
      Scanner myScanner;
    // An instance of "scanner". Basically allows user input to be made.
      myScanner= new Scanner (System.in);
    // Prints the following texts in order to guide user input.
         System.out.print ("Enter the number of cycles (as an integer>0)");
    
         // The user input is now considered variable "nCounts".
             int nCounts = myScanner.nextInt ();
    // Prints the following line to guide user input. This time regarding time.
         System.out.print ("Enter the number of seconds"); 
         // The user input is now conisdered variable "nSeconds". This is the time elapsed.
          double nSeconds = myScanner.nextDouble ();
    
        
/* These are the computations required to produce the answers which are distance, time in minutes
and average speed in miles per hour */ 

         //these are the other variables required. They are taken from lab02. They are given.
    
              //This is the wheel diameter.
                   int diameter = 27;
              // pi is the ratio between circumference and diameter of a circle
                   double pi = 3.14159;
              //There are 63360 inches in a mile.
                   double inchesPerMile = 63360;
        
// These are the computations for the three outputs.
   double Distance= ((nCounts*diameter*pi)*(inchesPerMile));
    
   double Minutes= (nSeconds*.6);
   
   double milesPerHour= (Distance*(Minutes*.6));
    

    
// The following text will be printed and contains the answers.

System.out.println ("The total distance was"+ Distance + "miles.");

System.out.println ("The total time elapsed was"+ Minutes + "minutes.");

System.out.println ("The average speed was"+ milesPerHour+ "miles per hour.");
        
        

    
}
         }

