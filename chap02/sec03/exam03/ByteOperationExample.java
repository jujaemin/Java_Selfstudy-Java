package sec03.exam03;

public class ByteOperationExample {

	public static void main(String[] args) {
		
		// 정수 타입 변수가 산술 연산식에서 피연산자로 사용되면 int 타입보다 작은
		// byte, short 타입의 변수는 int 타입의 변수로 자동 변환되여 연산 수행
		
		byte result1 = 10 + 20;
		System.out.println(result1);
		
		byte x = 10;
		byte y = 20;
		int result2 = x + y;
		// byte result3 = x + y; 컴파일 에러
		System.out.println(result2);
		
		// 모든 변수가 int 타입으로 바뀌는 것이 아니라 허용 범위가 더 큰 타입으로 변환되어 연산이 수행됨
		
	}

}
