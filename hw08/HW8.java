//Morgan
//mwm217
//HW08
//Brian Chen

// This program does stuff. Or so I've been told.




import java.util.Scanner; //import scanner utility. allows for input from user.
public class HW8 { // define the public class.
  public static void main(String[] arg) {
    char input;
    Scanner scan = new Scanner(System.in); //accepts input from a user
    // the following line prompts the user for input by printing the text below.
    System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");
    input = getInput(scan, "Cc"); // calls the method below.
    System.out.println("You entered '" + input + "'"); // prints this text out.
    System.out.print("Enter 'y', 'Y', 'n', or 'N'- "); // prints this text out.
    input = getInput(scan, "yYnN", 5); //give up after 5 attempts

    if (input != ' ') { // checks to see if the input matches the condition of not being ' '
      System.out.println("You entered '" + input + "'"); // shows this text.
    }
    input = getInput(scan, "Choose a digit.", "0123456789"); // calls method to use the text as seperated by commas as seperate units which can be manipulate by the method.
    System.out.println("You entered '" + input + "'"); // prints this text.
  }

  public static char getInput(Scanner s, String str) { // define method
    while (true) 
    {
      char input=' ';
      // condition for running loop
      String next=s.next();
      if (next.length() == 1) {

        input = (next.charAt(0));
       
        return input;
      } //converts from String to char. Now it's usable for the "to-come" stuff.
      else {
        System.out.println("You didn't enter one character.");
      } // do this 

      if (input == 'c' || input == 'C') // if the input from user is C or c then...
        {
        return input; //
        }
        
      else {System.exit(0);
}
    }
  }
  public static char getInput(Scanner s, String str, int numbeHolder) {

    char input=' ';
    String input1=s.next(); // It's a new variable that does stuff!!!!!! lol. lets me use s.next again.
    if (input1.length() == 1) {

      input = input1.charAt(0);
    } //converts from String to char. Now it's usable for the "to-come" stuff.
    else {
      System.out.println("You didn't enter one character.");
    }
    for (int i = 0; i < str.length(); i++) {
      if (input == str.charAt(i)) {
        return input;
      }
      else {
        System.out.println("You are mistaken in your input. Please try again");
      }
      System.out.println("Enter 'y', 'Y', 'n', or 'N'- ");

    }
    System.out.println("You failed to enter a correct letter.");
    return ' ';


  }




  public static char getInput(Scanner s, String str, String digits) {

char toReturn=' ';
    System.out.println(str); // prints out text assigned from the call.
    String prompt = "Enter one of :'"; // prompts user. prints text.
    
    for (int k = 0; k < digits.length(); k++) { //loop that sorts the input string numbers into serpated numbers.
      if( k == digits.length()-1) // an if statement that just cycles through the characters and assigns some punctuation.
        prompt += (digits.charAt(k) + "'");
      else  
        prompt += (digits.charAt(k) + "', '");
    }
    
    System.out.print(prompt); // prints text. prompts user.
    String input1 = s.next(); // accepts input.
    char input = input1.charAt(0);// locates specific character from string. Defines it as variable input.
    
    for (int k = 0; k < digits.length(); k++) { //loop that sorts the input string numbers into serpated numbers.
      if(digits.charAt(k) == input) 
        toReturn=digits.charAt(k); 
    }
    return toReturn; //sends to main method.
  }


}
