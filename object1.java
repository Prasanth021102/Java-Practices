class object1
{
	
	String name;
	int rollno;
	
	public void disp()
	{
		System.out.println(name);
		System.out.println(rollno);
		
	}
	
	public static void main(String[] args)
	{
		
		object1 obj = new object1();
		
		obj.name = "hari";
		obj.rollno = 2;
		
		obj.disp();
		
		// also craeting new object1
		
		object1 obj2 = new object1();
		
		obj2.name="VIJAY KUMAR";
		obj2.rollno=1;
		
		obj2.disp();
		
		
		
		
	}

	
}





	
	

		