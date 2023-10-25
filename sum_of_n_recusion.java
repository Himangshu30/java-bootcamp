//sum of n numbers using recursion method

import java.io.*;
import java.util.*;

public class sum_of_n_recusion{
 
 public static int sum(int n){
 
 if (n==0)

 return 0;

 else 
 return (n+sum(n-1));
}
public static void main(String args[])
{
int n=5;
System.out.println(sum(n));
}
}
