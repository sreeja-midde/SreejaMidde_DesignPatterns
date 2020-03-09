package Creational_Design_Patterns.Singleton_Pattern;

public class SingletonClass {
	private static SingletonClass instance = new SingletonClass();

	   private SingletonClass(){}

	   public static SingletonClass getInstance(){
	      return instance;
	   }

	   public void showMessage(){
	      System.out.println("From Singleton Class !");
	   }
}
