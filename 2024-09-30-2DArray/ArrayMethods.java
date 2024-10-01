public class ArrayMethods{
  //1. Write both your names + emails at the top of the document as a comment.\
  // lbenitez60@stuy.edu Leonardo Benitez
  // alexanderc367@nycstudents.net Alexander Chen

  //2. Copy your arrToString method from before.
  /**Return a String that represets the array in the format:
  * "[2, 3, 4, 9]"
  * Note the comma+space between values, and between values
  */
  public static String arrToString(int[] nums){
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

  //3. Write arrToString, with a 2D array parameter.
  //Note: Different parameters are allowed with the same function name.
  /**Return a String that represets the 2D array in the format:
    * "[[2, 3, 4], [5, 6, 7], [2, 4, 9]]"
    * Note the comma+space between values, and between arrays
    * You are encouraged to notice that you may want to re-use
    * previous code, but you should NOT duplicate that code. (Don't copy/paste or retype it)
    */
  public static String arrToString(int[][]ary){
    //this should use arrToString(int[])
    String result = "[";
    for (int i = 0; i < ary.length; i++){
      result = result + arrToString(ary[i]);
      if(i != ary.length - 1){
        result = result + ", ";
      }
    }
    result = result + "]";
    return result;
  }

  /*Return the sum of all of the values in the 2D array */
  public static int arr2DSum(int[][]nums){
    //use a nested loop to solve this
    int returnedAnswer = 0;
    for(int i = 0; i < nums.length; i++){
      for(int i2 = 0; i2 < nums[i].length; i2++){
        returnedAnswer = returnedAnswer + nums[i][i2];
      }
    }
    return returnedAnswer;
  }

  /**Rotate an array by returning a new array with the rows and columns swapped.
    * You may assume the array is rectangular and neither rows nor cols is 0.
    * e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
    */
  public static int[][] swapRC(int[][]nums){
    int[][] returnedArray = new int[nums[0].length][nums.length];
    for(int i2 = 0; i2 < nums[0].length; i2++){
      for(int i = 0; i < nums.length; i++){
        returnedArray[i2][i] = nums[i][i2];
      }
    }
    return returnedArray;
  }

  public static void main(String[] args){
    System.out.println("\nTest Cases for ArrayToString");
    int[][] ary = {{1, 2, 3}, {1, 5}, {6}};
    int[][] ary2 = {{1, 2, 3}, {1, 5, 5}, {6, 6, 6}};
    int[][] ary3 = {};
    int[][] ary4 = {{}, {1, 2, 3, 4}, {0}};
    System.out.println(arrToString(ary));
    System.out.println(arrToString(ary2));
    System.out.println(arrToString(ary3));
    System.out.println(arrToString(ary4));

    System.out.println("\nTest Cases for 2D Sum");
    System.out.println(arr2DSum(ary));
    System.out.println(arr2DSum(ary2));
    System.out.println(arr2DSum(ary3));
    System.out.println(arr2DSum(ary4));

    System.out.println("\nTest Cases for swapRC");
    int[][] rectArray = {{0, 1, 2, 3}, {2, 3, 4, 5}, {5, 6, 7, 8}};
    int[][] rectArray2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    int[][] rectArray3 = {{1}, {2}, {3}, {4}, {5}, {6}};
    int[][] rectArray4 = {{1, 2, 3, 4, 5, 6, 7, 8, 9}};
    System.out.println(arrToString(swapRC(rectArray)));
    System.out.println(arrToString(swapRC(rectArray2)));
    System.out.println(arrToString(swapRC(rectArray3)));
    System.out.println(arrToString(swapRC(rectArray4)));

    System.out.println("");
  }
}
