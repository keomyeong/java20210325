package p15.lecture;

import java.util.TreeSet;

public class A17Comparator {
	public static void main (String[] args) {
		TreeSeteeSet<Dog> set = new TreeSet<>(new DogComparator());
		set.add(new Dog(99));
	}
}
class DogCompartor implements Comparator<Dog>{
	
}
class Dog{
	public int id;

	@Override
	public String toString() {
		return "Dog [id=" + id + "]";
	}

	public Dog(int id) {
		super();
		this.id = id;
	}
	
}