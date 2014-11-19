//Morgan Mok
//mwm217
//CSE2
//BrianChen
/* Here's a poker program that lets you do hands and see odds of getting pairs and stuff */


import java.util.Random;
import java.util.Scanner;
public class PokerOdds{
  
  static int deck[] = new int[52];
  static int size = 0;
  static String values[] = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
      "A", "K", "Q", "J"};
  
  public static void main(String [] arg){
    showHands();
    simulateOdds();
  }
  
  public static void showHands() {
    Scanner scan=new Scanner(System.in); //instance of scanner. allows user input.
    String answer="";
    do{
      showOneHand();
      System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
      answer=scan.next();
    } while(answer.equals("Y") || answer.equals("y")); //same, creates a sentence but pertains to whether or not the 
  }
  
  public static void showOneHand() {
    fillDeck();
    int[] cards = getHand();
    String clubs = "Clubs:";
    String diamonds = "Diamonds:";
    String hearts = "Hearts:";
    String spades = "Spades:";
    
    for (int i = 0; i < 5; i++) {
      int card = cards[i];
      String val = values[card % 13];
      int suit = card / 13;
      if (suit == 0) {
        clubs += " " + val;
      } else if (suit == 1) {
        diamonds += " " + val;
      } else if (suit == 2) {
        hearts += " " + val;
      } else {
        spades += " " + val;
      }
    }
    System.out.println(clubs);
    System.out.println(diamonds);
    System.out.println(hearts);
    System.out.println(spades);
  }
  
  public static void simulateOdds() {
    int freq[] = new int[13];
    for (int i = 0; i < 13; i++) {
      freq[i] = 0;
    }
    int noPair = 0;
    
    for (int i = 0; i < 10000; i++) {
      fillDeck();
      int hand[] = getHand();
      if (exactlyOneDup(hand)) {
        freq[getPair(hand)]++;
      } else {
        noPair++;
      }
    }
    
    System.out.println("rank\tfreq of exactly one pair");
    for (int i = 0; i < 13; i++) {
      System.out.printf("%s\t%d\n", values[i], freq[i]);
    }
    System.out.println("total not exactly one pair: " + noPair);
  }
  
  public static boolean exactlyOneDup(int num[]){
    int count=0;  
    for (int i=0; i<5 ; i++) {
      for (int j=(i+1) ; j<5; j++){ 
        if (num[i] % 13 == num[j] % 13){
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
  
  public static int getPair(int hand[]) {
    for (int i=0; i<5 ; i++) {
      for (int j=(i+1) ; j<5; j++){ 
        if (hand[i] % 13 == hand[j] % 13){
          return hand[i] % 13;
        }
      }
    }
    return -1;
  }
  
  public static void fillDeck() {
    if (size > 5) {
      return;
    }
    for (int i = 0; i < 52; i++) {
      deck[i] = i;
    }
    size = 52;
  }
  
  
  public static int[] getHand() {
    int[] cards = new int[5];
    for (int i = 0; i < 5; i++) {
      int r = (int)(Math.random() * size);
      cards[i] = deck[r];
      deck[r] = deck[--size];
      deck[size] = -1;
    }
    return cards;
  }
}
