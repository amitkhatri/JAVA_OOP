import java.io.*;
import java.util.*;
class Main{
  public static void main(String args[]) throws Exception{
    Game game = new Game();
    Scanner scanner = new Scanner(System.in);
    String guess;

    System.out.println("Welcome to Guess The Movie");
    System.out.println("You have " + game.getguessesLeft() + " guesses left, guess a letter\n");
    System.out.println(game.getcurrentState());

    while(game.getguessesLeft() > 0){
      guess = scanner.nextLine();
      if(game.guess(guess)){
        System.out.println("The letter you entered exists!");
        System.out.println(game.getcurrentState());
      } else{
        System.out.println("Guess again!");
      }
    }
  }
}
