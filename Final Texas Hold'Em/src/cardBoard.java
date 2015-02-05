import java.util.Scanner;
public class cardBoard
	{
		public static Object[][] cardBoard;
		
		public static void displayBoard()
			{
			int cardBoard[][]=new int [1][5];
			String cardBoard2[][]=new String [1][5];
			System.out.println("------------------------------------");
			System.out.println("|     " +cardBoard[0][0]+" |     "+cardBoard[0][1]+"|   "+cardBoard[0][2]+"  |   " +cardBoard[0][3]+"  |  "+cardBoard[0][4]+"  | ");
			System.out.println("|     "        +         "  |     "         +       " |     "    +            " |     "     +            " |    "  +              " | ");
			System.out.println("| " +cardBoard2[0][0]+"  | "+cardBoard2[0][1]+" | "+cardBoard2[0][2]+" | "+ cardBoard2[0][3]+ " |"+cardBoard2[0][4]+" | ");
			System.out.println("------------------------------------");
			
			}
	}
