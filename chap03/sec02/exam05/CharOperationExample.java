package sec02.exam05;

public class CharOperationExample {

	public static void main(String[] args) {
		
		// int 타입으로 변환되므로 char 타입 연산시 결과는 int 타입이 됨
		
		char c1 = 'A'+1;
		char c2 = 'A';
		int c3 = c2 + 1;
		
		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);
		System.out.println("c3 = " + c3);

	}

}
