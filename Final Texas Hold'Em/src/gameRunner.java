import java.util.Scanner;
public class gameRunner
{
	public static Scanner userInput;
	public static void main(String[]args)
	{
		private greetPlayer()
		userInput=new Scanner(System.in);
		System.out.println("Lets play a game of Tic Tac Toe!");
		System.out.println("What is your name?");
		String name=userInput.nextLine();
		String [] randomCompliment={"Looking good today","You are so smart","I have a feeling you are going to win this game","Your outfit looks very nice, and super original","You are so much smarter than the cumputer you are definetly going to win"};
		int dieRoll1=(int)(Math.random()*randomCompliment.length);
		System.out.println("Hi there " + name + "! " + randomCompliment[dieRoll1] + "!");
		System.out.println("Are you ready to play a game of Texas Hold'Em?");
		System.out.println("(1) Yes");
		System.out.println("(2) No");
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
		
	}
}