import java.util.Scanner;
public class betting
	{
	public static int bet1; 
	public static int bet2; 
	public static int bet3;
	public static int bet4;
	public static int pot1;
	public static int pot2;
	public static int pot3;
	public static void bettingFirst()
		{
		Scanner userInput=new Scanner(System.in);
		System.out.println("How much would you like to bet?");
		bet1=userInput.nextInt();
		System.out.println("The money in the pot is currently $" + bet1 + ".");
		}
	public static void bettingSecond()
		{
		Scanner userInput2=new Scanner(System.in);
		System.out.println("How much would you like to bet?");
		bet2=userInput2.nextInt();
		pot1 = bet1+bet2;
		System.out.println("The money in the pot is currently $" + pot1+ " .");
		}
	public static void bettingThird()
		{
		Scanner userInput3=new Scanner(System.in);
		System.out.println("How much would you like to bet?");
		bet3=userInput3.nextInt();
		pot2 = bet1+bet2+bet3;
		System.out.println("The money in the pot is currently $" + pot2+ ".");
		}
	public static void bettingFourth()
		{
		Scanner userInput4=new Scanner(System.in);
		System.out.println("How much would you like to bet?");
		bet4=userInput4.nextInt();
		pot3 = bet1+bet2+bet3+bet4;
		System.out.println("The money in the pot is currently $" + pot3+ ".");
		}
	}
