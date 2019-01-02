package exception;

import java.io.IOException;

public class MyClass {

	public void dangerMethod() throws MyException{
		System.out.println("normal state1");

		boolean isDanger = true;
		if(isDanger) {
			//예외상황발생
			throw new MyException("예외발생");
		}

		System.out.println("normal state2");
	}

}
