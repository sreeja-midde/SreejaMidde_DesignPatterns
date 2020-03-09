package Creational_Design_Patterns.Prototype_Pattern;
import java.util.Hashtable;
public class Shapecalculate {
	 private static Hashtable<String, Shape> shapeMap  = new Hashtable<String, Shape>();

	   public static Shape getShape(String shapeId) {
	      Shape cachedShape = shapeMap.get(shapeId);
	      return (Shape) cachedShape.clone();
	   }

	   
	   public static void loadCache() {
	      Square square = new Square();
	      square.setId("1");
	      shapeMap.put(square.getId(),square);

	      Circle circle = new Circle();
	      circle.setId("2");
	      shapeMap.put(circle.getId(), circle);
	   }
}
