package sec04.exam05;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) throws Exception{
		
		// System.in.read() 는 키코드를 하나씪 읽기 때문에 2개 이상의 키가 조합된 한글을 읽을 수 없음
		// 이 때, scanner 를 이용
		
		Scanner scanner = new Scanner(System.in);
		String inputData;
		
		while (true) {
			inputData = scanner.nextLine();
			System.out.println("입력된 문자열: \"" + inputData + "\"");
			if (inputData.equals("q")) {
				break;
			}
		}
		
		System.out.println("종료");

	}

}
