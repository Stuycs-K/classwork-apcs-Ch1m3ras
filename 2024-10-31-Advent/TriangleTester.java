import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriangleTester{

  public static int countTrianglesA(String filename){
    int count = 0;
    try {
      File file = new File(filename);
      Scanner input = new Scanner(file);
      int[] pointStorage = new int[3];

      while(input.hasNextLine() && input.hasNextInt()){
        for(int i = 0; i < 3; i++){
          int chosenPoint = input.nextInt();
          pointStorage[i] = chosenPoint;
          // System.out.println(chosenPoint);
        }
        int sumA = pointStorage[0] + pointStorage[1];
        int sumB = pointStorage[1] + pointStorage[2];
        int sumC = pointStorage[0] + pointStorage[2];
        if(sumA > pointStorage[2] && sumB > pointStorage[0] && sumC > pointStorage[1]){
          count++;
        }
      }
    } catch (FileNotFoundException e){
      System.out.println("File was not found.");
      return 0;
    }
    return count;
  }

  public static int countTrianglesB(String filename){
    int count = 0;
    try {
      File file = new File(filename);
      Scanner input = new Scanner(file);
    } catch (FileNotFoundException e){
      System.out.println("File was not found.");
      return 0;
    }
    return count;

  }

  public static void main(String[] args){
    System.out.println("Expected 2. Recieved: " + countTrianglesA("inputTri.txt"));
  }

}
