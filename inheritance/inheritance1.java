//parent class
class A{
	int i = 10, j =30;
        void show() //show method in class A
       	{
	System.out.println(i+" "+j);
	}
}

class B extends A{
	int k=50;
        void sum()
       	{
	System.out.println(i+j+k);
	}
		
}

public class inheritance1{
	public static void main(String args[]){
        B b = new B();
	b.sum();
	}
}

