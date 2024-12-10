import java.util.Scanner;
import java.lang.Math;

class Game{

  public static void main(String[] args) {
    //do this once
    Scanner userInput = new Scanner(System.in);

    //You can do the rest many times:

    System.out.println("Enter username");
    //Read one line of user input
    String userName = userInput.nextLine();
    //Do something with the input
    System.out.println("Username is: " + userName);
    Adventurer player = new Mage(userName);
    Adventurer enemy = new CodeWarrior();
    System.out.println( "Player " + player + ": " + player.getHP() + "/" + player.getmaxHP() +  " HP, " + player.getSpecial() + "/" + player.getSpecialMax() + " " + player.getSpecialName());
    System.out.println( "Enemy " + enemy + ": " + enemy.getHP() + "/" + enemy.getmaxHP() +  " HP, " + enemy.getSpecial() + "/" + enemy.getSpecialMax() + " " + enemy.getSpecialName());
    while(true){
      if(player.getHP() <= 0){
        System.out.println("Winner is " + enemy);
        break;
      }
      System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");
      String action = userInput.nextLine();
      if(action.equals("a")){
        System.out.println(player.attack(enemy));}
        else if(action.equals("sp")){
          System.out.println(player.specialAttack(enemy));
        }else if (action.equals("su")){
          System.out.println(player.support());
        }else if (action.equals("quit")){
          System.out.println("Game quit");
          break;
        }
      else{
        System.out.println("invalid action, try again");
        continue;
      }

      if(enemy.getHP() <= 0){
        System.out.println("Winner is " + player);
        break;
      }

      int enemyAction = (int) Math.random() * 3;
      if(enemyAction == 0){
        System.out.println(enemy.attack(player));}
        else if(enemyAction == 1){
          System.out.println(enemy.specialAttack(player));
        }else if (enemyAction == 2){
          System.out.println(enemy.support());
        }
      System.out.println( "Player " + player + ": " + player.getHP() + "/" + player.getmaxHP() +  " HP, " + player.getSpecial() + "/" + player.getSpecialMax() + " " + player.getSpecialName());
      System.out.println( "Enemy " + enemy + ": " + enemy.getHP() + "/" + enemy.getmaxHP() +  " HP, " + enemy.getSpecial() + "/" + enemy.getSpecialMax() + " " + enemy.getSpecialName());

    }
  }
}
