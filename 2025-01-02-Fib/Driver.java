public class Driver{

  public static void main(String[] args){
    //Test cases
    // System.out.println(fib(0));
    // System.out.println(fib(1));
    // System.out.println(fib(2));
    // System.out.println(fib(3));
    // System.out.println(fib(4));
    // System.out.println(fib(5));
    // System.out.println(fib(6));
    // System.out.println(fib(7));
    //System.out.println(fib(47));
    //makeWords(5, "", "fish");
    System.out.println(toWords(11));
  }

  public static int fib(int value){
    if(value == 0){
      return 0;
    }
    else if(value == 1){
      return 1;
    }
    else{
      return fib(value - 1) + fib(value - 2);
    }
  }

  public static void makeWords(int remainingLetters, String result, String alphabet){
    if(remainingLetters == 0){
      System.out.println(result);
    }
    else{
      for(int i = 0; i < alphabet.length(); i++){
        makeWords(remainingLetters - 1, result + alphabet.charAt(i), alphabet);
      }
    }
  }

  public static String toWords(int n){
    if(n < 20){
      String[] numbersLessThan20 = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
      return numbersLessThan20[n - 1];
    }
    return "";
  }

}
