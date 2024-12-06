public class Driver{

  public static void main(String[] args){
    int xSize = 80;
    int ySize = 30;
    System.out.print("\033[2J"); //Clears the screen
    border(80, 30);
    intLine(makeThreeRandomInts());
    divider(80, 5);
    smile(40, 10);
    Text.go(30, 81);
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

  public static void intLine(int[] randomInts){
    for(int i = 0; i < 3; i++){
      Text.go(2, (26 * i) + 12);
      System.out.print("\033[0m");
      colorAssigner(randomInts[i]);
      System.out.print(randomInts[i]);
    }
  }

  public static void colorAssigner(int randomizedInt){
    if(randomizedInt < 25){
      Text.color(1, 31);
    }
    else if(randomizedInt > 75){
      Text.color(1, 32);
    }
    else {
      Text.color(37);
    }
  }

  public static void divider(int length, int height){
    for(int i = 2; i < length; i++){
      Text.go(height, i);
      Text.color(37);
      System.out.print("-");
    }
  }

  public static void smile(int startingX, int startingY){
    Text.go(startingY, startingX);
    Text.color(37, 47);
    System.out.print("H");
    Text.go(startingY, startingX + 7);
    System.out.println("H");
    for(int i = 1; i <= 6; i++){
      if(i == 1 || i == 6){
        Text.go(startingY + 5, startingX + i);
      }
      else{
        Text.go(startingY + 6, startingX + i);
      }
      System.out.println("H");
    }
  }

}
