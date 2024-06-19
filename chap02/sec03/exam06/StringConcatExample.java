package sec03.exam06;

public class StringConcatExample {

	public static void main(String[] args) {
		
		// 피연산자가 모두 숫자일 경우, +는 덧셈 연산을 수행하지만 하나가 문자열일 경우, 나머지 하나도 문자열로 자동 변환되어 문자열 결합 연산을 수행
		
		int value = 10 + 2 + 8;
		System.out.println(value);
		
		String str1 = 10 + 2 + "8";
		System.out.println("str1: " + str1);
		
		String str2 = 10 + "2" + 8;
		System.out.println("str2: " + str2);
		
		String str3 = "10" + 2 + 8;
		System.out.println("str4: " + str3);
		
		String str4 = "10" + (2 + 8);
		System.out.println("str4: " + str4);

	}

}
