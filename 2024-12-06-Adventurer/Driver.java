public class Driver{
  public static void main(String[] args){
  Adventurer p1 = new Mage("mage1", 12);
  Adventurer p2 = new Mage("mage2");

  System.out.println("name" + p1.getName());
  System.out.println("has special" + p1.getSpecial());

  System.out.println("name" + p1.getName());

  System.out.println("name" + p1.getName());

  }
}
