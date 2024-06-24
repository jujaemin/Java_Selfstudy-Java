package sec02.exam04;

public class ArithmeticOperatorExample {

	public static void main(String[] args) {
		// 이항 연산자: 피연산자가 2개인 연산자(산수 연산자, 문자열 결합 연산자, 비교 연산자, 논리 연산자, 대입 연산자)
		// 산술 연산자(+,-,*,/,%): boolean 타입을 제외한 모든 기본 타입에 사용할 수 있으며, 사칙연산 및 나머지를 구하는데 사용
		// 피연산자들이 byte, short, char 타입일 경우, 모두 int 타입으로 변환 후 연산을 수행
		// 피연산자들이 모두 정수 타입이고 long 타입이 포함되어 있을 경우, 모두 long 타입으로 변환 후 연산 수행
		// 피연산자들 중 실수 타입이 있을 경우, 허용 범위가 큰 실수 타입으로 변환후 연산을 수행
		
		int v1 = 5;
		int v2 = 2;
		
		int result1 = v1 + v2;
		System.out.println("result1 = " + result1);
		
		int result2 = v1 - v2;
		System.out.println("result2 = " + result2);
		
		int result3 = v1 * v2;
		System.out.println("result3 = " + result3);
		
		int result4 = v1 / v2;
		System.out.println("result4 = " + result4);
		
		int result5 = v1 % v2;
		System.out.println("result5 = " + result5);
		
		double result6 = (double) v1 / v2;
		System.out.println("result6 = " + result6);

	}

}
