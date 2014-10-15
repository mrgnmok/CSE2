/*Sample of expected output:
 *   Enter an int- 9
 *   You entered 9
 *   sum is 25
 *   Again, you entered 9
 */

import java.util.Scanner;
public class Enigma0{
  public static void main(String arg []){
    System.out.print("Enter an int- ");
    
  
    
    
    Scanner scan=new Scanner(System.in);
    
    int n = scan.nextInt ();
    
    if (n % 1 == 0){
      
      System.out.println("You entered "+n);
    }
    else{
      n=4;
      System.out.println("You entered "+n);
    }
    
    int k=4,p=6,q=7,r=8;
    switch(k+p+q+r){
      case 24: 
      case 25: System.out.println("sum is 25");
      default:
        System.out.println("To repeat, you entered "+n);
    }
  }
}

/* Error report:
 *   Expand this comment:
 


1) n was never declared in its proper place.
2)line 31, case 24 should do something.
3) line 20 was converted to (n modulo 1). Decides whether it is actually an integer.
4) integers k,p,q,r,n were declared together. n was removed because it was previously declared (in my modifications).




 *   Explain the error(s) that occurred here, and then fix them
 */
