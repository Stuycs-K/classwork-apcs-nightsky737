
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class TriangleTester{
    public static int countTrianglesA(String filename){

      int a = 0;
      int b = 0;
      int c = 0;
      int count = 0;
      try{
      File file = new File(filename);
      Scanner triangles = new Scanner(file);

      while(triangles.hasNextInt()){
        a = triangles.nextInt();
        b = triangles.nextInt();
        c = triangles.nextInt();
        if(isValid(a, b, c)){
          count++;
        }
      }
      triangles.close();

  }
      catch(FileNotFoundException ex){
        System.out.println("File not found");
      }

    return count;
    }
    public static boolean isValid(int a, int b, int c){
      return (a + b > c && a + c > b && b + c > a);
    }

  }
