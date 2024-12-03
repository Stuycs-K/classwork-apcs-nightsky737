class ColorDemo{
  public static final String CLEAR_SCREEN =  "\u001b[2J";
  public static final String HIDE_CURSOR =  "\u001b[?25l";
  public static final String SHOW_CURSOR =  "\u001b[?25h";

  public static void main(String[] args){
    String[] ary = new String[10];
    for(int i = 0; i < ary.length; i++){
      ary[i] = ".";
    }
    for(int i = 0; i < ary.length; i++){
      for(int j = 0; j < ary.length; j++){
        if(i == j){
          System.out.print("i");
        }else{
          System.out.print(",");
        }
        sleep(10);
      }
      System.out.print(CLEAR_SCREEN);
    }

    System.out.print("\u001b[0m");
  }

  public static void sleep(int milli){
      try{
              Thread.sleep(milli);
      }catch(Exception e){
      }
}
}
