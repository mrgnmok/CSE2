//Morgan Mok
//mwm217
//hw06
//Brian Chen.

//import java stuff
import java.util.Scanner;
public class Root { //yay public class
    public static void main (String [] args) {
        //first use of scanner. allows for user input
        Scanner myScanner = new Scanner(System.in);
        // prints the text.
        System.out.println (" enter an integer whose squareroot you want to know");
        // use of myScanner. 
        int x = myScanner.nextInt ();
        // assign the values.
        double low = 0.0;
        double high = 0.0 + (1+x);
        double middle = 0.0;
        // math. lots of math. actually this just tells the program when to stop doing the math.
        while (high-low>= 0.0000001*(1+x)){
        
        // defines middle and does the math.
        middle = (low+high)/2;
        
    
        
        // mathetmatics. So much work. Basically keeps dividing and whatnot.
        if ((middle*middle) >x)
            high = middle;
        else if ((middle*middle) <=x)
            low = middle;
        
        
        }
        //Gives the answer.
        System.out.println ("The squareroot is " + middle + ".");
}
}