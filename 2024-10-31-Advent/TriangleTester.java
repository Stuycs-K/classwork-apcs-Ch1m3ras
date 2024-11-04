import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriangleTester{

  public static int countTrianglesA(String filename){
    int count = 0;
    File file = new File(filename);
    try {
      Scanner input = new Scanner(file);
      int[] pointStorage = new int[3];

      while(input.hasNextLine()){
        for(int i = 0; i < 3; i++){
          pointStorage[i] = input.nextInt();
        }
        //FIX ERROR LATER
        System.out.println(Arrays.toString(pointStorage));

      }
    }

    catch (FileNotFoundException e){
      System.out.println("File was not found");
    }
    return 0;
  }

  public static void main(String[] args){
    countTrianglesA("inputTri.txt");
  }

}
