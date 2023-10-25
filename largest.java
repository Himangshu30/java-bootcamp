
//Write a Java Program to Find Largest of Three Numbers

import java.util.Scanner;

public class largest {
     public static void main(String args[]){
 
     Scanner input = new Scanner(System.in);

     System.out.println("Enter the first number:");
     double num1 = input.nextDouble();
 
     System.out.println("Enter the second number:");
     double num2 = input.nextDouble();

     System.out.println("Enter the third number:");
     double num3 = input.nextDouble();

     double largest = largest(num1,num2,num3);
     System.out.println("The largest number is :" + largest);
   
     input.close();
   }
 
public static double largest(double num1, double num2, double num3) {
        if (num1 >= num2 && num1 >= num3) {
            return num1;
        } else if (num2 >= num1 && num2 >= num3) {
            return num2;
        } else {
            return num3;
        }
    }
}
