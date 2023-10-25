//define a class by another process

class student{
  int id ;
  String name;
}

  class main{
  
public static void main(String args[]){
 
  student m = new  student();
  m.id = 10;
  m.name = "himangshu";
 
   System.out.println(m.id);
   System.out.println(m.name);
  }

}
