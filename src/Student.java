//Author: Patrick Ng and Michael Huss
public class Student implements Comparable<Student> {

	private String name;
	private int score;
	
	public Student(String n, int s) {
	this.name = n;
	this.score = s;
	}
	
	
	@Override
	public int compareTo(Student o) { //sorting of students will be based on score
		if (score < o.score) {
			return -1;
		}
		else if (score > o.score) {
			return 1;
		}
		return 0;
	}


	@Override
	public String toString() {
		return  name + " " + score;
	}

	
	
}
