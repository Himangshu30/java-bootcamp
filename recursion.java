//Java program to compute the factoreial of an given number

import java.io.*;
import java.util.*;
class Main
{
 public static int fact(int n){

  if(n==0)
return 1;
else
  return n*fact(n-1);
}
public class recursion{
public static void main(String args[]){

Scanner input = new Scanner(System.in);
System.out.println("Enter the value you want:");
int n = input.nextInt();
int result = fact(n);
System.out.println("Factorial of the given number is :" +result);
}
}
}
