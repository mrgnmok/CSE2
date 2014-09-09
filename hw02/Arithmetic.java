//Morgan Mok
// CSE2
//Homework 2, Arithmetic
//Brian Chen
// mwm217   

///////

//This program is designed to calculate the total costs of a shopping trip.
//This program will include the amount due before and after taxation.


//Explain Public Class
    public class Arithmetic {
        public static void main (String [] args) {
            
            //These are the variables needed, and their quantities.
    
            
                int nSocks=3; //The number of socks purchased.
                double sockCost$=2.58; // The cost per pair of socks in dollars.
                int nDrinkingGlass=6; // The number of Drinking Glasses purchased
                double drinkingGlassCost$=2.29; // The cost per Drinking Glass
                int nEnvelopes=1; //The number of boxes of envelopes purchased.
                double envelopesCost$=3.25; // The cost per box of envelopes
                double taxPercent=0.06; // The percentage due as tax.
                
                
 /* before examining the following: understand that there is a reason
    for the use of variables  "PriceBeforeTax" and "PriceAfterTax" instead of 
    simply using a calculation for the values within the final step. 
            
    In other words, instead of making the println lines perform the calculations ,
    they are done first.
            
    This makes the program more flexible. If the values are changed, or if the items are changed,
    they can be quickly adapted and do not require the rewriting of the println statements.*/ 
            
              
        
            // From here we can create an additional set of variables, which are the price before and after tax.
                double PriceBeforeTax=((nSocks*sockCost$)+
                (nDrinkingGlass*drinkingGlassCost$)+(nEnvelopes*envelopesCost$));
                    //The above is the price of all goods purchased before taxation.
                double PriceAfterTax=(PriceBeforeTax+(PriceBeforeTax*taxPercent));
                    //The above is the price of all goods purchased after taxation is applied.
                    
                    
                    
            // The Equations are as follows: they will be printed in text.
                System.out.println("The Price Before Tax is"+PriceBeforeTax+"dollars.");
                    //Above is the amount of money the items will cost in dollars.
                System.out.println("The Price After Tax is"+(PriceAfterTax)+"dollars.");
                    //Above is the amount of money the items will cost in dollars with tax.
        }
    }