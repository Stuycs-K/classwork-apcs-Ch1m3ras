public class Game{

  public static void main(String[] args){
    Adventurer playerCharacter = new Artificer("Smith", 12);
    Adventurer otherCharacter = new CodeWarrior("Thor", 12, "c++");
    System.out.println(playerCharacter + " vs " + otherCharacter);

    int count = 0;
    while(playerCharacter.getHP() > 0 && otherCharacter.getHP() > 0){
      count++;
      System.out.println("Round " + count + ":");
      
    }

  }

}
