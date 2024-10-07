


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
    int sum = 0;
  //use a nested loop to solve this
    for(int i = 0; i < nums.length; i++){
      for(int j = 0; j < nums[i].length; j++){
        sum+= nums[i][j];
      }
    }

    return sum;
  }

/**Rotate an array by returning a new array with the rows and columns swapped.
  * You may assume the array is rectangular and neither rows nor cols is 0.
  * e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
  */
  public static int[][] swapRC(int[][]nums){
    int[][] out = new int[nums[0].length][nums.length];
  for(int i = 0; i < nums.length; i++){
	  for(int j = 0; j < nums[0].length; j++){
  		out[j][i] = nums[i][j];}}
    return out;

  }
//3. Modify a given 2D array of integer as follows:
//Replace all the negative values:
//-When the row number is the same as the column number replace
//that negative with the value 1
//-All other negatives replace with 0
public static void replaceNegative(int[][] vals){
  for(int i = 0; i < vals.length; i++){
    for(int j = 0; j < vals[i].length; j++){
      if(vals[i][j] < 0){
        if(i == j){
          vals[i][j] = 1;
        }else{
          vals[i][j] = 0;
        }
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
  int[][] arrCopy = new int[nums.length][];
  for(int i = 0; i < nums.length; i++){
    arrCopy[i] = returnCopy(nums[i]);
  }
  return arrCopy;
}

public static int[] returnCopy(int[]ary){
  int[] newArr = new int[ary.length];
  for(int i = 0; i < ary.length; i++){
    newArr[i] = ary[i];
  }
  return newArr;
}

  public static void main(String[] args){
    int[][] test = new int[][] {{}};
    int[][] arrCopy = copy(test);

    System.out.println("original" + arrToString(test));
    System.out.println("Copy: " + arrToString(arrCopy));

    if(test == arrCopy){System.out.print("Did not copy right");}
    else
     {System.out.println("Outer copy went okay");}

     boolean innerBroke = false;
    for(int i = 0; i < arrCopy.length; i++){
      if(test[i] == arrCopy[i]){innerBroke = true;}
    }
    if(innerBroke){System.out.println("Inner array not copied");} else {System.out.println("Inner Array copied rigth");}

    System.out.println("Sum: " + arr2DSum(test));
    System.out.println("After rotation: " + arrToString(swapRC(test)));
    replaceNegative(test);
    System.out.println("After replaceNegative: " + arrToString(test));

    test = new int[][] {{-1, 2}, {5 , -2}, {-4, 4}};

    arrCopy = copy(test);

    System.out.println("original" + arrToString(test));
    System.out.println("Copy: " + arrToString(arrCopy));

    if(test == arrCopy){System.out.print("Did not copy right");}
    else
     {System.out.println("Outer copy went okay");}

    innerBroke = false;
    for(int i = 0; i < arrCopy.length; i++){
      if(test[i] == arrCopy[i]){innerBroke = true;}
    }
    if(innerBroke){System.out.println("Inner array not copied");} else {System.out.println("Inner Array copied rigth");}

    System.out.println("Sum: " + arr2DSum(test));
    System.out.println("After rotation: " + arrToString(swapRC(test)));
    replaceNegative(test);
    System.out.println("After replaceNegative: " + arrToString(test));

    test = new int[][] {{2, 4, 5, 6,2}};

    arrCopy = copy(test);

    System.out.println("original" + arrToString(test));
    System.out.println("Copy: " + arrToString(arrCopy));

    if(test == arrCopy){System.out.print("Did not copy right");}
    else
     {System.out.println("Outer copy went okay");}

    innerBroke = false;
    for(int i = 0; i < arrCopy.length; i++){
      if(test[i] == arrCopy[i]){innerBroke = true;}
    }
    if(innerBroke){System.out.println("Inner array not copied");} else {System.out.println("Inner Array copied rigth");}

    System.out.println("Sum: " + arr2DSum(test));
    System.out.println("After rotation: " + arrToString(swapRC(test)));
    replaceNegative(test);
    System.out.println("After replaceNegative: " + arrToString(test));

    test = new int[][] {{2, 4}, {}, {5, 9}};

    arrCopy = copy(test);

    System.out.println("original" + arrToString(test));
    System.out.println("Copy: " + arrToString(arrCopy));

    if(test == arrCopy){System.out.print("Did not copy right");}
    else
     {System.out.println("Outer copy went okay");}

    innerBroke = false;
    for(int i = 0; i < arrCopy.length; i++){
      if(test[i] == arrCopy[i]){innerBroke = true;}
    }
    if(innerBroke){System.out.println("Inner array not copied");} else {System.out.println("Inner Array copied rigth");}

    System.out.println("Sum: " + arr2DSum(test));
    System.out.println("After rotation: " + arrToString(swapRC(test)));
    replaceNegative(test);
    System.out.println("After replaceNegative: " + arrToString(test));

    test = new int[][] {{1,2,3},{4,5,6}}; //{{1,4},{2,5},{3,6}}

    arrCopy = copy(test);

    System.out.println("original" + arrToString(test));
    System.out.println("Copy: " + arrToString(arrCopy));

    if(test == arrCopy){System.out.print("Did not copy right");}
    else
     {System.out.println("Outer copy went okay");}

     innerBroke = false;
    for(int i = 0; i < arrCopy.length; i++){
      if(test[i] == arrCopy[i]){innerBroke = true;}
    }
    if(innerBroke){System.out.println("Inner array not copied");} else {System.out.println("Inner Array copied rigth");}

    System.out.println("Sum: " + arr2DSum(test));
    System.out.println("After rotation: " + arrToString(swapRC(test)));
    replaceNegative(test);
    System.out.println("After replaceNegative: " + arrToString(test));

  }

}
