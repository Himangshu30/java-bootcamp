//java program to implmen the fibonacci series

import java.io.*;
import java.util.*;

class fibo{
 public static int fib(int n)
{
if(n == 0)
return 0;
else if(n == 1)
return 1;
else 
return fib(n-1)+fib(n-2);
}
public static void main(String args[])
{
Scanner input =new Scanner(System.in);
System.out.println("Enter the value you want to deploy:");
int n= input.nextInt();
int result = fib(n);
System.out.println("The fibonacci series is :" +result);
}
}

