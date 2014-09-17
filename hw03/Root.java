// Morgan Mok
// CSE2
// Prof Brian Chen
// hw03- Root
// mwm217

////////////////

/* This program is designed to find the cube root, and then the cubed value of the estimate
of a given number, which is inputted by the user. It will then continue to refine the estimate */

// import utility "scanner". allows user to input data.

import java.util.Scanner;

// define public class
    public class Root {
    
         public static void main (String [] args) {
        
             // create instance of "scanner"
                  Scanner myScanner = new Scanner (System.in);
                  // displays the following text for user to guide user.
                 System.out.print ("Type the number, then press enter");
        
          double nInput = myScanner.nextDouble (); // The inputted number is now variable, "nInput".
    

//Now the computations will be created.
    //assign variables
        double guess = nInput/3;
            // for the purpose of this project, the estimated square root will be the number divided by 3
        // This is the first refinement.
            //Redeclare variable "guess". Adds precision.
                guess = (guess*guess*guess+nInput)/(3*guess*guess);
            /* Redeclare variable to add precision. I'm not sure why this works; my math is terrible 
            and I don't understand the mechanics of this equation. I am simply following instructions. */
                guess = (2*guess*guess*guess+nInput)/(3*guess*guess);
            // Redeclare once again.
                guess = (2*guess*guess*guess+nInput)/(3*guess*guess);
            // Seriously I have no clue why this works, but apparently it does. So thanks Professor Chen.
                guess = (2*guess*guess*guess+nInput)/(3*guess*guess);
            // This is the last time for refining the answer.
                guess = (2*guess*guess*guess+nInput)/(3*guess*guess);
                
                
    // Basically, here is your answer. I'm glad it's probably close to correct. Honestly, if I understood the math behind this, I would write better comments.    
    System.out.println ("The cubed root of the number you input is " + guess + "." );
    
    }
    
}