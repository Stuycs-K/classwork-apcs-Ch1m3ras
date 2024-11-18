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
    // ArrayList<Integer> distances = new ArrayList<Integer>();
    int distanceUp = 0;
    int distanceRight = 0;
    int direction = 0;

    try {
        File taxiInputs = new File("TaxicabInputs.txt");
        // File taxiInputs2 = new File("TaxicabInputs.txt");
        Scanner inputDirection = new Scanner(taxiInputs);
        // Scanner inputDistances = new Scanner(taxiInputs2);
        while(inputDirection.hasNext()){
          String stuffInputed = inputDirection.next();
          System.out.println(stuffInputed);
          directions.add(inputDirection.next());
        }
        // while(inputDistances.hasNextInt()){
        //   int stuffInputed = inputDistances.nextInt();
        //   System.out.println(stuffInputed);
        //   distances.add(stuffInputed);
        // }
    }
    catch (FileNotFoundException e){
        System.out.println("File not found. Try again.");
        return;
    }

    for(int i = 0; i < directions.size(); i++){
      if(directions.get(i).substring(0,1).equals("L")){
        direction = direction - 90;
        System.out.println(direction);
      }
      else if(directions.get(i).substring(0,1).equals("R")){
        direction = direction + 90;
        System.out.println(direction);
      }

    //   if(direction % 360 == 0){
    //     distanceUp += distances.get(i);
    //   }
    //   else if(direction % 270 == 0){
    //     distanceRight -= distances.get(i);
    //   }
    //   else if(direction % 180 == 0){
    //     distanceUp -= distances.get(i);
    //   }
    //   else{
    //     distanceRight += distances.get(i);
    //   }
    }

  }



}
