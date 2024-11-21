import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class day7 {
    public static boolean check(String str){
        return(str.charAt(0) == str.charAt(3) 
        && str.charAt(1) == str.charAt(2) 
        && str.charAt(3) != str.charAt(2) );
    }
    public static void main(String[] args){
 try{
      File file = new File("day7in.txt");
      Scanner inScan = new Scanner(file);
      boolean bracket = false;
      int total = 0;
      while(inScan.hasNextLine()){
        String line = inScan.nextLine();
        boolean insquare = false;
        boolean outsquare = false;
        bracket = false;
        for(int i = 0; i <= line.length() - 4; i++){
          if(line.charAt(i) == '['){
            bracket = true;
            continue;
          }else if(line.charAt(i) == ']'){
            bracket = false;
            continue;
          }
          if(check(line.substring(i, i+4))){
            if(bracket){
                insquare = true;
            }else{
                outsquare = true;
            }
          }

        }
        if(!insquare && outsquare){
            total+= 1;
        }
      }
      System.out.println(total);

  }catch(FileNotFoundException e){
    System.out.println("file bad");
  }}
    }