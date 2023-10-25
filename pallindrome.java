//checking number is pallindrome or not

import java.io.*;
import java.util.*;

public class pallindrome{
   public static void main(String args[]){
 
     Scanner input = new Scanner(System.in);
     int n,sum=0,r,temp;
     System.out.println("Enter any number:");
     n = input.nextInt();
     temp=n;
     while(n!=0)
    {
     r=n%10;
     sum = sum*10+r;
     n = n/10;
    }
    if(sum == temp)
   System.out.println("The given number is pallindrome");
    else
   System.out.println("The given number is not pallindrome");
    }
}
