import java.util.Scanner;
class array2
/*{
	public static void main(String[] args)
	{
		String str = "who are you";
		
		System.out.println(str.toUpperCase());
		
	}
}*/

/*{
	public static void main(String[] args)
	{
		String lower = "MY NAME IS PRASANTH";
		
		System.out.println(lower.toLowerCase());
	}
}*/

{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		char[] characters =  input.toCharArray();
		for(char ch : characters)
		{
			if(Character.isDigit(ch))
			{
				System.out.print(ch);
			}
		}
	}
}