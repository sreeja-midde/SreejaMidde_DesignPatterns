package Structural_Design_Pattern.Bridge_Pattern;

public abstract class Shape {
	protected Draw d;
	   
	   protected Shape(Draw d){
	      this.d = d;
	   }
	   public abstract void draw();	
}
