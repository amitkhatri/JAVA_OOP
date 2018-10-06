import java.io.*;
import java.util.*;
class Game{
  private String movieName, currentState;
  private int guesses;
  private File inputFile;
  private Scanner scanner;

  Game() throws Exception{
    inputFile = new File("movies.txt");
    scanner = new Scanner(inputFile);
    guesses = 0;
    selectMovie();
    initState();
    System.out.println(movieName);
    System.out.println(currentState);
  }

  private void selectMovie(){
    Random rand = new Random();
    int randomNumber = rand.nextInt(20);
    for(int i = 0; i < randomNumber; i++){
      movieName = scanner.nextLine();
    }
  }

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
