class ColorDemo{
  public static final String CLEAR_SCREEN =  "\u001b[2J";
  public static final String HIDE_CURSOR =  "\u001b[?25l";
  public static final String SHOW_CURSOR =  "\u001b[?25h";

  public static void main(String[] args){
    String str = "...----````----..";
    int[] colores = {90, 91, 92, 93, 94, 95, 96, 97,98,98,97,96,95,94,93,92,91,90};
    int color = 0;
    for(int repeats = 0; repeats<10; repeats++){
      for(int i = 0; i < str.length(); i++){
        System.out.print(str.charAt(i));
        System.out.print("\u001b["+colores[color % colores.length]+"m");
        color++;
        sleep(15);

      }  
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
