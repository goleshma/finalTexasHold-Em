import java.util.Scanner;
public class betting
	{
	public static void bettingFirst()
		{
		Scanner userInput=new Scanner(System.in);
		System.out.println("How much would you like to bet?");
		int bet1=userInput.nextInt();
		System.out.println("The money in the pot is currently $" + bet1 + ".");
		}
	}