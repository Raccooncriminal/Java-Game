import java.util.Scanner;
import java.util.Random;
class Main {
  
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    System.out.println("Hello there, welcome to our game, you shall play to your DOOM!!!");

    System.out.println("Pls enter ur naem: ");

    String name = myObj.nextLine();

    Player player = new Player(name);

    System.out.println("Welcome " + player.name + " Do you want to go to the people of the dungeon and buy some gear(1) or do you want to go to the dungeon of DOOOOOM(2)?");

    int choice1 = myObj.nextInt();

    Weapon sword = new Weapon(30, "Sword");

    if(choice1 == 2){ 
      Room room = new Room((int)Math.round(Math.random() * 4) + 1, (int)Math.round(Math.random() * 9) + 3, (int)Math.round(Math.random() * 5)+1);
      System.out.println("The room of the dungeon that lies infront of you has " + String.valueOf(room.ammountOfEnemies) + " enemie(s) and the chest seems to have right about " + String.valueOf(room.chestLoot) + " items, so you better fight for them");
      for(int i = 0; i < room.ammountOfEnemies; i++){  
      System.out.println("The enemy number " + i + " is approaching");
      int strike = (int)Math.round(Math.random() * 2) + 1;
      if(strike == 1){
        System.out.println("You have a chance at striking first, which item are you willing to use for the attack/defence?");
        System.out.println("You curantly have a(n) " + String.valueOf(player.loot[0]) + "(1) and " + String.valueOf(player.loot[0]) + "(2)");
        int choiceOfWeapons = myObj.nextInt();
        if(choiceOfWeapons == 1){
          player.dmg = sword.ammountOfDamage;
          System.out.println("You will now deal " + player.dmg + " ammount of damage");
        }

      }
      }
    }
    else if(choice1 == 1){
      System.out.println("You come upon a village with some signs near the entrance");
      System.out.println("the first one says: 'Shop', the second one says 'Weapons' the third one says:'Potions', and the last one is: 'Bar'");
    }
  }
}

