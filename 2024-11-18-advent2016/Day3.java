import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;
import java.util.*;


public class Day3 {
    public static ArrayList<String[]> parse(String input){
        try{
       ArrayList<String[]> ret = new ArrayList<String[]>();
        File file = new File(input);
        Scanner inScan = new Scanner(file);
        while(inScan.hasNextLine()){
        String nextL = inScan.nextLine();
        String code = nextL.substring(nextL.length() - 10, nextL.length() - 7);
        String checksum = nextL.substring(nextL.length() - 6, nextL.length() - 1);
        ret.add(new String[] {nextL.substring(0, nextL.length() - 10).replace("-", ""), code, checksum});
        }
        inScan.close();
        return ret;
    }catch(FileNotFoundException e){
      System.out.println("file bad");
      return new ArrayList<String[]>();
    }}

    public static void main(String[] args){
        ArrayList<String[]> input = parse("Day3.txt");
        for(int i = 0; i < input.size(); i++){
            int[] abcs = new int[26];
            String[] in = input.get(i);
            for(int j = 0; j < in[0].length(); j++){
                //insert via comaprisons and > operators so alphabetically
                abcs[in[0].charAt(j) % 97] += 1;
            }
            System.out.println(Arrays.toString(abcs));
            ArrayList<String> sorted = new ArrayList<String>();
            for(int k = 0; k< 26; k++){
            }
        }
    }
}
