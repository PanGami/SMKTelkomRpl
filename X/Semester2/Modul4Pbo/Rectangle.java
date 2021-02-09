/*
 * The Rectangle class, subclass of Shape
 */
public class Rectangle extends Shape {
   // Private member variables
   private int length;
   private int width;
   // Contructor
   public Rectangle(String color, int length, int width) {
      super(color);
      this.length = length;
      this.width = width;
   }
   @Override
   public String toString() {
      return "Rectangle[length=" + length + ",width=" + width + "," + super.toString() + "]";
   }   
   // Override the inherited getArea() to provide the proper implementation for rectangle
   @Override
   public double getArea() {
      return length*width;
   }
}