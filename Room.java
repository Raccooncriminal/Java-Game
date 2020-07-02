class Room{
  int chestLoot;
  int floorCoins;
  int ammountOfEnemies = 3;
  public Room(int floorCoins, int chestLoot, int ammountOfEnemies){
    this.floorCoins = floorCoins;
    this.chestLoot = chestLoot;
    this.ammountOfEnemies = ammountOfEnemies;
  }
}