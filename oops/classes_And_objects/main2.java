//example of constructor for class Student

class student{
	String student_name;
	public student(String student_name)
	{
	this.student_name = student_name;
	}
public String getName()
	{
	 return student_name;
	}
}
public class main2{
	public static void main(String args[])
	{
	 student s = new student("BHUPENDRA YOGI");
	 System.out.println(s.getName());  // instead of using s.getName() you can use s.student_name
	}
}
