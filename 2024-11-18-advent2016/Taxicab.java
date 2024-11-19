`import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Taxicab{
  //Plan: Use hasNext() and next() to seperate commands.
  //Use a degree variable(with north being 0) and distanceDirection to measure how far they went in one direction or another (set south and west as negative and north and east as positive.)
  //Sum the absolute value of north and east to get displacement.
  public static void main(String[] args){
    ArrayList<String> directions = new ArrayList<String>();
    int distanceUp = 0;
    int distanceRight = 0;
    int direction = 0;

    try {
        File taxiInputs = new File("TaxicabInputs.txt");
        Scanner inputDirection = new Scanner(taxiInputs);
        while(inputDirection.hasNext()){
          String stuffInputed = inputDirection.next();
          System.out.println(stuffInputed);
          directions.add(inputDirection.next());
        }
    }
    catch (FileNotFoundException e){
        System.out.println("File not found. Try again.");
        return;
    }

    for(int i = 0; i < directions.size(); i++){
      String mainPart = directions.get(i);
      String facing = mainPart.substring(0,1);
      System.out.println(facing);
      if(facing.equals("L")){
        direction = direction - 90;
      }
      else if(facing.equals("R")){
        direction = direction + 90;
      }

      String movement2 = mainPart.substring(1, mainPart.length() - 1);
      int movement = Integer.parseInt(mainPart.substring(1, mainPart.length() - 1));
      System.out.println(movement2);
    }



  }



}
