package exception;

import java.io.IOException;

public class MyClassTest {

	public static void main(String[] args) {
		MyClass mc = new MyClass();
		
		try {
			mc.dangerMethod();
		} catch (IOException e) {
			System.out.println("error : "+e);
		}

	}

}
