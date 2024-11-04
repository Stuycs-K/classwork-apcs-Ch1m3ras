// Group members: Ahana Chandra, Alexander Chen

//1 you need all three imports.
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

  public static void main(String[] args) {
    //2 Opening a file requires a try/catch
    try {
      File file = new File("ReadFile.java");//1
      Scanner input = new Scanner(file);
      //CODE THAT SCANS THE FILE.

      //Printing every other line of text:
      System.out.println("\nCode that checks to print every other line of text");
      int counter = 0;
      while(input.hasNextLine()){
        if(counter == 0){
          counter++;
          System.out.println(input.nextLine());
        }
        else if(counter == 1){
          counter = 0;
          input.nextLine();
        }
      }

      System.out.println("\nCode that checks if a line has an starting bracket");
      Scanner input2 = new Scanner(file);
      while(input2.hasNextLine()){
        String nextLine = input2.nextLine();
        if(nextLine.indexOf("{") > -1){
          System.out.println(nextLine);
        }
      }

      //input.close();//releases the file from your program
      System.out.println("Works");

    } catch (FileNotFoundException ex) {
      //File not found what should you do?
      System.out.println("File not found");
      return; //you can return from a void function just don't put a value.
    }
  }
}
