import java.util.*;
import java.io.*;
public class areaofrec
	{
   	 public static void main(String[] args)
 	{
	 Scanner input = new Scanner(System.in);
	 double area,length,width;
	 System.out.println("Enter the length and width :");
	 length = input.nextDouble();
	 width = input.nextDouble();
 	 area = length * width;
	 System.out.println("Area of rectangle = " +area);
	}
}
 
