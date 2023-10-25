//java program to implement fibonacci series

import java.io.*;
import java.util.*;

class Main{
public static int Fib(int n);
{
if (n == 0 || n == 1)
return n;

return Fib(n-1)+Fib(n-2);
}

public class Fibonacci{
  public static void main(String args[]){

int n = 5; 
System.out.println("Fibonacci series:");
for(int i=0; i<n; i++){
 
  System.out.println(Fib(i) + " ");
}

    }
  }
}
