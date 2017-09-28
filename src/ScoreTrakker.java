
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//Author: Patrick Ng and Michale Huss

public class ScoreTrakker {
	private ArrayList<Student> students = new ArrayList<Student>();
	private String[] files = {"scores.txt", "badscore.txt", "nofile.txt"}; 
	
	
	
	public void loadDataFromFile(String s) throws FileNotFoundException { //reads data from and stores into arrayList	
	FileReader reader = new FileReader(s);
	Scanner in = new Scanner(reader);
	
	while (in.hasNextLine()) {
	String studentName = in.nextLine();
	String studentScore = in.nextLine();
	try {
	int numScore = Integer.parseInt(studentScore);
	Student student = new Student(studentName, numScore);
	students.add(student);
	
	} catch (NumberFormatException n){
		System.out.println("Incorrect format for " + studentName + " not a valid score: " + studentScore);
		System.out.println();
	}
	
		}
	
	}
	
	public void printInOrder() { //sort and print arrayList using iterated loop
		Collections.sort(students);
		if (students.size() > 0) {
		System.out.println("Student Score List");
		}
		for (Student s: students) {
			System.out.println(s.toString());
		}
		System.out.println();
		students.clear();     //clears arrayList of students for next file
	}
	
	
	public void processFiles() { //call loadDataFromFile and printInOrder
		for (String s: files) {
			try {
		loadDataFromFile(s);
			} catch (FileNotFoundException e) {
				System.out.println("Can't open file: " + s);
			}
		printInOrder();
		}
	}
	
	
	public static void main(String[] args) throws FileNotFoundException {
		ScoreTrakker trakker = new ScoreTrakker();
		trakker.processFiles();
		
	}
}

