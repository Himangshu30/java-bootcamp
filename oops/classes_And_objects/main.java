//area of rectangle with help of parameter


class rectangle
{
  int length;
  int breadth;
  rectangle (int l, int b)
  {
   length = l;
   breadth = b;
  }
 
 void computeArea()
{
  System.out.println("Area of rectangle is : " + length*breadth);
}
}

public class main{
  public static void main(String args[]){
  rectangle r1 = new rectangle(10,5);
  rectangle r2 = new rectangle(7,8);
r1.computeArea();
r2.computeArea();
}
}
