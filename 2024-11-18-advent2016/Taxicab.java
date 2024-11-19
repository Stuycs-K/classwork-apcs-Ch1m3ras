import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Taxicab{
  //Plan: Use hasNext() and next() to seperate commands.
  //Use a degree variable(with north being 0) and distanceDirection to measure how far they went in one direction or another (set south and west as negative and north and east as positive.)
  //Sum the absolute value of north and east to get displacement.
  public static void main(String[] args){
    String stringOfValues;
    String[] arrayOfValues;
    int[][] arrayOfModifiers = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    int xMovement = 0;
    int yMovement = 0;
    int facing = 0;

    try {
        File taxiInputs = new File("TaxicabInputs.txt");
        Scanner scannerInputs = new Scanner(taxiInputs);
        stringOfValues = scannerInputs.nextLine();
    }
    catch (FileNotFoundException e){
        System.out.println("File not found. Try again.");
        return;
    }

    arrayOfValues = stringOfValues.split(", ");
    for(int i = 0; i < arrayOfValues.length; i++){
      if(arrayOfValues[i].substring(0,1).equals("L")){
        facing -= 1;
      }
      else if(arrayOfValues[i].substring(0,1).equals("R")){
        facing += 1;
      }

      facing = (facing + 4) % 4;
      int amountMoved = Integer.parseInt(arrayOfValues[i].substring(1));
      xMovement += amountMoved * arrayOfModifiers[facing][0];
      yMovement += amountMoved * arrayOfModifiers[facing][1];
      //System.out.println(arrayOfValues[i] + " x: " + xMovement + " y: " + yMovement);

    }
    System.out.println(xMovement + yMovement);

  }



}
