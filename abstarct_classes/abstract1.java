//abstract class

abstract class shape
{
 abstract void draw();
}
class rectangle extends shape
{
  void draw()
 {
  System.out.println("Draw Rectangle");
 }
}

class rectangle extends shape
{
 void draw()
 {
  System.out.println("Draw Triangle");
 }
}

public class abstract1 {
 public static void main(String args[]){
  shape s1 = new rectangle();
  s1.draw();
  s1 = new rectangle();
  s1.draw();
 }
}

