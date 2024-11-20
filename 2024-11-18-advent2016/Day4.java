import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Day4{

  public static void main(String[] args){
    ArrayList<String> roomList = new ArrayList<String>();
    int answer = 0;

    try{
      File inputValues = new File("Day4.txt");
      Scanner scannedText = new Scanner(inputValues);
      while(scannedText.hasNextLine()){
        roomList.add(scannedText.nextLine());
      }
    }
    catch (FileNotFoundException e){
    System.out.println("File not found. Try again.");
    return;
    }

    for(int i = 0; i < roomList.size(); i++){
      System.out.println(roomList.get(i));
    }

  }

}
