package sec03.exam01;

public class PromotionExample {

	public static void main(String[] args) {
		
		// 작은 허용 범위를 가지는 타입이 큰 허용 범위를 가지는 타입으로 저장될 떄
		// 자동으로 타입이 변환 된다.
		
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("intValue: " + intValue);
		
		char charValue = '가';
		intValue = charValue;
		System.out.println("가의 유니코드: " + intValue);
		
		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue: " + longValue);
		
		longValue = 100;
		float floatValue = longValue;
		System.out.println("floatValue: " + floatValue);
		
		floatValue = 100.5f;
		double doubleValue = floatValue;
		System.out.println("doubleValue: " + doubleValue);

	}

}