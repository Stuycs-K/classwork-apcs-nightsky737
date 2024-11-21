import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;
import java.util.*;

  public class day9{
  public static  void main(String[] args){
      try{
      File file = new File("day9in");
      Scanner inScan = new Scanner(file);
      int total = 0;
      while(inScan.hasNextLine()){
        String line = inScan.nextLine();
        int semi = 0;

        for(int i = 0; i < line.length(); i++){
          if(line.charAt(i) == '('){
            int closingidx = line.indexOf(")", i);
            String[] splitted = line.substring(i + 1, closingidx).split("x");
            System.out.println(Arrays.toString(splitted))
            int a = Integer.parseInt(splitted[0]);
            int b = Integer.parseInt(splitted[1]);
            i+= 5;
            i+= a - 1;
            semi += a * b;
          }else{
            semi++;
          }
        }
        System.out.println("partial" + semi);
        total+= semi;
      }
      System.out.println(total);

  }catch(FileNotFoundException e){
    System.out.println("file bad");
  }}
  }
