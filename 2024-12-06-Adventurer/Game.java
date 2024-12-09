import java.util.Scanner;


public class Game{

  public static void main(String[] args){
    Adventurer playerCharacter = new Artificer("Smith", 12);
    Adventurer otherCharacter = new CodeWarrior("Thor", 12, "c++");
    System.out.println("\n" + playerCharacter + " vs " + otherCharacter);

    Scanner userInput = new Scanner(System.in);
    int count = 0;
    while(playerCharacter.getHP() > 0 && otherCharacter.getHP() > 0){
      count++;
      System.out.println("Round " + count + ":");
      System.out.println("User turn:");
      System.out.println("Available Actions:\n1. Attack: a\n2. Special: sp\n3. Support: su\n4. quit");
      String actionChoice = userInput.nextLine();
      boolean isNotRealAnswer = true;
      while(isNotRealAnswer){
        if(actionChoice.equals("a")){
          System.out.println("\n" + playerCharacter.attack(otherCharacter));
          isNotRealAnswer = false;
        }
        else if(actionChoice.equals("sp")){
          System.out.println("\n" + playerCharacter.specialAttack(otherCharacter));
          isNotRealAnswer = false;
        }
        else if(actionChoice.equals("su")){
          System.out.println("\n" + playerCharacter.support());
          isNotRealAnswer = false;
        }
        else if(actionChoice.equals("quit")){
          System.out.println("\n" + "You cravenly retreat from battle.");
          playerCharacter.setHP(0);
          isNotRealAnswer = false;
        }
        else{
          System.out.println("\n" + "I'm sorry, I didn't quite understand that. Try Again.");
          System.out.println("Available Actions:\n1. Attack: a\n2. Special: sp\n3. Support: su\n4. Quit");
          actionChoice = userInput.nextLine();
        }
      }
      if(playerCharacter.getHP() > 0 && otherCharacter.getHP() > 0){
        int possibleAction = (int)(Math.random() * 3);
        if(possibleAction == 0){
          System.out.println(otherCharacter.attack(playerCharacter));
        }
        else if(possibleAction == 1){
          System.out.println(otherCharacter.specialAttack(playerCharacter));
        }
        else{
          System.out.println(otherCharacter.support());
        }
      }
      System.out.println();
    }
    if(playerCharacter.getHP() > 0){
      System.out.println(playerCharacter + " wins! Congratulations!");
    }
    else{
      System.out.println(otherCharacter + " wins! Better luck next time");
    }

    System.out.println();

  }

}
