package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class StudentFirstNames {

	private ArrayList <String> a2Students = new ArrayList <String>();
	Scanner keyboard = new Scanner(System.in);
	private int nameNum = 4;
	private String msg = "";
	private int nameSelect = -1;
	
	public StudentFirstNames() {
		a2Students.add("Zachary");
		a2Students.add("Kyle");
		a2Students.add("Michael");
		a2Students.add("Mitchell");
		
	}
	public void PrintSize() {
		JOptionPane.showMessageDialog(null, "Number of student names is " + a2Students.size());
	}
	
	public ArrayList<String> getA2Students() {
		return a2Students;
	}
	public void setA2Students(ArrayList<String> a2Students) {
		this.a2Students = a2Students;
	}
	public void addName() {
		String fnameEntry = JOptionPane.showInputDialog("What is the first name of your student?");
		for (int i = 0; i < nameNum; i++) {
			if (fnameEntry.equals(a2Students.get(i))) {
				fnameEntry = JOptionPane.showInputDialog("Please reenter your name with a last int.");
			}
		}
		a2Students.add(fnameEntry);
		nameNum++;
	}
	public void findName() {
		msg = "What name would you like to find";
		String name = JOptionPane.showInputDialog(msg);
		/*
		for (int i = 0; i < nameNum; i++) {
			if (name.equals(a2Students.get(i))) {
				JOptionPane.showMessageDialog(null, "Your student " + name + " exists");
			}
		}
		*/
		if (a2Students.indexOf(name) < 0) {
			msg = " doesn't exist";
			JOptionPane.showMessageDialog(null, name + msg);
		}
		else {
			JOptionPane.showMessageDialog(null, "Your student " + name + " exists");
		}
	}
	public void deleteName() {
		String deleteName = JOptionPane.showInputDialog("What name would you like to delete?");
		if (a2Students.indexOf(deleteName) < 0) {
			deleteName = JOptionPane.showInputDialog("Your name doesn't exist. Please enter another name.");
		}
		a2Students.remove(deleteName);
		nameNum--;
	}
	public void replaceName() {
		String prevName = JOptionPane.showInputDialog("What name would you like to replace?");
		String replName = JOptionPane.showInputDialog("What name would you like to replace with?");
		if (a2Students.indexOf(prevName) < 0) {
			prevName = JOptionPane.showInputDialog("Your previous name doesn't exist. Please enter a new one");
		}
		a2Students.remove(prevName);
		a2Students.add(replName);
		
	}
	public void PrintNames() {
		//System.out.println("Currently the array list has following elemtents: "+ a2Students);
		msg = "";
		for (int i = 0; i < nameNum; i++) {
			msg = msg + "\nThis student's name is " + a2Students.get(i);
		}
		JOptionPane.showMessageDialog(null, msg);
	}

}
