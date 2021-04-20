package p10.lecture;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class A17ThrowsPolymorphism {
public static void main(String[] args) throws Exception {
	method1();
}

private static void method1() throws ClassNotFoundException, FileNotFoundException {
	// TODO Auto-generated method stub
	Class.forName("java.lang.String");
	FileInputStream file = new FileInputStream("");
	
}

}
