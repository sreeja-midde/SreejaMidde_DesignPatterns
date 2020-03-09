package Structural_Design_Pattern.Decorator_Pattern;

public class DecoratorExample {
	public static void main(String[] args) {

	      Shape circle = new Circle();

	      Shape yellowCircle = new Yellowshape(new Circle());

	      Shape yellowRectangle = new Yellowshape(new Rectangle());
	      System.out.println("Circle with normal border");
	      circle.draw();

	      System.out.println("\nCircle of yellow border");
	      yellowCircle.draw();

	      System.out.println("\nRectangle of yellow border");
	      yellowRectangle.draw();
	   }
}
