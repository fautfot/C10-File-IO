
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//Author: Patrick Ng and Michale Huss

public class ScoreTrakker {
	private ArrayList<Student> students = new ArrayList<Student>();
	
	public void loadDataFromFile(String s) throws FileNotFoundException { //reads data from and stores into arrayList	
	FileReader reader = new FileReader(s);
	Scanner in = new Scanner(reader);
	while (in.hasNextLine()) {
	String studentName = in.nextLine();
	int studentScore = in.nextInt();
	in.nextLine();                      //consume newline left-over
	Student student = new Student(studentName, studentScore);
	students.add(student);
		}
	
	}
	
	public void printInOrder() { //sort and print arrayList using iterated loop
		Collections.sort(students);
		
		for (Student s: students) {
			s.toString();
			System.out.println();
		}
	}
	
	
	public void processFiles() { //call loadDataFromFile and printInOrder
		loadDataFromFile("scores.txt");
		//printInOrder
	}
	
	
	public static void main(String[] args)  {
		ScoreTrakker trakker = new ScoreTrakker();
		trakker.processFiles();
		
		
	}
}

