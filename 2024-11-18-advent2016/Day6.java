import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;
import java.util.*;

public class Day6{
  public static   ArrayList<ArrayList<Character>> parse(String input){
      try{
      File file = new File(input);
      Scanner inScan = new Scanner(file);
      String firstL = inScan.nextLine();
      ArrayList<ArrayList<Character>> ret = new ArrayList<ArrayList<Character>>();
      for(int i = 0; i < firstL.length(); i++){
        ArrayList<Character> ret1 = new ArrayList<Character>();
        ret1.add(firstL.charAt(i));
        ret.add(ret1);
      }
      while(inScan.hasNextLine()){
        firstL = inScan.nextLine();
        for(int i = 0; i < firstL.length(); i++){
          ret.get(i).add(firstL.charAt(i));
        }
      }
      return ret;
  }catch(FileNotFoundException e){
    System.out.println("file bad");
    return new  ArrayList<ArrayList<Character>>();
  }}

  public static void main(String[] args){
      ArrayList<ArrayList<Character>> input = parse("day6in");
      String ret = "";
      for(int i = 0; i < input.size(); i++){
        ArrayList<Character> charArr = input.get(i);
        int[] abcsfreq = new int[26];
        for(int j = 0 ; j < charArr.size(); j++){
            abcsfreq[charArr.get(j) - 'a'] += 1;
        }
        char biggest = 'a';
        int biggestfreq = abcsfreq[0];
        for(int j = 1; j < 26; j++){
          if(abcsfreq[j] < biggestfreq){
            biggest = (char)('a' + j);
            biggestfreq = abcsfreq[j];
          }
        }
        ret += biggest;
      }
      System.out.println(ret);
  }
}
