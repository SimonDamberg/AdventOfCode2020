import java.io.*;
import java.util.*;

public class Day2Part2 {

    public static void main(String[] args) throws FileNotFoundException{
      int noValidPasswords = 0;
      File file = new File("day2.txt");
      Scanner scanner = new Scanner(file);
      String InputString = "";
      while(scanner.hasNextLine()){
        InputString = scanner.nextLine();
        int firstPos = Integer.parseInt(InputString.split("\\-", 0)[0]);
        int lastPos = Integer.parseInt(InputString.split("\\-", 0)[1].split(" ", 0)[0]);
        char letter = InputString.split(" ", 0)[1].charAt(0);
        String password = InputString.split(" ", 0)[2];
        int charOccurences = 0;
        if(password.charAt(firstPos-1) == letter || password.charAt(lastPos-1) == letter){
          if(password.charAt(firstPos-1) == letter ^ password.charAt(lastPos-1) == letter){
            noValidPasswords++;
          }
        }
      }
      System.out.println("Counter: " + noValidPasswords);
    }
}
