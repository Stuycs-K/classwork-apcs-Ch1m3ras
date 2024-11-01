// Group members: Ahana Chandra, Alexander Chen

import java.util.Scanner;
public class Driver{
  public static void main(String[] args) {
      Scanner sc = new Scanner("Some String (or File) Here");

      System.out.println("\nExample test:");
      String text = "This is a sample\nOf how to read\ntext!";

      // creates a Scanner object to read throug the String
      Scanner input = new Scanner(text);

      //you don't want a for loop here unless you know the size of the data set

      while(input.hasNext()){
        System.out.println(input.next());
      }

      //Print out each word per one line:
      System.out.println("\nPrinting out a word from each line:");
      Scanner sc1 = new Scanner("This is a bunch of words");
      while(sc1.hasNext()){
        System.out.println(sc1.next());
      }

      //Calculating the sum of values in this string using nextDouble:

      Scanner sc2 = new Scanner("10.0 1.04 99.0 -3.0 4.2");
      double sum = 0;
      while(sc2.hasNextDouble()){
          sum = sum + sc2.nextDouble();
      }
      System.out.println(sum);
    }
  }
