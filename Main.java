import geometry.Point;
import geometry.Circle;

public class Main {
  public static void main(String[] args) throws Exception {
    Point point = new Point(3, 4);
    Circle circle = new Circle(point, 5);
    System.out.println(circle.calculatePerimeter());
  }
}