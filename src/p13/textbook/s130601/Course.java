package p13.textbook.s130601;

public class Course<T> {
	private String name;
	private T[] students;
	
	public Course(String name, int capacity) {
		this.name = name;
		students = (T[]) (new Object[capacity]);
	}
	
	public String getName() {
		return name;
	}
	
	public T[] getStudents() {
		return students;
	}
	
	public void add(T t) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				students[i] = t;
				break;
			}
		}
	}
}


class Person {
	private String name;

	public Person(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
}

class Worker extends Person {

	public Worker(String name) {
		super(name);
	}
}

class Student extends Person {
	public Student(String name) {
		super(name);
	}
}

class HighStudent extends Student {
	public HighStudent(String name) {
		super(name);
	}
}
