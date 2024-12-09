public class Driver{
  public static void main(String[] args){
  Adventurer p1 = new Mage("mage1", 12);
  Adventurer p2 = new Mage("mage2");

  System.out.println("name " + p1.getName());
  System.out.println("has " + p1.getSpecial() + " special " + p1.getSpecialName());
  p1.restoreSpecial(10);
  System.out.println("has " + p1.getSpecial() + " special " + p1.getSpecialName());
  System.out.println(p1.support(p2));
  System.out.println(p1.support());
  System.out.println(p1.specialAttack(p2));

  }
}
