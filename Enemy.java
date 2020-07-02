class Enemy{
  public int health = 100;
  public int damage = 10;
  public int AmmountOfLoot = 3;
  public String[] loot = {"Sword, Coins, Potions"};
  public Enemy(int damage, int AmmountOfLoot, String[] loot){
    this.damage = damage;
    this.AmmountOfLoot = AmmountOfLoot;
    this.loot = loot;
  }
}