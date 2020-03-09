package Structural_Design_Pattern.Bridge_Pattern;

public class BlueCircle implements Draw {
	   @Override
	   public void drawCircle(int radius, int x, int y) {
	      System.out.println("Drawing Circle[ color: blue, radius: " + radius + ", x: " + x + ", " + y + "]");
	   }

}
