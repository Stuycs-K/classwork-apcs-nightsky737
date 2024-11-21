import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;
import java.util.*;

  public class day8{
  public static  void main(String[] args){
    int[][] board = new int[6][5]; //0 is off
      try{
          File file = new File("day8");
          Scanner inScan = new Scanner(file);
          int total = 0;
          while(inScan.hasNextLine()){
            String line = inScan.nextLine();
            if(line.indexOf("column") != -1){

            }else if(line.indexOf("row") != -1){

            }else{
              String recty = str.substring(6);
              String[] rxc = recty.split("x")
              System.out.println("rect "+ rxc[0] + "," + rxc[1])
            }


      }catch(FileNotFoundException e){
        System.out.println("file bad");
      }}
      }


  }
  }
