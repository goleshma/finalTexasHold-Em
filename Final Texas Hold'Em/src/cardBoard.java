import java.util.Scanner;
public class cardBoard
	{
		public static String cardBoard1[][]=new String [1][5];
		public static String cardBoard2[][]=new String [1][5];
		public static String firstCards[][]=new String[1][2];
		public static String firstCards2 [][]=new String [1][2];
		public static void displayBoard()
			{
			System.out.println(" -----   -----   -----   -----   -----");
			System.out.println("|   " +cardBoard1[0][0]+" | |    "+cardBoard1[0][1]+"| |  "+cardBoard1[0][2]+"  | |  " +cardBoard1[0][3]+"  | | "+cardBoard1[0][4]+"   | ");
			System.out.println("|   "        +         "  | |   "         +       "  | |    "    +            " | |    "     +            " | |   "  +              "  | ");
			System.out.println("|" +cardBoard2[0][0]+" | |"+cardBoard2[0][1]+" | |"+cardBoard2[0][2]+" | |"+ cardBoard2[0][3]+ " | |"+cardBoard2[0][4]+" | ");
			System.out.println(" -----   -----   -----   -----   -----");
			}
		public static void displayFirstCards()
			{
			System.out.println(" -----   -----");
			System.out.println("|" +firstCards[0][0]+"| | "+firstCards[0][1]+"|");
			System.out.println("|   "        +         "  | |   "         +       "  |");
			System.out.println("|" +firstCards2[0][0]+" | |"+firstCards2[0][1]+" |");
			System.out.println(" -----   -----");
			}
		public static void computerCards()
			{
			int computerCards[][]=new int [1][2];
			String computerCards2 [][]=new String [1][2];
			System.out.println(" -----   -----");
			System.out.println("|   " +computerCards[0][0]+" | |    "+computerCards[0][1]+"|");
			System.out.println("|   "        +         "  | |   "         +       "  |");
			System.out.println("|" +computerCards2[0][0]+" | |"+computerCards2[0][1]+" |");
			System.out.println(" -----   -----");
			}	
			
	}
