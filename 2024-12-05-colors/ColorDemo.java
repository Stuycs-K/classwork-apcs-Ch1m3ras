import java.util.ArrayList;

public class ColorDemo{

  public static void main(String[] args){
    String[] colors = {"\u001b[31m", "\u001b[ 38 ; 2 ; 255 ; 165 ; 0 m", "\u001b[33m", "\u001b[32m", "\u001b[34m", "\u001b[ 38 ; 2 ; 255 ; 192 ; 203 m", "\u001b[ 38 ; 2 ; 255 ; 0 ; 255 m"};
    String[] letters = {"r", "a", "i", "n", "b", "o", "w"};

    for(int i = 0; i < colors.length; i++){
      System.out.print(colors[i] + letters[i]);
    }

    System.out.println("\u001b[0m");
    System.out.print("\u001b[?25l");
    String[] colorsWithBackground = {"\u001b[31;41m", "\u001b[33;43m", "\u001b[32;42m", "\u001b[34;44m"};
    ArrayList<String> movingValues = new ArrayList<String>();
    movingValues.add("1");
    for(int i = 0; i < 1000; i++){
      for(int i2 = 0; i2 < movingValues.size(); i2++){
        if(movingValues.get(i2).equals("1")){
          System.out.print(colorsWithBackground[i2 % 4] + "FISH" + "\u001b[0m");
          System.out.print("\u001b[0m");
        }
        else{
          System.out.print("\u001b[30;40mFISH" + "\u001b[0m");
          System.out.print("\u001b[0m");
        }
      }
      System.out.print("\u001b[0m");
      movingValues.add(0, "THUNDER");
      System.out.println();
    }
    System.out.print("\u001b[?25h");
    //Final Reset
    System.out.print("\u001b[0m");
  }

}
