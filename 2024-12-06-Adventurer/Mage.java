public class Mage extends Adventurer{
  private int special;
  private int specialMax;
    public Mage(String name){
      super(name);
      setSpecial(0);
      specialMax = 10;
    }
    public Mage(String name, int hp){
      super(name, hp);
      setSpecial(0);
      specialMax = 30;
    }
    public Mage(){
      super("Betty");
    }


      //Abstract methods are meant to be implemented in child classes.

      /*
        all adventurers must have a custom special
        consumable resource (mana/rage/money/witts etc)
      */
      //give it a short name (fewer than 13 characters)
      public String getSpecialName(){
        return "mana";
      }
      //accessor methods
      public int getSpecial(){
        return special;
      }
      public void setSpecial(int n){
        if(n >= 0){
          if(n <= getSpecialMax()){
           special = n;}else{
             special = getSpecialMax();
           }
        }
        }

      public int getSpecialMax(){
        return specialMax;
      }

            /*
              all adventurers must have a way to attack enemies and
              support their allys
            */
            //hurt or hinder the target adventurer
            public String attack(Adventurer other){
              other.applyDamage(2);
              return this.getName() + " dealt 2 damage to " + other.getName();
            }

            //heall or buff the target adventurer
            public String support(Adventurer other){
              other.setHP(other.getmaxHP());
              return this.getName() + " healed to full hp" + other.getName();
            }
            //heall or buff self
            public String support(){
              setHP(getmaxHP());
              setSpecial(getSpecial() + 5);
              return this.getName() + " healed themselves to full hp and restored 5 " + getSpecialName();
            }
            //hurt or hinder the target adventurer, consume some special resource
            public String specialAttack(Adventurer other){
              setSpecial(getSpecial() - 2);
              other.applyDamage(5);
              return this.getName() + " used 2 " + getSpecialName() + " to deal 2 damage to " + other.getName() + "(" + getSpecial() + " " + getSpecialName() +" remaining)";}


}
