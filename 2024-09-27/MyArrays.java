public class MyArrays{

  public static String arrayToString(int[] nums){
    //Starting bracket as every returned answer requires that.
    String returnedString = "[";
    for(int i = 0; i < nums.length; i++){
      //Checking to see if it's the last term to make sure there is no hanging comma at the end.
      if(i == nums.length - 1){
        returnedString = returnedString + nums[i];
      }
      else{
        returnedString = returnedString + nums[i] + ", ";
      }
    }
    //Same logic as the starting bracket, all code will go through this point, and thus we add the ending bracket
    returnedString = returnedString + "]";
    return returnedString;
  }

  public static int[] returnCopy(int[] ary){
    int[] returnedArray = new int[ary.length];
    //Looping through the code to copy every value from the original array and putting it into the new array.
    for(int i = 0; i < ary.length; i++){
      returnedArray[i] = ary[i];
    }
    return returnedArray;
  }

  public static int[] concatArray(int[] ary1, int[] ary2){
    int[] returnedArray = new int[ary1.length + ary2.length];
    int returnedArrayIndex = 0;
    for(int i = 0; i < ary1.length; i++){
      returnedArray[returnedArrayIndex] = ary1[i];
      returnedArrayIndex++;
    }
    for(int i = 0; i < ary2.length; i++){
      returnedArray[returnedArrayIndex] = ary2[i];
      returnedArrayIndex++;
    }
    return returnedArray;
  }


  public static void main(String[] args){
    //Testing to make sure the function runs at all
    System.out.println("Hello World");
    int[] testingArray = {1,2,3,4,5,56};
    //Test case for arrayToString
    System.out.println(arrayToString(testingArray));

    //Test cases for returnCopy
    if(!(testingArray == returnCopy(testingArray))){
      System.out.println("Return Copy functions as it's supposed to.");
    }
    else{
      System.out.println("Return Copy does not function as it's supposed to. More testing required. ");
    }

    //Test Cases for concatArray
    int[] concat1 = {1, 5, 6, 8, 10};
    int[] concat2 = {1, 1, 1, 56};
    System.out.println(arrayToString(concat1) + " concatenated with " + arrayToString(concat2) + " returns " + arrayToString(concatArray(concat1, concat2)));
  }
}
