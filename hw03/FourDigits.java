// Morgan Mok
// mwm217
// CSE2
// Prof. Brian Chen
//////////

/* this is a program designed to allow a user to input a number and then have the
first 4 decimal places to the right of the point displayed to him */

// import utility "scanner". allows user to input data.

import java.util.Scanner;

// define public class
public class Fourdigits {
    public static void main (String [] args) {
            
        // create instance of "scanner"
        Scanner myScanner = new Scanner (System.in);
        // displays the following text to guide user.
            System.out.print ("Type a number with four decimal places");
          //The input number is now "nInput".       
             double nInput = myScanner.nextDouble();
        // The inputted number is now variable "nInput"
        // Here the number is multiplied by 10,000 in order to move the decimal point over.        
            double decimalNumbers = nInput*10000; // This is the new variable "decimalNumbers".
            
        // Here the input number is casted into an int. from a double, then multiplied by 10,000.
        // Afterwards the modulus variable "decimalNumbers" by the result from the prior multiplication.
            double decimalPlaces = decimalNumbers % (((int) nInput)*10000);
        
        // The following text will be printed on screen for user to examine answer.
            System.out.println ("The digits are " + decimalPlaces);
        }
}