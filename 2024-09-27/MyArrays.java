class MyArrays{
  public static void main(String[] args){
    int[] testArr = new int[]{8, 2, 1 , 3};
    int[] testArr2 = new int[]{};

    System.out.println(arrayToString(testArr));
    System.out.println(arrayToString(testArr2));
  }

   static String arrayToString(int[] nums){
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
