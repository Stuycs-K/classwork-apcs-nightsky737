class MyArrays{
  public static void main(String[] args){
    int[] testArr = new int[]{8, 2, 1 , 3};
    int[] testArr2 = new int[]{};

    int[] testCopy = returnCopy(testArr);
    System.out.println("Do the memory Addresses equal? " + (testCopy == testArr));
    System.out.println("Original: " + arrayToString(testArr));
    System.out.println("Copied: " + arrayToString(testCopy));
  }

 public static int[] returnCopy(int[]ary){
   int[] newArr = new int[ary.length];
   for(int i = 0; i < ary.length; i++){
     newArr[i] = ary[i];
   }
   return newArr;
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
