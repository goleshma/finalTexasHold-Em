import java.awt.Component;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

import javax.swing.JOptionPane;
public class gameRunner
{
	public static void main(String[] args)
		{
			greetUser();
			betting.bettingFirst();
			dealer.dealerFirst();
			betting.bettingSecond();
			dealer.dealer2();
			betting.bettingThird();
			dealer.dealer3();
			betting.bettingFourth();
			checkForWon();
		}
	public static String[] randomFace1={"Diamonds","Clubs", "Spades", "Hearts"};
	public static String[] randomFace2={"Diamonds","Clubs", "Spades", "Hearts"};
	public static String [] randomNumber1={"2","3","4","5","6", "7", "8", "9","10", "Jack", "Queen", "King","Ace"};
	public static String [] randomNumber2={"2","3","4","5","6", "7", "8", "9","10", "Jack", "Queen", "King","Ace"};
	public static int dieRoll;
	public static int dieRoll3;
	static int dieRoll22;
	static int dieRoll33;
	static int dieRoll44;
	public static boolean isAStraight=false;
	public static void greetUser()
		{
			String name = JOptionPane.showInputDialog("What is your name?");  
			Scanner userInput=new Scanner(System.in);
			Component frame=null;
			String [] randomCompliment={"Looking good today","You are so smart","I have a feeling you are going to win this game","Your outfit looks very nice, and super original","You are so much smarter than the cumputer you are definetly going to win"};
			int dieRoll1=(int)(Math.random()*randomCompliment.length);
			JOptionPane.showMessageDialog(frame,"Hi there " + name + "! " + randomCompliment[dieRoll1] + "!");
			JOptionPane.showMessageDialog(frame,"Lets play a game of Texas Hold'Em!");
			Object[] options = {"(1) Yes","(2) No"};
			JOptionPane.showOptionDialog(frame,"Are you ready to play a game of Texas Hold'Em?")
			int choice=userInput.nextInt();
				if (choice==1)
					{
					System.out.println("Good lets play!");
					}
				else if (choice==2)
					{
					System.out.println("To bad I am forcing you to play anyways!");
					}
				else
					{
					System.out.println("Hahaha nice try you still have to play the game!");
					}
			System.out.println("Do you know the rules for this poker game?");
			System.out.println("(1) Yes");
			System.out.println("(2) No");
			int choice2=userInput.nextInt();
				if (choice2==1)
					{
					System.out.println("Ok awesome lets start the game!");
					}
				else if (choice2==2)
					{
					System.out.println("Ok so lets go over the rules: You will be given two cards that you may look at throughout the game. You will be allowed to bet after you get your two cards, after you see each new dealed card, and then again at the end. Your goal is to use your cards and the dealed cards to create a winning hand. ");
					}
				else 
					{
					System.out.println("You think your so smart so I am just going to assume you know how to play the game. So lets start!");
					}
				Scanner userInput1=new Scanner(System.in);
				dieRoll=(int)(Math.random()*randomFace1.length);
				dieRoll22=(int)(Math.random()*randomNumber1.length);
					{
				Scanner userInput2=new Scanner(System.in);
				dieRoll33=(int)(Math.random()*randomFace2.length);
				dieRoll44=(int)(Math.random()*randomNumber2.length);
				
						{
						System.out.println("Your two cards: "+ randomNumber1[dieRoll22] + " of " + randomFace1[dieRoll] + "     " + randomNumber2[dieRoll44] + " of " + randomFace2[dieRoll3] +".");
						}
					}
		}

	
		public static void checkForWon()
			{
		ArrayList cardsDealt=new ArrayList();
		cardsDealt.add(randomNumber1[dieRoll22]);
		cardsDealt.add(randomNumber2[dieRoll44]);
		cardsDealt.add(dealer.dealerNumber1[dealer.dieRoll2]);
		cardsDealt.add(dealer.dealerNumber2[dealer.dieRoll3]);
		cardsDealt.add(dealer.dealerNumber3[dealer.dieRoll5]);
		cardsDealt.add(dealer.dealerNumber4[dealer.dieRoll7]);
		cardsDealt.add(dealer.dealerNumber5[dealer.dieRoll9]);
		Collections.sort(cardsDealt);
			
		if ((dieRoll==dieRoll33)&&(dieRoll33==(dealer.dieRoll))&&((dealer.dieRoll)==(dealer.dieRoll1))&&((dealer.dieRoll1)==(dealer.dieRoll4))&&((dealer.dieRoll4)==(dealer.dieRoll6))&&((dealer.dieRoll6)==(dealer.dieRoll8)))
				{
				System.out.println("You got a Flush!");	
				}
		else if((dieRoll22==dieRoll44)&&(dieRoll44==dealer.dieRoll2)&&(dealer.dieRoll2==dealer.dieRoll3)||(dieRoll44==dealer.dieRoll3)&&(dealer.dieRoll3==dealer.dieRoll5)&&(dealer.dieRoll5==dealer.dieRoll7)||(dieRoll22==dealer.dieRoll2)&&(dealer.dieRoll2==dealer.dieRoll3)&&(dealer.dieRoll3==dealer.dieRoll5)||(dieRoll22==dealer.dieRoll3)&&(dealer.dieRoll3==dealer.dieRoll5)&&(dealer.dieRoll5==dealer.dieRoll7)||(dieRoll44==dealer.dieRoll2)&&(dealer.dieRoll2==dealer.dieRoll3)&&(dealer.dieRoll3==dealer.dieRoll5)||(dealer.dieRoll2==dealer.dieRoll3)&&(dealer.dieRoll3==dealer.dieRoll5)&&(dealer.dieRoll5==dealer.dieRoll7)||(dealer.dieRoll2==dealer.dieRoll5)&&(dealer.dieRoll5==dealer.dieRoll7)&&(dealer.dieRoll7==dealer.dieRoll9)||(dealer.dieRoll2==dealer.dieRoll3)&&(dealer.dieRoll3==dealer.dieRoll7)&&(dealer.dieRoll7==dealer.dieRoll9)||(dealer.dieRoll3==dealer.dieRoll5)&&(dealer.dieRoll5==dealer.dieRoll7)&&(dealer.dieRoll7==dealer.dieRoll9))
			{
			System.out.println("You have Four of a Kind!");
			}
		else if((dieRoll22==dieRoll44)&&(dieRoll44==dealer.dieRoll2)||(dieRoll22==dieRoll44)&&(dieRoll44==dealer.dieRoll3)||(dieRoll22==dieRoll44)&&(dieRoll44==dealer.dieRoll5)||(dieRoll22==dieRoll44)&&(dieRoll44==dealer.dieRoll7)||(dieRoll22==dieRoll44)&&(dieRoll44==dealer.dieRoll9)||(dieRoll44==dealer.dieRoll2)&&(dealer.dieRoll2==dealer.dieRoll3)||(dieRoll44==dealer.dieRoll3)&&(dealer.dieRoll3==dealer.dieRoll5)||(dieRoll44==dealer.dieRoll7)&&(dealer.dieRoll7==dealer.dieRoll9)||(dealer.dieRoll2==dealer.dieRoll3)&&(dealer.dieRoll3==dealer.dieRoll5)||(dealer.dieRoll2==dealer.dieRoll5)&&(dealer.dieRoll5==dealer.dieRoll7)||(dealer.dieRoll2==dealer.dieRoll7)&&(dealer.dieRoll7==dealer.dieRoll9)||(dealer.dieRoll2==dealer.dieRoll5)&&(dealer.dieRoll5==dealer.dieRoll9)||(dealer.dieRoll3==dealer.dieRoll5)&&(dealer.dieRoll5==dealer.dieRoll7)||(dealer.dieRoll3==dealer.dieRoll7)&&(dealer.dieRoll7==dealer.dieRoll9)||(dealer.dieRoll5==dealer.dieRoll7)&&(dealer.dieRoll7==dealer.dieRoll9)&&(dieRoll22==dieRoll44)||(dieRoll22==dealer.dieRoll2)||(dieRoll22==dealer.dieRoll3)||(dieRoll22==dealer.dieRoll5)||(dieRoll22==dealer.dieRoll7)||(dieRoll22==dealer.dieRoll8)||(dieRoll44==dealer.dieRoll2)||(dieRoll44==dealer.dieRoll3)||(dieRoll44==dealer.dieRoll5)||(dieRoll44==dealer.dieRoll7)||(dieRoll44==dealer.dieRoll9)||(dealer.dieRoll2==dealer.dieRoll3)||(dealer.dieRoll2==dealer.dieRoll5)||(dealer.dieRoll2==dealer.dieRoll7)||(dealer.dieRoll2==dealer.dieRoll9)||(dealer.dieRoll3==dealer.dieRoll5)||(dealer.dieRoll3==dealer.dieRoll7)||(dealer.dieRoll3==dealer.dieRoll8)||(dealer.dieRoll5==dealer.dieRoll7)||(dealer.dieRoll5==dealer.dieRoll9)||(dealer.dieRoll7==dealer.dieRoll8))
			{
			System.out.println("You got a Full House!");
			}
		else if ((dieRoll22==dieRoll44)&&(dieRoll44==dealer.dieRoll2)||(dieRoll22==dieRoll44)&&(dieRoll44==dealer.dieRoll3)||(dieRoll22==dieRoll44)&&(dieRoll44==dealer.dieRoll5)||(dieRoll22==dieRoll44)&&(dieRoll44==dealer.dieRoll7)||(dieRoll22==dieRoll44)&&(dieRoll44==dealer.dieRoll9)||(dieRoll44==dealer.dieRoll2)&&(dealer.dieRoll2==dealer.dieRoll3)||(dieRoll44==dealer.dieRoll3)&&(dealer.dieRoll3==dealer.dieRoll5)||(dieRoll44==dealer.dieRoll7)&&(dealer.dieRoll7==dealer.dieRoll9)||(dealer.dieRoll2==dealer.dieRoll3)&&(dealer.dieRoll3==dealer.dieRoll5)||(dealer.dieRoll2==dealer.dieRoll5)&&(dealer.dieRoll5==dealer.dieRoll7)||(dealer.dieRoll2==dealer.dieRoll7)&&(dealer.dieRoll7==dealer.dieRoll9)||(dealer.dieRoll2==dealer.dieRoll5)&&(dealer.dieRoll5==dealer.dieRoll9)||(dealer.dieRoll3==dealer.dieRoll5)&&(dealer.dieRoll5==dealer.dieRoll7)||(dealer.dieRoll3==dealer.dieRoll7)&&(dealer.dieRoll7==dealer.dieRoll9)||(dealer.dieRoll5==dealer.dieRoll7)&&(dealer.dieRoll7==dealer.dieRoll9))
				{
				System.out.println("You have Three of a Kind!");
				}
		else if ((dieRoll22==dieRoll44)||(dieRoll22==dealer.dieRoll2)||(dieRoll22==dealer.dieRoll3)||(dieRoll22==dealer.dieRoll5)||(dieRoll22==dealer.dieRoll7)||(dieRoll22==dealer.dieRoll8)||(dieRoll44==dealer.dieRoll2)||(dieRoll44==dealer.dieRoll3)||(dieRoll44==dealer.dieRoll5)||(dieRoll44==dealer.dieRoll7)||(dieRoll44==dealer.dieRoll9)||(dealer.dieRoll2==dealer.dieRoll3)||(dealer.dieRoll2==dealer.dieRoll5)||(dealer.dieRoll2==dealer.dieRoll7)||(dealer.dieRoll2==dealer.dieRoll9)||(dealer.dieRoll3==dealer.dieRoll5)||(dealer.dieRoll3==dealer.dieRoll7)||(dealer.dieRoll3==dealer.dieRoll8)||(dealer.dieRoll5==dealer.dieRoll7)||(dealer.dieRoll5==dealer.dieRoll9)||(dealer.dieRoll7==dealer.dieRoll8))
				{
				System.out.println("You have a Pair!");
				}
		else
		{
		System.out.println("You have a horrible hand that is worth absolutely nothing!");
		}
	System.out.println("Congratulations you won the game and $" +betting.pot3+"!");
	}
}






