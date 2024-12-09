public class Artificer extends Adventurer{

  private int special;
  private int specialMax;

  public Artificer(String name){
      super(name, 10);
      setSpecial(10);
  }

  public Artificer(String name, int hp){
    super(name, hp);
    setSpecial(10);
  }

  public Artificer(String name, int hp, int special){
    super(name, hp);
    setSpecial(special);
  }

  public String getSpecialName(){
    return "Scrap";
  }

  public int getSpecial(){
    return special;
  }

  public void setSpecial(int val){
    if(val > specialMax){
      specialMax = val;
    }
    special = val;
  }

  public int getSpecialMax(){
    return specialMax;
  }

  public String attack(Adventurer other){
    int damageRoll = (int)((Math.random() * 4) + 1);
    other.applyDamage(damageRoll);
    return super.getName() + "\'s attack dealt " + damageRoll + "damage to " + other.getName() + " leaving them with " + other.getHP() + " health left";
  }

  public String support(Adventurer other){
    other.restoreSpecial(5);
    return super.getName() + "restored 5 special points to " + other.getName();
  }

  public String support(){
    restoreSpecial(3);
    return super.getName() + "scavenged up 3 scrap making his special total to: " + getSpecial();
  }

  public String specialAttack(Adventurer other){
    if(getSpecial() > 5){
      int damageRoll = (int)((Math.random() * 4) + 10);
      other.applyDamage(damageRoll);
      setSpecial(getSpecial() - 5);
      return super.getName() + "\'s scrap cannon attack dealt" + damageRoll + " damage to " + other.getName() + " leaving them with " + other.getHP() + " health left";
    }
    else{
      return "Out of scrap. Instead, " + attack(other);
    }
  }


}
