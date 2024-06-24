package sec02.exam01;

public class SignOperatorExample {

	public static void main(String[] args) {
		
		// 단항 연산자: 피연산자가 단 하나뿐인 연산자 (부호 연산자, 증감 연산자, 논리 부정 연산자)
		// 부호 연산자(+, -): boolean, char 타입을 제외한 나머지 기본 타입에 사용가능하며 양수 음수를 표현
		// +는 부호 유지, -는 부호 변경, 부호 연산자의 결과는 int 타입
		
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);
		
		byte b = 100;
		// byte result3 = -b; 컴파일 에러
		int result3 = -b;
		System.out.println("result3 = " + result3);

	}

}
