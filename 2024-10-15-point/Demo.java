public class Demo{

  /*
  Write this method third. Test it then move on
  to the others.
  */
  public static double distance(Point a, Point b){
    return Math.sqrt(Math.pow((a.getY() - b.getY()), 2) + Math.pow((a.getX() - b.getX()), 2));
  }

  public static void main(String[]args){
    Point p1 = new Point(1,1);
    Point p2 = new Point(-1,-1);
    Point p3 = new Point(3,4);
    Point p4 = new Point(p1);
    Point p5 = new Point(p2);

    //Test cases for the printing functions as well as the constructors
    System.out.println("\nTest Cases for Constructors");
    System.out.println(p3);
    System.out.println(p4);
    System.out.println(p5);

    //Test Cases for the Distance Functions
    System.out.println("\nTest Cases for Distance Functions:");
    System.out.println("Demo's distance function");
    System.out.println(distance(p1,p2));
    System.out.println(distance(p2, p3));
    System.out.println(distance(p4, p3));

    System.out.println("Points' distance function:");
    System.out.println( Point.distance(p1,p2));
    System.out.println( Point.distance(p2,p3));
    System.out.println( Point.distance(p4,p3));

    System.out.println("Points' distanceTo function");
    System.out.println( p1.distanceTo(p2));
    System.out.println( p2.distanceTo(p3));
    System.out.println( p4.distanceTo(p3));
  }
}
