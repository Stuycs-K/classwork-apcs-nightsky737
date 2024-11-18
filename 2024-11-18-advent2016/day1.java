import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;

public class day1{
  public static void main(String[] args){
    try{
    File file = new File("day1in");
    Scanner inScan = new Scanner(file);

    String[] intext = inScan.nextLine().split(", ");
    int L = 0;
    int R = 0;
    for(int i = 0; i < intext.length; i++){
      if(intext[i].charAt(0) == 'L'){
        L += Integer.parseInt(intext[i].subString(1));
      }else{

      }
    }

    System.out.println(Arrays.toString(intext));
    System.out.println(L);
  }
    catch(FileNotFoundException e){
      System.out.println("your file bad");
    }
  }
}
