package test;

public class Person implements PersonEat, PersonAction
{
   public void eat() {
       System.out.println("Person eat rice");
   }
   public void run() {
	   System.out.println("Person run");
   }
}


