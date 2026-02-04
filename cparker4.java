import java.util.*;

public class cparker4
{
	public static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args)
	{
		String menuPrompt = "What's your favorite fruit? Choose a number. ";
		String choice1 = "\n1.Apples";
		String choice2 = "\n2.Bananas";
		String choice3 = "\n3. Oranges";
		String choice4 = "\n4. Grapes";

		String combinedStr = menuPrompt + choice1 + choice2 + choice3 + choice4;

		System.out.println(combinedStr);
		int userChoice = keyboard.nextInt();

		switch(userChoice)
		{
			case 1:
				System.out.print("You chose Apples!");
				break;
			case 2:
				System.out.print("You chose Bananas!");
				break;
			case 3:
				System.out.print("You chose Oranges!");
				break;
			case 4:
				System.out.print("You chose Grapes!");
				break;
		}
	}
}
