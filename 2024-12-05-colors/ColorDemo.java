public class ColorDemo{

  public static void main(String[] args){
    String[] colors = {"\u001b[31m", "\u001b[ 38 ; 2 ; 255 ; 165 ; 0 m", "\u001b[33m", "\u001b[32m", "\u001b[34m", "\u001b[ 38 ; 2 ; 255 ; 192 ; 203 m", "\u001b[ 38 ; 2 ; 128 ; 0 ; 128 m"};
    String[] letters = {"r", "a", "i", "n", "b", "o", "w"};

    for(int i = 0; i < colors.length; i++){
      System.out.print(colors[i] + letters[i]);
    }

    
    //Final Reset
    System.out.println("\u001b[0m");
  }

}
