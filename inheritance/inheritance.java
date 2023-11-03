
//show the inheritance method 

	class parent{
		
		  void display()
	{
	  System.out.println("I AM ABBA");
	}
}
	class child{
		
		  void show()
	{
	System.out.println("I AM BACCHA");
	}
}

public class inheritance{
  public static void main(String args[]){
 
  child c = new child();
  c.show();
  c.display();
 }
}
