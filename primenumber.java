//using methods

import java.util.Scanner;

	public class primenumber
	{
		public static void main(String[] args)
		{
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter the what number you have to check prime number or not : ");
			int number = scanner.nextInt();
			
			if(isPrime(number))
			{
				System.out.println(number + " is a prime number.");
			}
			else
			{
				System.out.println(number + " is not a prime number.");
			}
			
		}
		
		public static boolean isPrime(int number)
		{
			for(int i=2;i<=number/2;i++)
			{
				//try each number by using %
				if(number%i==0)
				{
					return false;
				}
				
			}
			return true;
		}
	}
