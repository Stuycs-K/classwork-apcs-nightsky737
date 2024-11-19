import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class day2{
public static ArrayList<String> parse(String input){
    try{
    ArrayList<String> ret = new ArrayList<String>();
    File file = new File(input);
    Scanner inScan = new Scanner(file);
    while(inScan.hasNextLine()){
      ret.add(inScan.nextLine());
    }
    return ret;
}catch(FileNotFoundException e){
  System.out.println("file bad");
  return new ArrayList<String>();
}}

public static void main(String[] args){
  int[][] keypad = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
  ArrayList<String> input = parse("day2pt1in");
  System.out.println(Arrays.deepToString(keypad));
  System.out.println(input);
}


public static void getNumber(int current, String[] inputs){

}

}
