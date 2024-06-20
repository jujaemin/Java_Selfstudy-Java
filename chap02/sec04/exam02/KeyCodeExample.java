package sec04.exam02;

public class KeyCodeExample {

	public static void main(String[] args) throws Exception{
		
		// System.in.read() 를 통해 입력된 값의 키코드를 읽을 수 있음
		// System.in.read() 실행시 Enter 키가 입력도리 때까지 대기 상태가 됨
		
		int keyCode;
		
		keyCode = System.in.read();
		System.out.println("keyCode: " + keyCode);
		
		keyCode = System.in.read();
		System.out.println("keyCode: " + keyCode);
		
		keyCode = System.in.read();
		System.out.println("keyCode: " + keyCode);

	}

}
