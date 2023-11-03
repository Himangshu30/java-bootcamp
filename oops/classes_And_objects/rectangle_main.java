//static int

class rectangle {
	int length;
	int breadth;
	rectangle(int l, int b);
{
	length = l;
	breadth = b;
}
static int computeArea(){
	return length*breadth;
     }
}
public class rectangle_main{
	public static void main(String args[]){
	rectangle r1 = new rectangle(10, 5);
	rectangle r2 = new rectangle(8, 9);
        int area1 = r1.computeArea();
	System.out.println("AREA1: " +area1);
	int area2 = r2.computeArea();
        System.out.println("AREA2:" +area2); 	
	}
}
