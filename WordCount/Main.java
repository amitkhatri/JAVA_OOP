import java.io.File;
import java.util.Scanner;
class Main{
  public static void main(String[] args) throws Exception{
    File file = new File("words.txt");
    Scanner scanner = new Scanner(file);
    int count = 0;
    while(scanner.hasNextLine()){
      String line = scanner.nextLine();
      count += line.split(" ").length;
    }

    System.out.println("This file has " + count + " words");
  }
}
