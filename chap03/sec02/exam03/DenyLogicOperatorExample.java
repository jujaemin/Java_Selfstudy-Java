package sec02.exam03;

public class DenyLogicOperatorExample {

	public static void main(String[] args) {
		
		// 논리 부정 연산자(!): boolean 타입에만 사용할 수 있으며 true를 false로 false를 true로 변경
		
		boolean play = true;
		System.out.println(play);
		
		play = !play;
		System.out.println(play);
		
		play = !play;
		System.out.println(play);

	}

}
