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
        if(isTriangle(pointStorage)){
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
      // int[][] numStorage =
      // while(intput.hasNextInt()){
      //
      // }
    } catch (FileNotFoundException e){
      System.out.println("File was not found.");
      return 0;
    }
    return count;

  }

  public static boolean isTriangle(int[] triangleArray){
    int sumA = triangleArray[0] + triangleArray[1];
    int sumB = triangleArray[1] + triangleArray[2];
    int sumC = triangleArray[0] + triangleArray[2];
    if(sumA > triangleArray[2] && sumB > triangleArray[0] && sumC > triangleArray[1]){
      return true;
    }
    else{
      return false;
    }
  }

  public static void main(String[] args){
    System.out.println("Expected 2. Recieved: " + countTrianglesA("inputTri.txt"));
  }

}
