package exception;

public class MyClassTest {

	public static void main(String[] args) {
		MyClass mc = new MyClass();
		
		try {
			mc.dangerMethod();
		} catch (MyException e) {
			System.out.println("error : "+e);
		}

	}

}
