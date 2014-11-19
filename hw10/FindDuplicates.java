//Morgan Mok
//mwm217
//CSE2
//HW10
//FindDuplicates
//Brian Chen

/*This is a program that will prompt a user to enter 10 integers, then 
output a statement which identifying the existence of duplicates*/

import java.util.Scanner; 
public class FindDuplicates { //This is the class.
  public static void main(String [] arg){ //main method.
    Scanner scan=new Scanner(System.in); //instance of scanner. allows user input.
    int num[]=new int[10]; // this thing says that I want a new array named num. It's a bunch of a numbers. 10.
    String answer="";
    do{
      System.out.print("Enter 10 ints- "); // prompts user for input.
      for(int j=0;j<10;j++){ //loop that declares variable j as 0, and adds one to it every time it goes through the loop.
        num[j]=scan.nextInt(); //looks at the location in the array (bunch of numbers)
      }
      String out="The array "; //outputs "The array" for the user.
      out+=listArray(num); //return a string of the form "{2, 3, -9}"   
      if(hasDups(num)){ //loop that calls method "hasDups". more details in the respective comments.
        out+="has ";
      }
      else{
        out+="does not have "; // prints text.
      }
      out+="duplicates."; 
      System.out.println(out);
      out="The array ";
      out+=listArray(num);    
      if(exactlyOneDup(num)){
        out+="has "; // that stuff above is all words that are strung together based on meeting constraints to see what sentence gets formed.
      }
      else{
        out+="does not have "; // 
      }
      out+="exactly one duplicate.";
      System.out.println(out);
System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
      answer=scan.next();
    }while(answer.equals("Y") || answer.equals("y")); //same, creates a sentence but pertains to whether or not the 
  }

  public static String listArray(int num[]){
    String out="{";
    for(int j=0;j<num.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=num[j];
    }
    out+="} ";
    return out;
  }
  public static boolean hasDups(int num[]){
    for (int i=0; i<10 ; i++) {
      for (int j=(i+1) ; j<10; j++){ 
        if (num[i]==num[j]){
          return true;
        }
      }
    }
    return false;
  }


  public static boolean exactlyOneDup(int num[]){
    int count=0;  
    for (int i=0; i<10 ; i++) {
      for (int j=(i+1) ; j<10; j++){ 
        if (num[i]==num[j]){
          count++;
        }
      }
    }
    if (count==1) {
      return true;
    } else {
      return false;
    }
  }
}
