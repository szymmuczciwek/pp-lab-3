package geometry;

public class Rectangle {
  private double length;
  private double width;

  public Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
  }

  // gettery i setery - nie było w zadaniu ale wygenerowałem
  public double getLength() {
    return this.length;
  }

  public void setLength(double length) {
    this.length = length;
  }

  public double getWidth() {
    return this.width;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public double calculateArea() {
    return this.length * this.width;
  }

  public double calculatePerimeter() {
    return 2 * this.length + 2 * this.width;
  }

}