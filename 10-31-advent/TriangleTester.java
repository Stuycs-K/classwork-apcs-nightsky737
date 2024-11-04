
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class TriangleTester{
    public static int countTrianglesA(String filename){
      File file = new File(filename);
      Scanner triangles = new Scanner(file);
  
      int a = 0;
      int b = 0;
      int c = 0;
      int count = 0;
      while(triangles.hasNextLine()){
        a = triangles.nextInt();
        b = triangles.nextInt();
        c = triangles.nextInt();
        if(a + b >= c && a + c >= b && b + c >= a){
          count++;
        }
      }
    return count;
    }
  }
  