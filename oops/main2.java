//rectangle class 

class Rectangle {
  int length;
  int breadth;

  void insert(int l, int b) {
    length = l;
    breadth = b;
  }

  void computeArea() {
    System.out.println("Area: " + length * breadth);
  }
}

public class main2 {
  public static void main(String[] args) {
    Rectangle r1 = new Rectangle();
    Rectangle r2 = new Rectangle();
    r1.insert(10, 7);
    r2.insert(5, 4);

    r1.computeArea();
    r2.computeArea();
  }
}

