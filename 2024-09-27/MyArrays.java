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

  public static void main(String[] args){
    System.out.println("Hello World");
    int[] testingArray = {1,2,3,4,5,56};
    System.out.println(arrayToString(testingArray));
  }
}
