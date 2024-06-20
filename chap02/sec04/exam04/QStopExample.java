package sec04.exam04;

public class QStopExample {

	public static void main(String[] args) throws Exception{
		
		// 앞선 예제에서 q 입력시 중단되도록 조건 추가
		int keyCode;
		
		while (true) {
			keyCode = System.in.read();
			System.out.println("keyCode: " + keyCode);
			if (keyCode == 113) {
				break;
			}
		}
		
		System.out.println("종료");

	}

}
