// Morgan
// mwm217
// Brian Chen
// lab 08
// "more loops"

/*Objectives. For this lab session you rewrite for loops as while loops, while loops as do-while loops, etc. 
Below is a program that uses various kinds of loops for various calculations.
For the four sets of code, I ask you to replace the code with code that rewrites the corresponding loops in some other form. 
Most of the replacement code stays the same, except for the kind of loop used. 
In the first case your replacement code  should use do-while loop(s) in place of the while loop; 
in the second case you should use while loops in place of the for loops; 
in the third case your code should replace a do-while loop with a while loop; 
for the fourth case your code should replace the while statement with a for statement and should replace the switch statement with if statements. 
Of course, in all cases, your added code should produce the same output as the corresponding code for which it is rewritten. 
IT IS IMPORTANT THAT YOU CAREFULLY CHECK YOUR PROGRAM TO BE SURE IT BEHAVES THE SAME WAY AS THE ORIGINAL PROGRAM. 
Save your program in the file on Cloud9 in lab08/MoreLoops.java. */

import java.util.Scanner;
public class MoreLoops{
    public static void main(String[] arg){
    Scanner scan=new Scanner(System.in);
    int n=0;

    System.out.print("Enter an int- ");
    while(!scan.hasNextInt()){
        scan.next(); //get rid of the junk entered by user
        System.out.print("You did not enter an int; try again- ");
    }
    //COMMENT OUT THE ABOVE 5 LINES AND REPLACE THE CODE WITH A
    //DO-WHILE LOOP
        n=scan.nextInt();

    for(int j=0;j<n && j<40;j++){
        for(int k=0;k<j+1;k++){
        System.out.print('*');
        }
        System.out.println();
    }
    //COMMENT OUT THE ABOVE SIX LINES OF CODE AND REPLACE WITH
    //WHILE STATEMENTS
      
    int k=4;

    do{
        System.out.println("k="+k);
        k++;
    }
         while(k<4);
        //COMMENT OUT THE ABOVE FIVE LINES AND REPLACE THE CODE
    //WITH A WHILE LOOP

        int count=0;
        while(true){
        switch(n){
        default: System.out.println(n + " is > 5 or <1");
        break;
        case 1:
        case 2: System.out.print("Case 2 ");
        continue;
        case 3: break;
        case 4: System.out.println("Case 4");
        case 5: System.out.println("Case 5");
        break;
        }
        count++;
        if(count>10)
        break;
    }
    //COMMENT OUT THE ABOVE 21 LINES AND REWRITE THE CODE USING
    // ONLY FOR LOOPS AND IF STATEMENS. BEFORE DOING SO, TRY
    //RUNNING THE CODE WITH VARIOUS INPUTTED VALUES, E.G.,
    //   -5, 1, 20, 5, ETC.
    //IF YOU GET AN INFINITE LOOP, YOU CAN STOP IT BY
    //SIMULTANEOUSLY PRESSING THE CTRL KEY AND THE C KEY
    
    }
}