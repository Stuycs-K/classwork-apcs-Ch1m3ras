import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Day4{

  public static void main(String[] args){
    ArrayList<String> roomList = new ArrayList<String>();
    char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    int total = 0;

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
      String answer = "";
      int[] amountAppeared = new int[26];
      for(int i2 = 0; i2 < roomList.get(i).length() - 7; i2++){
        //System.out.println(roomList.get(i).charAt(i2));
        for(int i3 = 0; i3 < alphabet.length; i3++){
          if(alphabet[i3] == roomList.get(i).charAt(i2)){
            amountAppeared[i3] += 1;
          }
        }
      }

      // System.out.println("\n\n\n");
      // for(int i6 = 0; i6 < amountAppeared.length; i6++){
      //   System.out.println(amountAppeared[i6]);
      // }

      int placeholderIntForHighestValues = 999;
      int[] indexOfHighestValues = {placeholderIntForHighestValues, placeholderIntForHighestValues, placeholderIntForHighestValues, placeholderIntForHighestValues, placeholderIntForHighestValues};
      for(int i4 = 0; i4 < indexOfHighestValues.length; i4++){
        int currentMax = 0;
        for(int i5 = 0; i5 < amountAppeared.length; i5++){
          if(amountAppeared[i5] > currentMax && (i5 != indexOfHighestValues[0] && i5 != indexOfHighestValues[1] && i5 != indexOfHighestValues[2] && i5 != indexOfHighestValues[3] && i5 != indexOfHighestValues[4])){
            currentMax = amountAppeared[i5];
            indexOfHighestValues[i4] = i5;
          }
        }
        // System.out.println(indexOfHighestValues[i4] + " " + alphabet[indexOfHighestValues[i4]]);
        answer = answer + alphabet[indexOfHighestValues[i4]];

      }
      // System.out.println(answer);
      // System.out.println(roomList.get(i).substring(roomList.get(i).length() - 6, roomList.get(i).length() - 1));
      int roomId = Integer.parseInt(roomList.get(i).substring(roomList.get(i).length() - 10, roomList.get(i).length() - 7));
      System.out.println(roomId);
      if(answer.equals(roomList.get(i).substring(roomList.get(i).length() - 6, roomList.get(i).length() - 1))){
        total += roomId;
      }
    }
    System.out.println(total);

  }

}
