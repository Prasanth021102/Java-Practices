import java.util.Scanner;
public class oddeven

{
	public static void main(String[] args)
	{
		//create a input 
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter any number : ");
		int number = scanner.nextInt();
		
		//check the number is even or odd_even
		
		if(number%2==0)
		{
			System.out.print("the number Even");
		}
		else
		{
			System.out.print("the number Odd");
		}
		
	}
}