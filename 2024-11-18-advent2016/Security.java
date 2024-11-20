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
      for(int i2 = 0; i < commands.get(i).length(); i2++){
        System.out.println(commands.get(i).charAt(i2));
      }
      System.out.println("Part Over \n\n");
    }




  }

}
