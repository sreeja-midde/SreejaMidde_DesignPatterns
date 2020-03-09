package Creational_Design_Patterns.Prototype_Pattern;

public class PrototypeExample {
	 public static void main(String[] args) {
	      Shapecalculate.loadCache();

	      Shape clonedShape = (Shape) Shapecalculate.getShape("1");
	      System.out.println("Shape : " + clonedShape.getType());		

	      Shape clonedShape2 = (Shape) Shapecalculate.getShape("2");
	      System.out.println("Shape : " + clonedShape2.getType());		
	   }
}
