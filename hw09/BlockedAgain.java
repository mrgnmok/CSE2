//mwm217
//Morgan Mok
// CSE2
//Brian Chen
//Blocked Again, HW08


import java.util.Scanner; //Imports the java Scanner utlity which accepts input from users.

public class BlockedAgain {
    
    public static void main(String[] s) { // given main method; cannot be changed.
        int m;
        //force user to enter int in range 1-9, inclusive.
        m = getInt();
        allBlocks(m); 
    }
    
    public static int getInt() { //method "getInt" deals with the user input.
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an in int between 1 and 9, inclusive: ");
        while (true) { //Boolean statement, While this is true...
            if (checkInt(myScanner)) {// if calls method "checkInt"
                int num = myScanner.nextInt(); // input is considered 'num'.
                if (checkRange(num) != 0) { // calls checkRange method.
                    return num; //returns variable num.
                }
                else {
                    System.out.print("You did not enter an int in [1,9]; try again: ");
                    //prompts user to try again.
                }
            }
            else {
                myScanner.next();
                System.out.print("You did not enter an int; try again: "); //prompts user to try again in case of failure to input correctly.
            }
        }
    }







    // this method checks the integer for integeriness. Is it an integer? 
    public static boolean checkInt(Scanner scanner) {
        return scanner.hasNextInt(); // the boolean statement simply confirms whether or not the input is an integer.
    }
    public static int checkRange(int num) { //method checkRange.
        if (num > 0 && num <= 9) { //determines whether or not the input is within the given constraints.
            return num; // if it is, return the variable, num.
        }
        else
            return 0; //otherwise, do not.
    }


    public static void allBlocks(int num) { //method "allBlocks"
        for (int i = 1; i <= num; i++) { //uses a number Holder to go number by number and send it as input to the Blocks.
            block(i, num - i);
        }
    }
    
    public static void block(int n, int indent) { //Method "block". Deals with sorting the numbers into the tower at the individual level.
        for (int i = 0; i < n; i++) { // deals with the integer and uses a number holder as an input to deal with what to do.
            line(Integer.toString(n).charAt(0), n, indent); // creates an indent based on what number is submitted.
        }
        line('-', n, indent); 
    }
    
    public static void line(char c, int n, int indent) { //deals with the lines of numbers at the individual level.
        for (int i = 0; i < indent; i++) { //also uses the i placeholder to determine indent.
            System.out.print(" "); //prints a space.
        }
        for (int i = 0; i < n * 2 - 1; i++) {
            System.out.print(c); // prints C.
        }
        System.out.println(); //prints into a new line.
    }

}

  
