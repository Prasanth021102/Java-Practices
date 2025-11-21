//find the factorial of given number
//n = 5 | 5*4*3*2*1

public class factorial
{
	public static void main(String[] args)
	{
		int n=3;
		int fact=1;
		
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
			
		}
		System.out.print(fact);
	}
}