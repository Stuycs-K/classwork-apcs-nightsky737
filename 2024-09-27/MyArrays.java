class MyArrays{
  public static void main(String[] args){
    int[] testArr = new int[]{8, 2, 1 , 3};
    int[] testArr2 = new int[]{};
    int[] testArr3 = {2, 4, 2, 2, 2, 9};

    int[] testCopy = returnCopy(testArr);
    System.out.println("Do the memory Addresses equal? " + (testCopy == testArr));
    System.out.println("Original: " + arrayToString(testArr));
    System.out.println("Copied: " + arrayToString(testCopy));

    testCopy = returnCopy(testArr2);
    System.out.println("Do the memory Addresses equal? " + (testCopy == testArr2));
    System.out.println("Original: " + arrayToString(testArr2));
    System.out.println("Copied: " + arrayToString(testCopy));

    testCopy = returnCopy(testArr3);
    System.out.println("Do the memory Addresses equal? " + (testCopy == testArr3));
    System.out.println("Original: " + arrayToString(testArr3));
    System.out.println("Copied: " + arrayToString(testCopy));


    System.out.print("Concatenated " + arrayToString(testArr) + " and " + arrayToString(testArr2) + ": ");
    System.out.println(arrayToString(concatArray(testArr, testArr2)));

    System.out.println("Concatenated " + arrayToString(testArr2) + " and " + arrayToString(testArr) + ": ");
    System.out.println(arrayToString(concatArray(testArr2, testArr)));

    System.out.print("Concatenated " + arrayToString(testArr3) + " and " + arrayToString(testArr) + ": ");
    System.out.println(arrayToString(concatArray(testArr3, testArr)));

    System.out.println("Do they share memory? " + (concatArray(testArr3, testArr) == testArr3));
  }

 public static int[] returnCopy(int[]ary){
   int[] newArr = new int[ary.length];
   for(int i = 0; i < ary.length; i++){
     newArr[i] = ary[i];
   }
   return newArr;
 }


public static int[] concatArray(int[]ary1,int[]ary2){
    int[] out = new int[ary1.length + ary2.length];
    for(int i = 0; i < ary1.length; i++){
      out[i] = ary1[i];
    }
    for(int i = ary1.length; i < out.length; i++){
      out[i] = ary2[i - ary1.length];
    }

    return out;
  }



public static String arrayToString(int[] nums){
    String out = "[";
    for(int i = 0; i < nums.length; i++){
      if(i == nums.length - 1){
        out+= nums[i];
      }else{
        out += nums[i] + ", ";
      }
    }
    out += "]";

    return out;
  }

}
