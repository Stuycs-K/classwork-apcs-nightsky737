public class words{

public static void makeWords(int remainingLetters, String result, String alphabet){
if(remainingLetters==1){
  for(int i = 0; i < alphabet.length(); i++){
    System.out.println(result+alphabet.charAt(i));
  }
}
else{
  for(int i = 0; i < alphabet.length(); i++){
    makeWords(remainingLetters-1, result+alphabet.charAt(i), alphabet);
  }
}

}
  public static void main(String[] args){
    makeWords(2, "", "aba");
  }
}
