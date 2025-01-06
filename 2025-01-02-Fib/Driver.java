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
    System.out.println(toWords(101));
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
    if(n == 0){
      return "";
    }
    else if(n < 20 && n > 0){
      String[] numbersLessThan20 = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
      return numbersLessThan20[n - 1];
    }
    else if(n >= 20 && n < 30){
      return "twenty " + toWords(n % 10);
    }
    else if(n >= 30 && n < 40){
      return "thirty " + toWords(n % 10);
    }
    else if(n >= 40 && n < 50){
      return "fourty " + toWords(n % 10);
    }
    else if(n >= 50 && n < 60){
      return "fifty " + toWords(n % 10);
    }
    else if(n >= 60 && n < 70){
      return "sixty " + toWords(n % 10);
    }
    else if(n >= 70 && n < 80){
      return "seventy " + toWords(n % 10);
    }
    else if(n >= 80 && n < 90){
      return "eighty " + toWords(n % 10);
    }
    else if(n >= 90 && n < 100){
      return "ninety " + toWords(n % 10);
    }

    return "";
  }

}
