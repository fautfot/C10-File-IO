
public class Student implements Comparable<Student> {

	private String name;
	private int score;
	
	public Student() {
	this.name = "";
	this.score = 0;
	}
	
	
	@Override
	public int compareTo(Student o) {
		return 0;
	}

	
	
}
