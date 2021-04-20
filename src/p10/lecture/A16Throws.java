package p10.lecture;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class A16Throws {
public static void main(String[] args) throws ClassNotFoundException, FileNotFoundException {
	method1();
}

public static void method1() throws ClassNotFoundException, FileNotFoundException  {
	// TODO Auto-generated method stub
Class.forName("java.lang.Number");
FileInputStream fis = new FileInputStream("");

}
}
