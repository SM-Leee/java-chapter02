package exception;

import java.io.IOException;

public class MyClass {

	public void dangerMethod() throws IOException{
		System.out.println("normal state1");

		boolean isDanger = true;
		if(isDanger) {
			//예외상황발생
			throw new IOException("예외발생");
		}

		System.out.println("normal state2");
	}

}
