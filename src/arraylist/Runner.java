package arraylist;

import javax.swing.JOptionPane;

public class Runner {

	public static void main(String[] args) {
		
		boolean StopLoop = false;
		String msg= "";
		String ConfirmStart = "Yes";
		
		StudentFirstNames a2 = new StudentFirstNames();
		
		
		while(StopLoop == false) {
		Object[] possibilities = {"Show", "Add", "Find", "Remove", "Replace", "Exit"};
		String showFirst = "Show Names";
		String selection = (String) JOptionPane.showInputDialog(null, "Please make your Selection", 
				"Start Here",
				JOptionPane.PLAIN_MESSAGE,
				null,
				possibilities,
				showFirst);
		if (selection == null) {
			selection = "Cancelled";
			JOptionPane.showMessageDialog(null, "You have selected: " + selection);
		}//end of if
		
		switch (selection) {
		case "Show":
			a2.PrintNames();
			a2.PrintSize();
			break;
		case "Add":
			a2.addName();
			a2.PrintNames();
			break;
		case "Find":
			a2.findName();
			break;
		case "Remove":
			a2.deleteName();
			a2.PrintNames();
			break;
		case "Replace":
			a2.replaceName();
			a2.PrintNames();
			break;
		case "Exit":
			JOptionPane.showMessageDialog(null, "Sorry for wasting your time");
			System.exit(0);
			break;
		default:
			JOptionPane.showMessageDialog(null, "I didn't understand that");
			break;
		}
		msg = "Do you want to do this again? (Y/n)";
		ConfirmStart = JOptionPane.showInputDialog(msg);
		if (ConfirmStart.equalsIgnoreCase("n") || ConfirmStart.equalsIgnoreCase("no")) {
			StopLoop = true;
			JOptionPane.showMessageDialog(null, "Thank you for using my program");
		}//end of if
		else if (ConfirmStart.equalsIgnoreCase("y") || ConfirmStart.equalsIgnoreCase("yes")) {
			StopLoop = false;
		}
		else {
			JOptionPane.showMessageDialog(null, "I'm sorry but I don't understand that.");
		}
		}//end of while

	}
	/*
	 * ask for name and add to arraylist
	 * after each name show size and contents
	 */

}
