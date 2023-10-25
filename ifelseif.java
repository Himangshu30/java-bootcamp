public class ifelseif{
    public static void main(String[] args){
    
    int num=1234;
  
    if(num<100 && num>=1){
    System.out.println("the number is two digit number");
    }
  
    else if(num<1000 && num>=100){
    System.out.println("the number is three digit");
    }
 
    else if(num<10000 && num>=1000){
    System.out.println("the number is four digit");
    }
   
    else{
    System.out.println("The number is five digit");
    }
}
}
