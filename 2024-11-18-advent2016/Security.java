import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Security{

  public static void main(String[] args){
    int[][] board = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    ArrayList<String> commands = new ArrayList<String>();
    int currentPlaceHorizontal = 1;
    int currentPlaceVertical = 1;
    String finalAnswer = "";

    try {
      File securityInputs = new File("Security.txt");
      Scanner scannerInputs = new Scanner(securityInputs);
      while(scannerInputs.hasNextLine()){
        commands.add(scannerInputs.nextLine());
      }
    }
    catch (FileNotFoundException e){
        System.out.println("File not found. Try again.");
        return;
    }

    for(int i = 0; i < commands.size(); i++){
      String currentStringUsed = commands.get(i);
      for(int i2 = 0; i2 < currentStringUsed.length(); i2++){
        char currentCommand = currentStringUsed.charAt(i2);

        if(currentCommand == 'U'){
          currentPlaceHorizontal -= 1;
          //System.out.println(currentCommand + " x: " + currentPlaceHorizontal + " y: " + currentPlaceVertical);
        }
        else if(currentCommand == 'D'){
          currentPlaceHorizontal += 1;
          //System.out.println(currentCommand + " x: " + currentPlaceHorizontal + " y: " + currentPlaceVertical);
        }
        else if(currentCommand == 'L'){
          currentPlaceVertical -= 1;
          //System.out.println(currentCommand + " x: " + currentPlaceHorizontal + " y: " + currentPlaceVertical);
        }
        else if(currentCommand == 'R'){
          currentPlaceVertical += 1;
          //System.out.println(currentCommand + " x: " + currentPlaceHorizontal + " y: " + currentPlaceVertical);
        }

        if(currentPlaceVertical < 0){
          currentPlaceVertical += 1;
        }
        else if(currentPlaceVertical > 2){
          currentPlaceVertical -= 1;
        }

        if(currentPlaceHorizontal < 0){
          currentPlaceHorizontal += 1;
        }
        else if(currentPlaceHorizontal > 2){
          currentPlaceHorizontal -= 1;
        }
        System.out.println(board[currentPlaceHorizontal][currentPlaceVertical]);

      }
      System.out.println("\n\n One part done \n\n");
      System.out.println(board[currentPlaceHorizontal][currentPlaceVertical]);
      finalAnswer = finalAnswer + board[currentPlaceHorizontal][currentPlaceVertical];

    }
    System.out.println(finalAnswer);



  }

}
