import geometry.Point;

import java.util.ArrayList;

import geometry.Circle;
import geometry.ColoredCircle;

public class Main {
  public static void main(String[] args) throws Exception {

    ArrayList<Object> circles = new ArrayList<Object>();

    Circle circle = new Circle(new Point(3, 8), 66);
    Circle circle2 = new Circle(new Point(5, 4), 3);
    ColoredCircle circle3 = new ColoredCircle(new Point(3, 4), 8, "red");
    ColoredCircle circle4 = new ColoredCircle(new Point(3, 4), 3, "blue");

    circles.add(circle);
    circles.add(circle2);
    circles.add(circle3);
    circles.add(circle4);

    for (Object c : circles) {
      if (c instanceof ColoredCircle) {

        ColoredCircle cc = (ColoredCircle) c;
        System.out.println("Circle is colored, color: " + cc.getColor());
        System.out.println(cc.getRadius());
        System.out.println(cc.getCenter());

      } else {
        Circle cc = (Circle) c;
        System.out.println("Circle is not colored");
        System.out.println(cc.getRadius());
        System.out.println(cc.getCenter());
      }

    }

  }
}