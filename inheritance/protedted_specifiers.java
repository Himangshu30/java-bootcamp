//protected specifiers

class Access
{
	private int a = 10;
	protected int b = 20;
}

class subclass extends Access
{
	public void get()
	{
	 System.out.println(a);
	 System.our.println(b);
	}
}
 public clas protedted_specifiers{
  public static void main(String args[]){
	subclass s = new subclass();
	s.get;
       }
}//that codes give us error because a is not printable for being an protected specifier 
