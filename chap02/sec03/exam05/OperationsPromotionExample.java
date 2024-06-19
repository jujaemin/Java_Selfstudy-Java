package sec03.exam05;

public class OperationsPromotionExample {

	public static void main(String[] args) {
		
		// 두 피연산자 중 하나가 double 타입 변수라면 다른 피연산자도 double 타입 변수로 변환되어 연산을 수행
		
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		// byte byteValue3 = byteValue1 + byteValue2; 컴파일 에러
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1);
		
		char charValue1 = 'A';
		char charValue2 = 1;
		// char charValue3 = charValue1 + charValue2; 컴파일 에러
		int intValue2 = charValue1 + charValue2;
		System.out.println("유니코드 = " + intValue2);
		System.out.println("출력문자 = " + (char)intValue2);
		
		int intValue3 = 10;
		int intValue4 = intValue3/4;
		System.out.println(intValue4);
		
		int intValue5 = 10;
		// int intValue6 = 10 / 4.0; 컴파일 에러
		double doubleValue = intValue5 / 4.0;
		System.out.println(doubleValue);
		
		int x = 1;
		int y = 2;
		double result = (double) x / y;
		// double result = x / y; 수행시 x / y 의 연산 결과는 정수이기 때문에 0.5가 아닌 0이 되고
		// 0을 double 타입 변수로 저장해 0.0을 얻게 됨
		System.out.println(result);

	}

}
