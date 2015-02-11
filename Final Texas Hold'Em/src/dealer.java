import java.util.Scanner;
public class dealer
	{
	public static String [] dealerFace1={"Diamonds","Clubs", "Spades", "Hearts"};
	public static String [] dealerNumber1={"2","3","4","5","6", "7", "8", "9","10", "Jack", "Queen", "King","Ace"};
	public static String [] dealerFace2={"Diamonds","Clubs", "Spades", "Hearts"};
	public static String [] dealerNumber2={"2","3","4","5","6", "7", "8", "9","10", "Jack", "Queen", "King","Ace"};
	public static String [] dealerFace3={"Diamonds","Clubs", "Spades", "Hearts"};
	public static String [] dealerNumber3={"2","3","4","5","6", "7", "8", "9","10", "Jack", "Queen", "King","Ace"};
	public static String [] dealerFace4={"Diamonds","Clubs", "Spades", "Hearts"};
	public static String [] dealerNumber4={"2","3","4","5","6", "7", "8", "9","10", "Jack", "Queen", "King","Ace"};
	public static String [] dealerFace5={"Diamonds","Clubs", "Spades", "Hearts"};
	public static String [] dealerNumber5={"2","3","4","5","6", "7", "8", "9","10", "Jack", "Queen", "King","Ace"};
	static int dieRoll;
	static int dieRoll1;
	static int dieRoll2;
	static int dieRoll3;
	static int dieRoll4;
	static int dieRoll5;
	static int dieRoll6;
	static int dieRoll7;
	static int dieRoll8;
	static int dieRoll9;	
	public static void dealerFirst()
		{
		Scanner userInput=new Scanner(System.in);
		dieRoll=(int)(Math.random()*dealerFace1.length);
		dieRoll2=(int)(Math.random()*dealerNumber1.length);
		
		Scanner userInput1=new Scanner(System.in);
		dieRoll1=(int)(Math.random()*dealerFace2.length);
		dieRoll3=(int)(Math.random()*dealerNumber2.length);
		
		
		Scanner userInput2=new Scanner(System.in);
		dieRoll4=(int)(Math.random()*dealerFace3.length);
		dieRoll5=(int)(Math.random()*dealerNumber3.length);
			{
			System.out.println("Dealer: These are your first cards to work with.");
			System.out.println(""+dealerNumber1[dieRoll2] +" of "+dealerFace1[dieRoll]+"     " + dealerNumber2[dieRoll3]+ " of " + dealerFace2[dieRoll1]+"     " + dealerNumber3[dieRoll5]+ " of "+ dealerFace3[dieRoll4]);
			}
			
		}
			
		public static void dealer2()
		{
		Scanner userInput3=new Scanner(System.in);
		dieRoll6=(int)(Math.random()*dealerFace4.length);
		dieRoll7=(int)(Math.random()*dealerNumber4.length);
			{
			System.out.println("Here is your 4th card.");
			System.out.println(""+dealerNumber5+dealerNumber4[dieRoll7]+" of "+ dealerFace4[dieRoll6]+ " ");
			}
		}
			
		public static void dealer3()
		{
		Scanner userInput4=new Scanner(System.in);
		dieRoll8=(int)(Math.random()*dealerFace5.length);
		dieRoll9=(int)(Math.random()*dealerNumber5.length);
			{
			System.out.println("Here is your 5th card and final card.");
			System.out.println(""+dealerNumber5[dieRoll9]+" of "+ dealerFace5[dieRoll8]+ " ");
			}
		}
	}
		
	



		
