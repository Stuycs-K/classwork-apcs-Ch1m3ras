public class Driver{

  public static void main(String[] args){
    int xSize = 80;
    int ySize = 30;
    System.out.println("\033[2J"); //Clears the screen
    makeUpperAndLowerBorder(80, 30);
    System.out.print("\033[0m"); //Resets everything to defaults
  }

  public static void makeUpperAndLowerBorder(int length, int height){
    Text.go(1, 1);
    for(int i = 0; i < length; i++){
      Text.color(41 + (i % 8), 31 + (i % 8));
      System.out.print("l");
    }
    Text.go(height, 1);
    for(int i = length; i > 0; i--){
      Text.color(41 + (i % 8), 31 + (i % 8));
      System.out.print("l");
    }
  }

}
