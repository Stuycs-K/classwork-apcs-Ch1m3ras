import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Day6{

  public static void main(String[] args){
    ArrayList<String> fileLines = new ArrayList<String>();
    ArrayList<String> fileColumns = new ArrayList<String>(100);

    try{
      File inputFile = new File("Day6.txt");
      Scanner scannedOutput = new Scanner(inputFile);
      while(scannedOutput.hasNextLine()){
        fileLines.add(scannedOutput.nextLine());
      }
    }
    catch (FileNotFoundException e){
      System.out.println("File not found try again.");
      return;
    }

    for(int i = 0; i < fileLines.size(); i++){
      System.out.println(fileLines.get(i));
      for(int i2 = 0; i2 < fileLines.get(i).length(); i2++){
        System.out.println(fileLines.get(i).charAt(i2));
        if(i == 0){
          fileColumns.add(fileLines.get(i).charAt(i2) + "");
        }
        else{
          fileColumns.set(i2, fileColumns.get(i2) + fileLines.get(i).charAt(i2) + "");
        }
      }
    }
    for(int i = 0; i < fileColumns.size(); i++){
      System.out.println(fileColumns.get(i));
    }
  }

}
