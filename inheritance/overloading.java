//method overloading

import java.io.*;
import java.util.*;

class maximum{
	//two parameters
	int findmax(int a, int b)
	{
	int max;
	if(a>b)
	max =a;
	else 
	max =b;
	return max;
	}
        //three parameters
	int findmax(int a, int b, int c)
	{
	int max;
  	if(a>b && a>c)
	max = a;
        else if(b>a && b>c)
	max = b;
	else
	max = c;
	return max;
        }
}
public class overloading{
	public static void main(String args[]){
        maximum m = new maximum();
 	
	int result1 = m.findmax(100,78);
	System.out.println("THE MAX IS : " +result1);
	int result2 = m.findmax(98,75,4);
	System.out.println("THE MAX IS : " +result2);

 }

}

