package Structural_Design_Pattern.Bridge_Pattern;

public class Circle extends Shape {
	 private int x, y, radius;

	   public Circle(int x, int y, int radius, Draw d) {
	      super(d);
	      this.x = x;  
	      this.y = y;  
	      this.radius = radius;
	   }

	   public void draw() {
	      d.drawCircle(radius,x,y);
	   }
}
