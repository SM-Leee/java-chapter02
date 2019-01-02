package exception;

public class ExceptionTest {

	public static void main(String[] args) {
		try {
			int a =0;
			System.out.println("some codes....");
			int k = 1000 / a;
			System.out.println("more codes....");
			System.out.println("more codes....2");
		} catch(ArithmeticException ex) {
			// 1. 로그 남기기....(파일)
			System.out.println("error : "+ex);
			
			// 2. 사과
			System.out.println("죄송합니다. 예기치...");
			
			//3. 정상 종료
			return;
			
			//4. 이거라도 안되면
			//ex.printStackTrace();
		} finally {
			//5. finally안에서는 자원정리를 한다.
			System.out.println("자원정리");
		}

	}

}
