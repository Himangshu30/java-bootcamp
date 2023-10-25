import java.io.*;
import java.util.*;

class gcd{
public static int gcd(int num1 , int num2)
{
 if (num2!=0)
return gcd(num2, num1%num2);
else 
return num1;
}
public static void main(String args[])
{
Scanner input = new Scanner(System.in);
System.out.println("Enter the 1st number:");
int a = input.nextInt();
System.out.println("Enter the 2nd number:");
int b = input.nextInt();
int result = gcd(a,b);
System.out.println("Result is :" +result);
}
}
