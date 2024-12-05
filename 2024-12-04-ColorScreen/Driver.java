public class Driver{

  public static void main(String[] args){
    int xSize = 80;
    int ySize = 30;
    System.out.println("\033[2J"); //Clears the screen
    border(80, 30);
    int[] randomArray = makeThreeRandomInts();
    System.out.print("\033[0m"); //Resets everything to defaults
  }

  public static void border(int length, int height){
    Text.go(1, 1);
    for(int i = 0; i < length; i++){
      Text.color(41 + (i % 8), 31 + (i % 8));
      System.out.print("l");
    }
    Text.go(2, 1);
    for(int i = 1; i < height - 1; i++){
      Text.color(41 + (i % 8), 31 + (i % 8));
      System.out.print("l");
      Text.go(2 + i, 1);
    }
    Text.go(2, length);
    for(int i = 1; i < height - 1; i++){
      Text.color(41 + (i % 8), 31 + (i % 8));
      System.out.print("l");
      Text.go(2 + i, length);
    }
    Text.go(height, 1);
    for(int i = length; i > 0; i--){
      Text.color(41 + (i % 8), 31 + (i % 8));
      System.out.print("l");
    }
  }

  public static int[] makeThreeRandomInts(){
    int[] returnedArray = new int[3];
    for(int i = 0; i < 3; i++){
      returnedArray[i] = (int)(Math.random() * 100.0);
    }
    return returnedArray;
  }

}
