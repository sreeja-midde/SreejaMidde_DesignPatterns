package Structural_Design_Pattern.Decorator_Pattern;

public class Yellowshape extends Shape_Decorator {
	public Yellowshape(Shape decoratedShape) {
	      super(decoratedShape);		
	   }

	   @Override
	   public void draw() {
	      decoratedShape.draw();	       
	      setRedBorder(decoratedShape);
	   }

	   private void setRedBorder(Shape decoratedShape){
	      System.out.println("Border Color: Yellow");
	   }
}
