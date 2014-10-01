//Morgan Mok
// mwm217
// hw05
// boolaboola


/* there are going to be 3 boolean, or, true or false, statements. They will be randomly assigned true or false values.
the user will then respond to the statement provided. */

//imports java utility.
import java.util.Scanner;

// define public class
    public class BoolaBoola {
    public static void main (String [] args) {
        
        int random = (int)(Math.random ()*10);
        boolean a = true, b= true, c=true;   
        if (random %2==0)
           a = false;
        random=(int)(Math.random ()*10);
        if (random%2==0)
            b= false;
        random=(int)(Math.random ()*10);
            c= false;
      // The combinations of the 3 statements are made and the user is prompted to asnwer true or false      
        System.out.println ("Does " + a + " || "+b + " && "+c + " have the value true(t/T) or false(f/F)?");
        Scanner myScanner = new Scanner (System.in);
        char answer = myScanner.next().charAt(0);
        if((answer == 't' || answer == 'T') && (a||b&&c))
            System.out.println("Correct");
        else
            System.out.println("False");
        System.out.println ("Does " + a + " && "+b + " && "+c + " have the value true(t/T) or false(f/F)?");
        answer = myScanner.next().charAt(0);
        if((answer == 't' || answer == 'T') && (a&&b&&c))
            System.out.println("Correct");
        else
            System.out.println("False");
        System.out.println ("Does " + a + " && "+b + " || "+c + " have the value true(t/T) or false(f/F)?");
        answer = myScanner.next().charAt(0);
        if((answer == 't' || answer == 'T') && (a&&b||c))
            System.out.println("Correct");
        else
            System.out.println("False");
        
    }
    }