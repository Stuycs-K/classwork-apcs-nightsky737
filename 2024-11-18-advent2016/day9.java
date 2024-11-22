import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;
import java.util.*;

  public class day9{
  public static long calc(String in){
    // System.out.println(in);
    long total = 0;
    for(int i = 0; i < in.length(); i++){
      // System.out.println("i increase + " + i);
      if(in.charAt(i) == '('){
        int end = in.indexOf(")", i);
        // System.out.println("i" + i +"end" + end);
        String[] paren = in.substring(i + 1, end).split("x");
        String toCalc = in.substring(end + 1, end + 1 + Integer.parseInt(paren[0]));
        i = end + Integer.parseInt(paren[0]);
        // System.out.println("ohteri  " + i);
        total += calc(toCalc) * Integer.parseInt(paren[1]);
      }else{
        total++;
      }
    }
    if(total < 0){
      System.out.println('r');
    };
    return total;
  }
  public static  void main(String[] args){
      try{
      File file = new File("day9in.txt");
      Scanner inScan = new Scanner(file);
      while(inScan.hasNextLine()){
        String line = inScan.nextLine();
        System.out.println(calc(line));
      //   for(int i = 0; i < line.length(); i++){
      //     if(line.charAt(i) == '('){
      //       int closingidx = line.indexOf(")", i);
      //       String[] splitted = line.substring(i + 1, closingidx).split("x");
      //       int a = Integer.parseInt(splitted[0]);
      //       int b = Integer.parseInt(splitted[1]);
      //       if(closingidx + a < line.length()) {
      //         i = closingidx + a;
      //       }
      //       total += a * b;
      //     }else{
      //       total++;
      //     }
      //   }
      // }
      // System.out.println(total);
      }
  }catch(FileNotFoundException e){
    System.out.println("file bad");
  }}
  }
