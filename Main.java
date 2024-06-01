import geometry.Point;
import geometry.ColoredCircle;

public class Main {
  public static void main(String[] args) throws Exception {
    Point point = new Point(3, 4);
    ColoredCircle circle = new ColoredCircle(point, 5, "red");
    System.out.println("Circle color: " + circle.getColor());
    System.out.println("Circle radius: " + circle.getRadius());
    System.out.println("Circle center: (" + circle.getCenter().getX() + ", " + circle.getCenter().getY() + ")");
  }
}