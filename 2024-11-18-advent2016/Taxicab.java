import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Taxicab{
  //Plan: Use hasNext() and next() to seperate commands.
  //Use a degree variable(with north being 0) and distanceDirection to measure how far they went in one direction or another (set south and west as negative and north and east as positive.)
  //Sum the absolute value of north and east to get displacement.
  public static void main(String[] args){
    ArrayList<String> directions = new ArrayList<String>();
    ArrayList<Integer> distances = new ArrayList<Integer>();
    int distanceUp = 0;
    int distanceRight = 0;
    int direction = 0;

    try {
        File taxiInputs = new File("TaxicabInputs.txt");
        Scanner inputDirection = new Scanner(taxiInputs);
        Scanner inputDistances = new Scanner(taxiInputs);
        while(inputDirection.hasNext()){
          directions.add(inputDirection.next());
        }
        while(inputDistances.hasNextInt()){
          distances.add(inputDistances.nextInt());
        }
    }
    catch (FileNotFoundException e){
        System.out.println("File not found. Try again.");
        return;
    }
    

  }
}
