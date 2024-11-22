import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;
import java.util.*;


public class day19{
public static void main(String[] args){
  ArrayList<Integer> elves = new ArrayList<Integer>();
  for(int i = 0; i < 3018458; i+= 2){
    elves.add(i);
  }
  int a = 0;
  while(elves.size() > 1){
    elves.remove((a + 1) % elves.size());
    a++;
  }
  System.out.println(elves);
}

}
