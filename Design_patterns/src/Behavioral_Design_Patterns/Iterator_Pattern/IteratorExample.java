package Behavioral_Design_Patterns.Iterator_Pattern;

public class IteratorExample {
	public static void main(String[] args) {
	      NewRepository newRepository = new NewRepository();

	      for(Iterator iter = newRepository.getIterator(); iter.hasNext();){
	         String s = (String)iter.next();
	         System.out.println("Name : " + s);
	      } 	
	   }
}
