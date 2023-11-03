//method overriding

class parent{
    void display(){
	System.out.println("I AM ABBA");
      }
}
class child extends parent{
	void display(){
	System.out.println("I AM BACCHA OF MY ABBA");
      }
}

public class methodoveriding{
	public static void main(String args[]){
 	parent p = new parent();
	p.display();
	child c = new child();
	c.display();
	}
}

