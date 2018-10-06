import java.util.Scanner;
import java.util.Random;

class Main{
  public static void main(String[] args){

    Random rand = new Random();
    Scanner scanner = new Scanner(System.in);
    int randomNumber = rand.nextInt(100);
    int guesses = 10;
    int guess = 0;
    boolean hasWon = false;
    System.out.println(randomNumber);

    while(guesses > 0){
      System.out.println("Guess A Number! You have " + guesses + " guesses left.");
      guess = scanner.nextInt();
      if(guess < randomNumber){
        System.out.println("Your guess was too low");
        guesses--;
      }else if(guess > randomNumber){
        System.out.println("Your guess was too high");
        guesses--;
      }else{
        hasWon = true;
        break;
      }
    }

    if(hasWon){
      System.out.println("Well Done!");
    }else{
      System.out.println("Better luck next time!");
    }


  }
}
