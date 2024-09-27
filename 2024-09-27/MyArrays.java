public class MyArrays{

  public static String arrayToString(int[] nums){
    String returnedString = "[";
    for(int i = 0; i < nums.length; i++){
      if(i == nums.length - 1){
        returnedString = returnedString + nums[i];
      }
      else{
        returnedString = returnedString + nums[i] + ", ";
      }
    }
    returnedString = returnedString + "]";
    return returnedString;
  }

  public static int[] returnCopy(int[] ary){
    int[] returnedArray = new int[ary.length];
    for(int i = 0; i < ary.length; i++){
      returnedArray[i] = ary[i];
    }
    return returnedArray;
  }


  public static void main(String[] args){
    System.out.println("Hello World");
    int[] testingArray = {1,2,3,4,5,56};
    System.out.println(arrayToString(testingArray));
    System.out.println("Returning a copy of testingArray which returns: " + arrayToString(returnCopy(testingArray)) + "and it is a " + (String)(returnCopy(testingArray) == testingArray) + "copy.");
  }
}
