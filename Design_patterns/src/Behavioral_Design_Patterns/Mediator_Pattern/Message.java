package Behavioral_Design_Patterns.Mediator_Pattern;
import java.util.Date;
public class Message {
	public static void showMessage(User user, String message){
	      System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
	   }
}
