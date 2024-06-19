package sec03.exam04;

public class LongOperationExample {

	public static void main(String[] args) {
		
		// 모든 변수가 int 타입으로 바뀌는 것이 아니라 허용 범위가 더 큰 타입으로 변환되어 연산이 수행됨
		byte value1 = 10;
		int value2 = 100;
		long value3 = 1000L;
		long result = value1 + value2 + value3;
		System.out.println(result);

	}

}
