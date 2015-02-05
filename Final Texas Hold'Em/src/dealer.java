import java.util.Scanner;
public class dealer
	{
	public static void main(String[] args)
	{
	}
		public static void dealer1()
		{
		Scanner userInput=new Scanner(System.in);
		String [] randomFace1={"Diamonds","Clubs", "Spades", "Hearts"};
		int dieRoll=(int)(Math.random()*randomFace1.length);
		String [] randomNumber1={"Ace","2","3","4","5","6", "7", "8", "9","10", "Jack", "Queen", "King"};
		int dieRoll2=(int)(Math.random()*randomNumber1.length);
		
		Scanner userInput1=new Scanner(System.in);
		String [] randomFace2={"Diamonds","Clubs", "Spades", "Hearts"};
		int dieRoll1=(int)(Math.random()*randomFace2.length);
		String [] randomNumber2={"Ace","2","3","4","5","6", "7", "8", "9","10", "Jack", "Queen", "King"};
		int dieRoll3=(int)(Math.random()*randomNumber2.length);
		
		Scanner userInput2=new Scanner(System.in);
		String [] randomFace3={"Diamonds","Clubs", "Spades", "Hearts"};
		int dieRoll4=(int)(Math.random()*randomFace3.length);
		String [] randomNumber3={"Ace","2","3","4","5","6", "7", "8", "9","10", "Jack", "Queen", "King"};
		int dieRoll5=(int)(Math.random()*randomNumber3.length);
		
			{
			System.out.println("Dealer: These are your first cards to work with. Now you are going to bet on how the cards help your two cards make a winning hand.");
			}
		}
			
		public static void dealer2()
		{
		Scanner userInput=new Scanner(System.in);
		String [] randomFace1={"Diamonds","Clubs", "Spades", "Hearts"};
		int dieRoll=(int)(Math.random()*randomFace1.length);
		String [] randomNumber1={"Ace","2","3","4","5","6", "7", "8", "9","10", "Jack", "Queen", "King"};
		int dieRoll2=(int)(Math.random()*randomNumber1.length);
			{
			System.out.println("Dealer: You now have four cards to add to your original two cards. Now bet again on your chances of creating a winning hand.");
			}
		}



		
