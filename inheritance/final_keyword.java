//use of  final keyword
//classes with final keyword cannot be inheriteded

Final class A{
       void method1{
        System.out.println("ABBA IS HERE");
        }
}

class B extends A{
       void method2{
        System.out.println("ABBA KA BACCHA");
       }
}

public class main{
	public static void main(String args[]){
         B b= new B();
         b.method1();  //inherited from class A
         b.method2();  //inherited from class B
     }
}

//this code gives us an error because class A is final and classes with final keyword cannot be inherited


