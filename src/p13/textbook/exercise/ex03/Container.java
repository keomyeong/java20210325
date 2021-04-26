package p13.textbook.exercise.ex03;

public class Container<T1, T2> {
	private T1 Key;
	private T2 Value;

	public T1 getKey() {
		return Key;
	}

	public void setKey(T1 key) {
		Key = key;
	}

	public T2 getValue() {
		return Value;
	}

	public void setValue(T2 value) {
		Value = value;
	}
	public void set(T1 key, T2 value) {
		Key = key;
		Value = value;
		
	}
}
