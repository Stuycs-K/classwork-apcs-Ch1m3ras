import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Day4{

  public static void main(String[] args){
    ArrayList<String> roomList = new ArrayList<String>();
    char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
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
      int[] amountAppeared = new int[26];
      for(int i2 = 0; i2 < roomList.get(i).length() - 7; i2++){
        //System.out.println(roomList.get(i).charAt(i2));
        for(int i3 = 0; i3 < alphabet.length; i3++){
          if(alphabet[i3] == roomList.get(i).charAt(i2)){
            amountAppeared[i3] += 1;
          }
        }
      }
      for(int i4 = 0; i4 < amountAppeared.length; i4++){
        System.out.println(amountAppeared[i4]);
      }
      System.out.println("\n\n");
    }

  }

}
