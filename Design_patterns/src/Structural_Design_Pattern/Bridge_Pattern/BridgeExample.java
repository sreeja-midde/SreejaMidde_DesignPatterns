package Structural_Design_Pattern.Bridge_Pattern;

public class BridgeExample {
	 public static void main(String[] args) {
	      Shape orangecircle = new Circle(80,10, 10, new OrangeCircle());
	      Shape bluecircle = new Circle(80,10, 10, new BlueCircle());

	      orangecircle.draw();
	      bluecircle.draw();
	   }
}
