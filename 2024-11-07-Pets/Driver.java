//When we made the change to the getName accessor method, the new getName changed the result of speak, adding "The Mighty" to it.
//This is because speak uses accessor methods in order to print the string.
//If the accesor method changes, we will see a different result printed.



public class Driver{
  public static void main(String[] args){
    Animal tester = new Animal("AAAAAAAAA", 5, "tester");
    tester.speak();
    Bird tester2 = new Bird("hiii", 2, "kyle", 20.0, "green");
    tester2.speak();

    Animal a1 = new Animal("ejewjnew", 3, "margaret");
    Bird b1 = new Bird("lalalala", 1, "mary", 10.0, "pink");
    Bird b2 = new Animal("tralalala", 7, "jake peralta");
    Animal a2 = new Bird("hello", 50, "big bird", 120.0, "yellow"); 

  }
}
