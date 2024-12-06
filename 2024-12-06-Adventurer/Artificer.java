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

}
