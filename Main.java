import geometry.Square;

public class Main {
  public static void main(String[] args) throws Exception {
    Square square = new Square(5);
    System.out.println("Area: " + square.calculateArea());
    System.out.println("Perimeter: " + square.calculatePerimeter());
  }
}