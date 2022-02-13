/***************************************************

  Program name:        assign1
  Program description: Rock paper scissors

  Class: CS101 Sec. 005
  Name:  Kristen Jady Chan
  Date:  October 10, 2020
 
****************************************************/

import java.util.Scanner;

public class rps {

	//Main method
	public static void main(String[] args)  {
		System.out.println (" ");
		System.out.println ("=========================================");
		System.out.println ("Welcome to the Rock-Paper-Scissors game! ");
		System.out.println ("=========================================");
		System.out.println (" ");

		//Prompt player choice
		String choice; 

		Scanner scanner = new Scanner(System.in);
		System.out.println("Select your element: ");
		System.out.println("     R/r - rock");
		System.out.println("     P/p - paper");
		System.out.println("     S/s - scissors");
		choice = scanner.next().toUpperCase();
		// System.out.println(choice);

		//Test validity of player's input 
		while (!testvalid(choice))  {
			System.out.println("Invalid selection. ");
			System.out.println("Select your element: ");
			System.out.println("     R/r - rock");
			System.out.println("     P/p - paper");
			System.out.println("     S/s - scissors");
			choice = scanner.next().toUpperCase();
		}

		//Display player choice
		System.out.println(" ");
		ChoiceArt(choice);
		System.out.println("Player");
		System.out.println(" ");

		//Generate computer choice
		String computer = CompChoice();
		System.out.println(computer);
		ChoiceArt(computer);
		System.out.println("Computer");
		System.out.println(" ");

		GameResult(choice, computer);

	}

	//Method testing validity
	public static boolean testvalid(String choice)  {
		return (choice.equals("R") || choice.equals("P") || choice.equals("S"));
	}

	//Method to random generate computer choice
	public static String CompChoice() {
		String result;
		int x = (int)(Math.random() * 3);
		if (x == 0)
			result = "R";
		else if (x == 1)
			result = "P";
		else
			result = "S";
		return result;
	}

	//Method to determine winner
	public static void GameResult(String player, String computer)  {
		 if (player.equals(computer)) {
		 	System.out.println("No winner! It is a tie!");
		 }
		 else if (player.equals("R") && computer.equals("P"))  {
		 	System.out.println("Computer won! (paper beats rock)");
		 }
		 else if (player.equals("R") && computer.equals("S"))  {
		 	System.out.println("Player won! (rock beats scissors)");
		 }
		 else if (player.equals("P") && computer.equals("R"))  {
		 	System.out.println("Player won! (paper beats rock)");
		 }
		 else if (player.equals("P") && computer.equals("S"))  {
		 	System.out.println("Computer won! (scissors beats paper)");
		 }
		 else if (player.equals("S") && computer.equals("R"))  {
		 	System.out.println("Computer won! (rock beats scissors)");
		 }
		 else if (player.equals("S") && computer.equals("P"))  {
		 	System.out.println("Player won! (scissors beats rock)");
		 }
	}

	//Method display ASCII art
	public static void ChoiceArt(String selection)  {
		if (selection.equals("R")) {
			System.out.println(" __.--.--._");
			System.out.println("/  | _|  | `|");
			System.out.println("|  |` |  |  |");
			System.out.println("| /’--:--:__/");
			System.out.println("|/  /      |");
			System.out.println("(  ’ \\     |");
			System.out.println(" \\    `.  /");
			System.out.println("  |      |");
			System.out.println("  |      |");
		}
		else if (selection.equals("P"))  {
			System.out.println("    --.--.");
			System.out.println("   |  |  |");
			System.out.println(".\"\"|  |  |_");
			System.out.println("|  |  |  | `|");
			System.out.println("|  | _|  |  |");
			System.out.println("|  |` )  |  |");
			System.out.println("| /’  /     /");
			System.out.println("|/   /      |");
			System.out.println("(   ’ \\     |");
			System.out.println("\\      `.  /");
			System.out.println(" |        |");
			System.out.println(" |        |");
		}
		else {
			System.out.println(".\"\".   .\"\",");
			System.out.println("|  |  /  /");
			System.out.println("|  | /  /");
			System.out.println("|  |/ .--._");
			System.out.println("|    _|  | `|");
			System.out.println("|  /` )  |  |");
			System.out.println("| /  /’--:__/");
			System.out.println("|/  /      |");
			System.out.println("(  ’ \\     |");
			System.out.println(" \\    `.  /");
			System.out.println("  |      |");
			System.out.println("  |      |");
		}

	} 

}






