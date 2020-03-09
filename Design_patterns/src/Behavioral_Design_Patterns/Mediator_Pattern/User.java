package Behavioral_Design_Patterns.Mediator_Pattern;

public class User {
	private String name;

	   public String getName() {
	      return name;
	   }

	   public void setName(String name) {
	      this.name = name;
	   }

	   public User(String name){
	      this.name  = name;
	   }

	   public void sendMessage(String message){
	      Message.showMessage(this,message);
	   }
}
