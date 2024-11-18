import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;

public class day1{
  public static void main(String[] args){
    try{
    File file = new File("day1in");
    Scanner inScan = new Scanner(file);
    int direction = 0; //0 is North,
    String[] intext = inScan.nextLine().split(", ");
    int x, y = 0;
    for(int i = 0; i < intext.length; i++){
      if(intext[i].charAt(0) == 'R'){
        direction += 1;
      }else{
        direction -= 1;
      }
      if(direction % 4 == 0){
        y += Integer.parseInt(intext[i].substring(1));
      }else if(direction % 4 == 2){
        y -= Integer.parseInt(intext[i].substring(1));
      }else if(direction % 4 == 1){
        x += Integer.parseInt(intext[i].substring(1));
      }else{
        x -= Integer.parseInt(intext[i].substring(1));
      }
    }
    double distance = Math.sqrt(x * x + y * y);
    Sytem.out.println(distance);
  }
    catch(FileNotFoundException e){
      System.out.println("your file bad");
    }
  }
}
