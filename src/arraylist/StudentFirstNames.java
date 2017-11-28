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
	public void PrintNames() {
		//System.out.println("Currently the array list has following elemtents: "+ a2Students);
		for (int i = 0; i < nameNum; i++) {
			System.out.println("This student's name is " + a2Students.get(i));
		}
	}
	public void PrintSize() {
		System.out.println("Number of student names is " + a2Students.size());
	}
	
	public ArrayList<String> getA2Students() {
		return a2Students;
	}
	public void setA2Students(ArrayList<String> a2Students) {
		this.a2Students = a2Students;
	}
	public void addName() {
		System.out.println("What is the first name of your student");
		String fnameEntry = keyboard.nextLine();
		for (int i = 0; i < nameNum; i++) {
			if (fnameEntry.equals(a2Students.get(i))) {
				System.out.println("Please reenter your name with a last int.");
				fnameEntry = keyboard.nextLine();
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
		System.out.println("What name would you like to delete");
		String deleteName = keyboard.nextLine();
		if (a2Students.indexOf(deleteName) < 0) {
			JOptionPane.showMessageDialog(null, "Your name doesn't exist. Please enter another name.");
			deleteName = keyboard.nextLine();
		}
		a2Students.remove(deleteName);
		PrintNames();
		nameNum--;
	}
	public void replaceName() {
		System.out.println("What name would you like to replace?");
		String prevName = keyboard.nextLine();
		System.out.println("What name would you like to replace with?");
		String replName = keyboard.nextLine();
		if (a2Students.indexOf(prevName) < 0) {
			System.out.println("Your previous name doesn't exist. Please enter a new one");
			prevName = keyboard.nextLine();
		}
		a2Students.remove(prevName);
		a2Students.add(replName);
		PrintNames();
		
	}

}
