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
  ArrayList<String> input = parse("day2pt1in");

  System.out.println(day2solve(input));
}

public static String day2solve(ArrayList<String> input){
  String[][] keypad = new String[][]{
    {"0","0","0","0","0","0","0","0","0",},
    {"0","0", "0", "0", "1", "0", "0", "0"},
    {"0","0", "2", "3", "4" , "0", "0"},
    {"0","5", "6", "7", "8", "9", "0"},
    {"0","0","A", "B", "C", "0", "0"},
    {"0", "0", "0", "D", "0", "0", "0"}
    {"0","0","0","0","0","0","0","0","0",},
};
  int r = 1;
  int c = 1;
  String ret = "";
  for(int i = 0; i < input.size(); i++){
    String inStr = input.get(i);
    for(int j = 0; j < inStr.length(); j++){
      if(inStr.charAt(j) == 'R' && !keypad[r][c+1].equals("0")){
        c += 1;
      }else if(inStr.charAt(j) == 'U' && !keypad[r -1][c].equals("0")){
        r -= 1;
      }else if(inStr.charAt(j) == 'D' && !keypad[r+ 1][c].equals("0")){
        r += 1;
      }else if(inStr.charAt(j) == 'L' && !keypad[r][c -1].equals("0")){
        c -= 1;
      }
    }
    ret += keypad[r][c];
  }
return ret;
}



public static String day1solve(ArrayList<String> input){
  int[][] keypad = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
  int r = 1;
  int c = 1;
  String ret = "";
  for(int i = 0; i < input.size(); i++){
    String inStr = input.get(i);
    for(int j = 0; j < inStr.length(); j++){
      if(inStr.charAt(j) == 'R' && c <= 1){
        c += 1;
      }else if(inStr.charAt(j) == 'U' && r >= 1){
        r -= 1;
      }else if(inStr.charAt(j) == 'D' && r <= 1){
        r += 1;
      }else if(inStr.charAt(j) == 'L' && c >= 1){
        c -= 1;
      }
    }
    ret += keypad[r][c];
  }
return ret;
}
}
