import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Day6{

  public static void main(String[] args){
    ArrayList<String> fileLines = new ArrayList<String>();
    ArrayList<String> fileColumns = new ArrayList<String>();
    char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    String answer = "";

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
      // System.out.println(fileLines.get(i));
      for(int i2 = 0; i2 < fileLines.get(i).length(); i2++){
        // System.out.println(fileLines.get(i).charAt(i2));
        if(i == 0){
          fileColumns.add(fileLines.get(i).charAt(i2) + "");
        }
        else{
          fileColumns.set(i2, fileColumns.get(i2) + fileLines.get(i).charAt(i2) + "");
        }
      }
    }
    for(int i = 0; i < fileColumns.size(); i++){
      //System.out.println(fileColumns.get(i));
      int[] amountAppeared = new int[26];
      for(int i2 = 0; i2 < fileColumns.get(i).length(); i2++){
        for(int i3 = 0; i3 < alphabet.length; i3++){
          if(alphabet[i3] == fileColumns.get(i).charAt(i2)){
            amountAppeared[i3] += 1;
          }
        }
      }
      // for (int i4 = 0; i4 < amountAppeared.length; i4++){
      //   System.out.println(alphabet[i4] + " " + amountAppeared[i4]);
      // }
      // System.out.println("\n\n");
      int referenceOfHighest = 0;
      int currentHighest = 0;
      //System.out.println(referenceOfHighest);
      //System.out.println(currentHighest);
      for(int i5 = 0; i5 < amountAppeared.length; i5++){
        if(amountAppeared[i5] > currentHighest){
          referenceOfHighest = i5;
          currentHighest = amountAppeared[i5];
        }
      }
      answer = answer + alphabet[referenceOfHighest];
    }
    System.out.println(answer);

  }

}
