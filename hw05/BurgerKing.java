//Morgan Mok
// mwm217
// hw05
// Burger King
///
///





//For the sake of helping my client, burger king, make money, negative or positive reinforcements are made when the cheaper or pricier options are selected.

//imports java utility.
import java.util.Scanner;
// define public class
    public class BurgerKing {
    public static void main (String [] args) {
        //create instance of "scanner", a featuer allowing user input.
            Scanner myScanner = new Scanner (System.in);
        //the following text is displayed to the user to promt input.
            System.out.print ("What would you like? (B/b for Burger, S/s for Soda, F/f for French Fries. ");
            
            
String cFood = myScanner.next(); /* whatever */


//option 1. they want a burger
switch(cFood) {
    case "B":
    case "b":
        //gets burger; asks whether or not they want cheese.
        System.out.println ("Do you want cheese on your hamburger? C/c = Cheese, N/n = none" ); 
                String cCheese = myScanner.next();
                    if (cCheese.equals("C") || cCheese.equals("c"))
                        System.out.println ("You want a hamburger with cheese. ");
                    if (cCheese.equals("N") || cCheese.equals("n"));
                        System.out.println ("You want a plain hamburger. You must be lactose intolerant?");
                    
                    
        break;
    case "S":
    case "s":
        //gets soda; asks what type they want.
         System.out.println ("What soda do you want?? C/c = Coke, P/p = Pepsi, S/s = Sprite" ) ;
                String cSoda = myScanner.next();
                    if (cSoda.equals("C") || cSoda.equals("c"));
                        System.out.println ("You want a Coke. ");
                    if (cSoda.equals("P") || cSoda.equals("p"));
                        System.out.println ("You want a Pepsi.");
                    if (cSoda.equals("S") || cSoda.equals("s"));
                        System.out.println ("You want a Sprite.");
                    
        break;
    // (...)
    case "F":
    case "f":
        //gets fries; asks what size they want.
         System.out.println ("What size do you want? S/s for small, L/l for large." );
                String cFries = myScanner.next();
                    if (cFries.equals("S") || cFries.equals("s"))
                        System.out.println ("You want a small fries. It must be reflective of other small things. hint hint.");
                    if (cFries.equals("L") || cFries.equals("l"));
                        System.out.println ("You want a large fries. You must have lots of friends who value you.");
       
}

}
}

