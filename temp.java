//celcius to farhenhite

import java.util.*;
import java.io.*;

public class temp{
   	public static void main(String[] args)	
	{
        Scanner input = new Scanner(System.in);
	double temparature;
	System.out.println("Enter the temaparature in celcius:");
	temparature = input.nextDouble();
	temparature = (temparature*9/5.0)+32;
	System.out.println("Temparature in farhenhite:" +temparature);

 	}
}
