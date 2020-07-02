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

    if(choice1 == 2){ 
      Room room = new Room((int)Math.round(Math.random() * 4) + 1, (int)Math.round(Math.random() * 9) + 3, (int)Math.round(Math.random() * 5)+1);
      System.out.println("The room of the dungeon that lies infront of you has " + String.valueOf(room.ammountOfEnemies) + " enemie(s) and the chest seems to have right about " + String.valueOf(room.chestLoot) + " items, so you better fight for them");
    }
    
  }
}

