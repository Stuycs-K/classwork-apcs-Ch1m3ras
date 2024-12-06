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
    //Will find way to support later once more than health is added.
    return null;
  }

  public String support(){
    //Will find way to support later once more stats than health is added.
    return null;
  }

  public String specialAttack(Adventurer other){
    int damageRoll = (int)((Math.random() * 4) + 10);
    other.applyDamage(damageRoll);
    setSpecial(getSpecial() - 5);
    return super.getName() + "\'s scrap cannon attack dealt" + damageRoll + " damage to " + other.getName() + " leaving them with " + other.getHP() + " health left";
  }


}
