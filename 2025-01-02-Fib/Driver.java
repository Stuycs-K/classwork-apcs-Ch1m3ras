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
    System.out.println(fib(47));
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

}
