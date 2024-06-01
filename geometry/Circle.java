package geometry;

public class Circle {
  private Point center;
  private double radius;

  public Circle(Point center, double radius) {
    this.center = center;
    this.radius = radius;
  }

  public Point getCenter() {
    return this.center;
  }

  public void setCenter(Point center) {
    this.center = center;
  }

  public double getRadius() {
    return this.radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public float calculatePerimeter() {
    return (float) (2 * Math.PI * this.radius);
  }

}