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
		cardBoard.cardBoard1[0][0]=dealerNumber1[dieRoll2];
		cardBoard.cardBoard2[0][0]=dealerFace1[dieRoll];
		
		Scanner userInput1=new Scanner(System.in);
		String [] dealerFace2={"Diamonds","Clubs", "Spades", "Hearts"};
		int dieRoll1=(int)(Math.random()*dealerFace2.length);
		String [] dealerNumber2={"Ace","2","3","4","5","6", "7", "8", "9","10", "Jack", "Queen", "King"};
		int dieRoll3=(int)(Math.random()*dealerNumber2.length);
		cardBoard.cardBoard1[0][1]=dealerNumber2[dieRoll3];
		cardBoard.cardBoard2[0][1]=dealerFace2[dieRoll1]; 
		
		Scanner userInput2=new Scanner(System.in);
		String [] dealerFace3={"Diamonds","Clubs", "Spades", "Hearts"};
		int dieRoll4=(int)(Math.random()*dealerFace3.length);
		String [] dealerNumber3={"Ace","2","3","4","5","6", "7", "8", "9","10", "Jack", "Queen", "King"};
		int dieRoll5=(int)(Math.random()*dealerNumber3.length);
		cardBoard.cardBoard1[0][2]=dealerNumber3[dieRoll5];
		cardBoard.cardBoard2[0][2]=dealerFace3[dieRoll4]; 
		
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
	}



		
