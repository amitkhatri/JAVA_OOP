import java.io.*;
import java.util.*;
import java.lang.StringBuilder;
class Game{
  private String movieName, currentState;
  private int guessesLeft;
  private File inputFile;
  private Scanner scanner;

  Game() throws Exception{
    inputFile = new File("movies.txt");
    scanner = new Scanner(inputFile);
    guessesLeft = 10;
    selectMovie();
    initState();
  }

  public String getcurrentState(){
    return currentState;
  }

  public int getguessesLeft(){
    return guessesLeft;
  }

  public boolean guess(String letter){
    boolean found = false;
    StringBuilder builder = new StringBuilder(currentState);
    for(int i = 0; i < movieName.length(); i++){
      if(movieName.charAt(i) == letter.charAt(0)){
        builder.setCharAt(i,letter.charAt(0));
        currentState = builder.toString();
        found = true;
        guessesLeft--;
      }
    }
    return found;
  }

  //Randomly select a movie
  private void selectMovie(){
    Random rand = new Random();
    int randomNumber = rand.nextInt(20);
    for(int i = 0; i < randomNumber; i++){
      movieName = scanner.nextLine();
    }
  }

  //Initialize game state
  private void initState(){
    currentState = "";
    for(int i = 0; i < movieName.length(); i++){
      if(movieName.charAt(i) == ' '){
        currentState += ' ';
      } else{
        currentState += '_';
      }
    }
  }


}
