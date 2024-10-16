public class Demo{

    /*
    Write this method third. Test it then move on
    to the others.
    */
    public static double distance(Point a, Point b){
      return Math.pow(Math.pow((a.getX() - b.getX()),2) + Math.pow((a.getY() - b.getY()), 2), 0.5);
    }
  
    public static void main(String[]args){
      Point p1 = new Point(1,1);
      Point p2 = new Point(-1,-1);
      Point p3 = new Point(3,4);
      Point p4 = new Point(p3);
  
      System.out.println(p3);
      System.out.println(p4 + " Is it the same point as p4? " + (p3 == p4));
      System.out.println("distance between " + p1 + " and " + p2 + ": " + distance(p1,p2));
      System.out.println( Point.distance(p1,p2));
      System.out.println( p1.distanceTo(p2));
  
      p2 = new Point(0,2);
      p1  = new Point(3,6);
      System.out.println("distance between " + p1 + " and " + p2 + ": " + distance(p1,p2));
      System.out.println( Point.distance(p1,p2));
      System.out.println( p1.distanceTo(p2));
  
     p1 = new Point(-40,-10);
     p2  = new Point(0,-1);
     System.out.println("distance between " + p1 + " and " + p2 + ": " + distance(p1,p2));
     System.out.println( Point.distance(p1,p2));
     System.out.println( p1.distanceTo(p2));
  
     Point eqP1 = new Point(0, 0);
     Point eqP2 = new Point(1, 0);
     Point eqP3 = new Point(0.5, Math.sqrt(3)*0.5);
     System.out.println("distance between " + eqP1 + " and " + eqP2 + ": " + distance(eqP1,eqP2));
     System.out.println("distance between " + eqP1 + " and " + eqP3 + ": " + distance(eqP1,eqP3));
     System.out.println("distance between " + eqP2 + " and " + eqP3 + ": " + distance(eqP2,eqP3));
  
  
    }
  }