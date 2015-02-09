import java.util.Scanner;
public class dealer
	{
	public static void dealerFirst()
		{
		Scanner userInput=new Scanner(System.in);
		String [] dealerFace1={"Diamonds","Clubs", "Spades", "Hearts"};
		int dieRoll=(int)(Math.random()*dealerFace1.length);
		String [] dealerNumber1={"Ace","2","3","4","5","6", "7", "8", "9","10", "Jack", "Queen", "King"};
		int dieRoll2=(int)(Math.random()*dealerNumber1.length);
		
		
		Scanner userInput1=new Scanner(System.in);
		String [] dealerFace2={"Diamonds","Clubs", "Spades", "Hearts"};
		int dieRoll1=(int)(Math.random()*dealerFace2.length);
		String [] dealerNumber2={"Ace","2","3","4","5","6", "7", "8", "9","10", "Jack", "Queen", "King"};
		int dieRoll3=(int)(Math.random()*dealerNumber2.length);
		
		
		Scanner userInput2=new Scanner(System.in);
		String [] dealerFace3={"Diamonds","Clubs", "Spades", "Hearts"};
		int dieRoll4=(int)(Math.random()*dealerFace3.length);
		String [] dealerNumber3={"Ace","2","3","4","5","6", "7", "8", "9","10", "Jack", "Queen", "King"};
		int dieRoll5=(int)(Math.random()*dealerNumber3.length);
			{
			System.out.println("Dealer: These are your first cards to work with. Now you are going to bet on how the cards help your two cards make a winning hand.");
			System.out.println(""+dealerNumber1[dieRoll2] +" of "+dealerFace1[dieRoll]+"     " + dealerNumber2[dieRoll3]+ " of " + dealerFace2[dieRoll1]+"     " + dealerNumber3[dieRoll5]+ " of "+ dealerFace3[dieRoll4]);
			}
			
		}
			
		public static void dealer2()
		{
		Scanner userInput3=new Scanner(System.in);
		String [] dealerFace4={"Diamonds","Clubs", "Spades", "Hearts"};
		int dieRoll6=(int)(Math.random()*dealerFace4.length);
		String [] dealerNumber4={"Ace","2","3","4","5","6", "7", "8", "9","10", "Jack", "Queen", "King"};
		int dieRoll7=(int)(Math.random()*dealerNumber4.length);
			{
			System.out.println("Here is your 4th card.");
			System.out.println(""+dealerNumber4[dieRoll7]+" of "+ dealerFace4[dieRoll6]+ " ");
			}
		}
	}



		
