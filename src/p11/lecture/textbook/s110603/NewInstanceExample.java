package p11.lecture.textbook.s110603;

public class NewInstanceExample {
	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("p11.lecture.textbook.s110603.SendAction");
			// Class clazz = Class.forName("p11.lecture.textbook.s110603.ReceiveAction");
			Action action = (Action) clazz.newInstance();
			action.execute();

		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace(); // TODO: handle exception
		} catch (IllegalAccessException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
}
