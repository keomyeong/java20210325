package p15.textbook.exercise;

public class Student implements Comparable<Student> {
	public String id;
	public int score;

	public Student(String id, int score) {
		super();
		this.id = id;
		this.score = score;
	}


	@Override
	public int compareTo(Student o) {
		return this.score-o.score;
	}

}
