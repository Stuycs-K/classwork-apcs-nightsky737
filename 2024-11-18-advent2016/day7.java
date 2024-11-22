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
    public static boolean aba(String str){
      return(str.charAt(0) == str.charAt(2) && (str.charAt(2) != str.charAt(1)));
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
        ArrayList<String> nobracks = new ArrayList<String>();
        ArrayList<String> bracks = new ArrayList<String>();

        while(line.indexOf("[") != -1){
          int start = line.indexOf("[");
          int end = line.indexOf("]");
          String nobrackin = line.substring(0, start);
          for(int j = 0; j < nobrackin.length() - 2; j++){
            if(aba(nobrackin.substring(j, j+3))){
              nobracks.add(nobrackin.substring(j, j+3));
            }
          }
          String bracksin = line.substring(start + 1, end);
          for(int j = 0; j < bracksin.length() - 2; j++){
            if(aba(bracksin.substring(j, j+3))){
              bracks.add(bracksin.substring(j, j+3));
            }
          }
          line = line.substring(end + 1);
        }
        for(int j = 0; j < line.length() - 2; j++){
          if(aba(line.substring(j, j+3))){
            nobracks.add(line.substring(j, j+3));
          }
        }

       for(int i = 0; i < nobracks.size(); i++){
        String target = nobracks.get(i);
        if(bracks.contains("" + target.charAt(1) + target.charAt(0) + target.charAt(1))){
          total++;
          break;
        }
       }
        // for(int i = 0; i <= line.length() - 4; i++){
        //   if(line.charAt(i) == '['){
        //     bracket = true;
        //     continue;
        //   }else if(line.charAt(i) == ']'){
        //     bracket = false;
        //     continue;
        //   }
        //   if(check(line.substring(i, i+4))){
        //     if(bracket){
        //         insquare = true;
        //     }else{
        //         outsquare = true;
        //     }
        //   }

        // }
        // if(!insquare && outsquare){
        //     total+= 1;
        // }
      }
      System.out.println(total);

  }catch(FileNotFoundException e){
    System.out.println("file bad");
  }}
    }