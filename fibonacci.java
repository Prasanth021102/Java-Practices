import java.util.Scanner;

public class fibonacci
{
	public static void main(String[] args)
	{
		int n = 6;  //o/p = 1,1,2,3,5,8
		
		int f=1;
		int s=1;
		int t;
		
		System.out.println(f);
		System.out.println(s);
		for(int i=3;i<=n;i++)
		{
			t=f+s;
			System.out.println(t);
			f=s;
			s=t;
			
			
		}
		
		
		
	}
}