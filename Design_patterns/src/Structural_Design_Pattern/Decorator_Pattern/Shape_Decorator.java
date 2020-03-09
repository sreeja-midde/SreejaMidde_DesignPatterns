package Structural_Design_Pattern.Decorator_Pattern;

public abstract class Shape_Decorator implements Shape {
	   protected Shape decoratedShape;

	   public Shape_Decorator(Shape decoratedShape){
	      this.decoratedShape = decoratedShape;
	   }

	   public void draw(){
	      decoratedShape.draw();
	   }	
	}
