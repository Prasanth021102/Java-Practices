class object2
{
	String name;
	int rollno;
	
	public void disp()
	{
		System.out.print(name);
		System.out.print(rollno);
	}
	
	//creating function for giving arguments
	
	public void setvalues(String str,int num)
	{
		name = str;
		rollno  = num;
	}
	
	
}

class Main
{
	public static void main(String[] args)
	{
	      object2 obj1 = new object2();
		  
		  obj1.setvalues("rahul",71);
		  
		  obj1.disp();
		  
		  //second object craeting 
		  object2 obj2 = new object2();
		  
		  obj2.name="rohan";
		  obj2.rollno=372;
		  obj2.disp();
		  
		  
	}
	
}