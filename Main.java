import geometry.Rectangle;

public class Main {
  public static void main(String[] args) throws Exception {
    Rectangle rectangle = new Rectangle(5, 10);
    System.out.println("Area: " + rectangle.calculateArea());
    System.out.println("Perimeter: " + rectangle.calculatePerimeter());
  }
}