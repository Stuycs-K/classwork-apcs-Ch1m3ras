import java.util.Arrays;
public class ArrayDemo{
  public static void main(String[]args){
    //write your tests here!
    //You can now use Arrays.toString(yourArray) instead of writing arrayToString again.
    //Compare Arrays.toString(yourArray) to YOUR arrayToString() method to make sure yours is correct
    //do not use any other Arrays.method()

    //Testing methods added prior to the days work.
    System.out.println("\nTesting for arrToString() against Arrays.toString()");
    int[] testArr1 = {1, 3, 4, 5, 6, 7, 2, 3, 4};
    System.out.println(Arrays.toString(testArr1));
    System.out.println(arrToString(testArr1));

    System.out.println("\nTesting for arr2DSum()");
    int[][] testArr2 = {{1, 2, 3}, {5, 6, 4}, {1, 2, 3}};
    System.out.println(arr2DSum(testArr2));
    System.out.println(1 + 2 + 3 + 5 + 6 + 4 + 1 + 2 + 3);

    System.out.println("\nTesting for replaceNegative()");
    int[][] testArr3 = {{-1, -2 , 3}, {4, 3}, {2, 1, 0}};
    System.out.println(arrToString(testArr3));
    replaceNegative(testArr3);
    System.out.println(arrToString(testArr3));

    System.out.println("\nTesting for copy()");
    int[][] copiedArray = copy(testArr3);
    System.out.println("The address for the original testArr3: " + testArr3);
    System.out.println("The address for the copied testArr3: " + copiedArray);

    System.out.println("\nTesting for swapRC()");
    int[][] testArr4 = {{1, 2, 9}, {1, 5, 7}, {5, 4, 3}};
    System.out.println(arrToString(testArr4));
    System.out.println(arrToString(swapRC(testArr4)));

    //Test Cases for the functions unique to this assignment
    System.out.println("\nTesting for countZeros2D()");
    int[][] testArr5 = {{1, 2, 3, 4, 5}, {1, 0, 0, 3}, {0, 0, 4}};
    int[][] testArr6 = {{}, {}};
    int[][] testArr7 = {{0, 0, 0, 0, 0, 5}, {0, 1, 2, 3, 5}};
    int[][] testArr8 = new int[5][10];
    System.out.println(countZeros2D(testArr5));
    System.out.println(countZeros2D(testArr6));
    System.out.println(countZeros2D(testArr7));
    System.out.println(countZeros2D(testArr8));

    System.out.println("\nTesting for htmlTable()");
    int[][] testArr9 = {{1,2},{3}};
    System.out.println(htmlTable(testArr9));
  }

  //0. Include your prior methods to help you print a 1D/2D array of ints.
  public static String arrToString(int[]ary){
      //Starting bracket as every returned answer requires that.
      String returnedString = "[";
      for(int i = 0; i < ary.length; i++){
        //Checking to see if it's the last term to make sure there is no hanging comma at the end.
        if(i == ary.length - 1){
          returnedString = returnedString + ary[i];
        }
        else{
          returnedString = returnedString + ary[i] + ", ";
        }
      }
      //Same logic as the starting bracket, all code will go through this point, and thus we add the ending bracket
      returnedString = returnedString + "]";
      return returnedString;
    }

  //The name of different methods can be the same,
  //as long as the parameters are different! (type and/or quantity must be different)
  //Pro tip: you should be using your 1D arrToString in this method!
  public static String arrToString(int[][]ary){
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

  //1. Calculate and return how many elements equal zero in the 2D array.
  public static int countZeros2D(int[][] nums){
    int count = 0;
    for(int i = 0; i < nums.length; i++){
      for(int i2 = 0; i2 < nums[i].length; i2++){
        if(nums[i][i2] == 0){
          count++;
        }
      }
    }
    return count;
  }

  //2. Calculate the sum of a 2d array
  /*Return the sum of all of the values in the 2D array
   *Use a nested loop instead of a helper method*/
  public static int arr2DSum(int[][]nums){
    int returnedAnswer = 0;
    for(int i = 0; i < nums.length; i++){
      for(int i2 = 0; i2 < nums[i].length; i2++){
        returnedAnswer = returnedAnswer + nums[i][i2];
      }
    }
    return returnedAnswer;
  }

  //3. Modify a given 2D array of integer as follows:
  //Replace all the negative values:
  //-When the row number is the same as the column number replace
  //that negative with the value 1
  //-All other negatives replace with 0
  public static void replaceNegative(int[][] vals){
    for (int i = 0; i < vals.length; i ++){
        for (int x = 0; x < vals[i].length; x ++){
          if (vals[i][x] < 0){
            if (i == x)
              vals[i][x] = 1;
            else
              vals[i][x] = 0;
        }
      }
    }
  }

  //4. Make a copy of the given 2d array.
  //When testing : make sure that changing the original does NOT change the copy.
  //DO NOT use any built in methods that "copy" an array.
  //You SHOULD write a helper method for this.
  //If you don't see a good way to do that, you should stop and look at prior methods.
  public static int[][] copy(int[][] nums){
      int[][] returnedArray = new int[nums.length][];
      for(int i = 0; i < nums.length; i++){
        returnedArray[i] = copyHelper(nums[i]);
      }
      return returnedArray;
    }

    public static int[] copyHelper(int[] nums){
      int[] returnedArray = new int[nums.length];
      for(int i = 0; i < nums.length; i++){
        returnedArray[i] = nums[i];
      }
      return returnedArray;
    }

  //5. Rotate an array by returning a new array with the rows and columns swapped.
  //   You may assume the array is rectangular and neither rows nor cols is 0.
  //   e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
  public static int[][] swapRC(int[][]nums){
    int[][] returnedArray = new int[nums[0].length][nums.length];
    for(int i2 = 0; i2 < nums[0].length; i2++){
      for(int i = 0; i < nums.length; i++){
        returnedArray[i2][i] = nums[i][i2];
      }
    }
    return returnedArray;
  }

  //6. Make an HTML table by putting a table tag around the entire 2d array,
  //   tr tags around each row, and td tags around each value.
  //   You may use a helper method
  //   Note there is no whitespace in the string, it all one line with no spaces/tabs.
  //   e.g. htmlTable(new int[][]{{1,2},{3}})  returns:
  // "<table><tr><td>1</td><td>2</td></tr><tr><td>3</td></tr></table>"
  public static String htmlTable(int[][]nums){
    String returnedString = "<table>";
    for(int i = 0; i < nums.length; i++){
      returnedString = returnedString + "<tr>";
      for(int i2 = 0; i2 < nums[i].length; i2++){
        returnedString = returnedString + "<td>" + nums[i][i2] + "</td>";
      }
      returnedString = returnedString + "</tr>";
    }
    returnedString = returnedString + "</table>";
    return returnedString;
  }
}
