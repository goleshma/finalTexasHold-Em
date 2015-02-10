import java.util.Scanner;
public class ai
	{
		public static void ai1()
			{
				Scanner userInput1=new Scanner(System.in);
				String [] randomFace1={"Diamonds","Clubs", "Spades", "Hearts"};
				int dieRoll=(int)(Math.random()*randomFace1.length);
				String [] randomNumber1={"Ace","2","3","4","5","6", "7", "8", "9","10", "Jack", "Queen", "King"};
				int dieRoll2=(int)(Math.random()*randomNumber1.length);
					{
				Scanner userInput2=new Scanner(System.in);
				String [] randomFace2={"Diamonds","Clubs", "Spades", "Hearts"};
				int dieRoll3=(int)(Math.random()*randomFace2.length);
				String [] randomNumber2={"Ace","2","3","4","5","6", "7", "8", "9","10", "Jack", "Queen", "King"};
				int dieRoll4=(int)(Math.random()*randomNumber2.length);
				System.out.println("Your two cards: "+ randomNumber1[dieRoll2] + " of " + randomFace1[dieRoll] + "     " + randomNumber2[dieRoll4] + " of " + randomFace2[dieRoll3] +".");
					}
			}
	}