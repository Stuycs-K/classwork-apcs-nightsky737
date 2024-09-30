


//Henry Santos Hendricks henrys8913@nycstudents.net
// Jessica Seto jessicas388@nycstudents.net
public class ArrayMethods {
  //2. Copy your arrToString method from before.
  /**Return a String that represets the array in the format:
  * "[2, 3, 4, 9]"
  * Note the comma+space between values, and between values
  */
  public static String arrToString(int[]nums){
    String ret = new String("[");
    for (int i = 0; i < nums.length; i++) {
      ret += nums[i];
      if (i < nums.length - 1) {
        ret += ", ";
      }
    }
    return ret + "]";
  }

//3. Write arrToString, with a 2D array parameter.
//Note: Different parameters are allowed with the same function name.
/**Return a String that represets the 2D array in the format:
  * "[[2, 3, 4], [5, 6, 7], [2, 4, 9]]"
  * Note the comma+space between values, and between arrays
  * You are encouraged to notice that you may want to re-use
  * previous code, but you should NOT duplicate that code. (Don't copy/paste or retype it)
  */
  public static String arrToString(int[][]nums){
  //this should use arrToString(int[])
  String ret = new String("[");
  for (int i = 0; i < nums.length; i++) {
    ret += arrToString(nums[i]);
    if (i < nums.length - 1) {
      ret += ", ";
    }
  }
  return ret + "]";
}

/*Return the sum of all of the values in the 2D array */
  public static int arr2DSum(int[][]nums){
  //use a nested loop to solve this
    return -1;
  }

/**Rotate an array by returning a new array with the rows and columns swapped.
  * You may assume the array is rectangular and neither rows nor cols is 0.
  * e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
  */
  public static int[][] swapRC(int[][]nums){
    return new int[1][1];
  }

  public static void main(String[] args){
    int[][] test = new int[][] {};
    System.out.println(arrToString(test));
    test = new int[][] {{2, 2}, {5 , 7}, {1, 4}};
    System.out.println(arrToString(test));

    test = new int[][] {{2, 4, 5, 6,2}};
    System.out.println(arrToString(test));

    test = new int[][] {{2, 4}, {}, {5, 9}};
    System.out.println(arrToString(test));



  }

}
