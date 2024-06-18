package sec03.exam02;

public class CastingExample {

	public static void main(String[] args) {
		
		// 캐스팅 연산자 ()를 이용해 큰 허용 범위를 가지는 타입에서
		// 작은 허용 범위를 가지는 타입으로 강제로 변환할 수 있다.
		
		int intValue = 44032;
		char charValue = (char) intValue;
		System.out.println(charValue);
		
		long longValue = 500;
		intValue = (int) longValue;
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue;
		System.out.println(intValue); // 소수점 아래는 버려진다.

	}

}
