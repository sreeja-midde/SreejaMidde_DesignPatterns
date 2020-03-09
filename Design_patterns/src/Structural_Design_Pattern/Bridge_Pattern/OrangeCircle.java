package Structural_Design_Pattern.Bridge_Pattern;

public class OrangeCircle implements Draw {
	   @Override
	   public void drawCircle(int radius, int x, int y) {
	      System.out.println("Drawing Circle[ color: Orange, radius: " + radius + ", x: " + x + ", " + y + "]");
	   }
}
