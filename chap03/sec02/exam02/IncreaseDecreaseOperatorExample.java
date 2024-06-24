package sec02.exam02;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		
		// 증감 연산자(++, --): boolean 타입을 제외한 모든 기본 타입에 사용가능하며 변수의 값을 1 증가시키거나 감소시킴
		// 변수의 앞,뒤 모두 사용가능하나 다른 연산자와 함께 사용된다면 위치에 따라 연산 순서가 달라짐
		
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("-----------");
		x++;
		++x;
		System.out.println("x = " + x);
		
		System.out.println("-----------");
		y--;
		--y;
		System.out.println("y = " + y);
		
		System.out.println("-----------");
		z = x++;
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		
		System.out.println("-----------");
		z = ++x;
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		
		System.out.println("-----------");
		z = ++x + y++;
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		System.out.println("y = " + y);

	}

}
