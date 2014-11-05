//Morgan Mok
// Hello Gov'nor

import java.util.Scanner;
public class RandomExperiments {
public static void main (String [] args) {
    
    int nyumber=0;
    Scanner myScanner = new Scanner(System.in);
    
    System.out.println("Enter your name");
        String name = myScanner.next();
            System.out.println("Your name is "+name+".");
    System.out.println("Enter your birthday in a sequence of numbers mmddyyyy. Eg. 03121990");
        int birthdy = myScanner.nextInt();
    System.out.println("do you kill people? Have you thought about killing people? Yy/Nn");
        String answer = myScanner.next();
        if (answer =='Y' || answer=='y') {
            nyumber++;
        }
        else if (answer == 'N' || answer == 'n') {
            nyumber--;
        }
        else System.out.println ("You didn't enter a valid answer. Goodbye.");
    
    System.out.println ("based on your answers, you should be a hufflepuff.");
        }
}
