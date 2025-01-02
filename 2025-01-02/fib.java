public class fib{
  public static int fib(int num){
    if(num <= 1){
      return num;
    }else{
      return fib(num-1) + fib(num-2);
    }
  }
//largest sub 10 is 46
//largest non overflow is 46
  public static void main(String[] args){
    int n = Integer.parseInt(args[0]);
    System.out.println(fib(n));
  }
}
