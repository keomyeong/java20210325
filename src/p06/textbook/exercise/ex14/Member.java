package p06.textbook.exercise.ex14;

public class Member {
	public Member(String password, int age) {
		this.password = password;
		this.age = age;
	}

	String name;
	String id;
	String password;
	int age;
	
	Member(String name, String id){
		this.name = name;
		this.id = id;
	}
}
