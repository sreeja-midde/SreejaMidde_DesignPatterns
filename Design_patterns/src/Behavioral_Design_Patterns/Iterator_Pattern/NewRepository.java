package Behavioral_Design_Patterns.Iterator_Pattern;

public class NewRepository implements Container{
	public String newit[] = {"Sehwag","Kohli","Trump","Modi"};
	   
	   @Override
	   public Iterator getIterator(){
	      return new NewIterator();
	   }

	   private class NewIterator implements Iterator {

	      int index;

	      @Override
	      public boolean hasNext() {
	      
	         if(index < newit.length){
	            return true;
	         }
	         return false;
	      }

	      @Override
	      public Object next() {
	      
	         if(this.hasNext()){
	            return newit[index++];
	         }
	         return null;
	      }		
	   }

}
