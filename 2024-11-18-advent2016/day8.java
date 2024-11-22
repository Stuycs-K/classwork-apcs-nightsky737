import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;
import java.util.*;

  public class day8{
  public static  void main(String[] args){
    int[][] board = new int[6][50]; //0 is off
      try{
          File file = new File("day8.txt");
          Scanner inScan = new Scanner(file);
          while(inScan.hasNextLine()){
            String line = inScan.nextLine();
            if(line.indexOf("column") != -1){
              String[] colsplit = line.substring(16).split(" by ");
              int colIdx = Integer.parseInt(colsplit[0]);
              int shift = Integer.parseInt(colsplit[1]);

              int[] colCopy = new int[6];
              for(int i = 0; i < 6; i++){
                  colCopy[i] = board[i][colIdx];
              }
              for(int i = 0; i < 6; i++){
                board[i][colIdx]= colCopy [(i+6 -shift) % 6];
              }


            }else if(line.indexOf("row") != -1){
              String[] rowsplit = line.substring(13).split(" by ");
              int rowIdx = Integer.parseInt(rowsplit[0]);
              int shift = Integer.parseInt(rowsplit[1]);
              int[] rowCopy = board[rowIdx];
              board[rowIdx] = new int[50];//change to 50
              for(int i = 0; i < 50; i++){
                board[rowIdx][i] = rowCopy[(i-shift + 50) % 50]; //should always be pos? no 50+ shifts
              }
            }else{
              String recty = line.substring(5);
              String[] rxc = recty.split("x");
              // System.out.println("rect "+ rxc[0] + "," + rxc[1]);
              for(int i = 0; i < Integer.parseInt(rxc[1]); i++){
                for(int j = 0; j < Integer.parseInt(rxc[0]); j++){
                  board[i][j] = 1;
                }
              }
            }
      }
      sum(board);
      for(int i = 0; i< 6; i++){
        System.out.println(Arrays.toString(board[i]));
      }
    }catch(FileNotFoundException e){
        System.out.println("file bad");
      }


  }

  public static void sum(int[][] arr){
    int total = 0;
    for(int i = 0; i < arr.length; i++){
      for(int j = 0; j< arr[0].length; j++){
        total+=arr[i][j];
      }
     }
     System.out.println(total);
  }
  }
