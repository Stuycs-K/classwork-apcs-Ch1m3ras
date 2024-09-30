//1. Write both your names + emails at the top of the document as a comment.\
// lbenitez60@stuy.edu Leonardo Benitez

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
  String result = "["
  for (int i = 0; i < ary.length; i++){

  }
  return "";
}

/*Return the sum of all of the values in the 2D array */
public static int arr2DSum(int[][]nums){
  //use a nested loop to solve this
}

/**Rotate an array by returning a new array with the rows and columns swapped.
  * You may assume the array is rectangular and neither rows nor cols is 0.
  * e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
  */
public static int[][] swapRC(int[][]nums){
  return new int[1][1];
}
