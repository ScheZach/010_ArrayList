package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentFirstNames {

	private ArrayList <String> a2Students = new ArrayList <String>();
	Scanner keyboard = new Scanner(System.in);
	private int nameNum = 4;
	
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
		a2Students.add(fnameEntry);
		nameNum++;
	}

}
