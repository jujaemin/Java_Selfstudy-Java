package sec01.exam03;

public class IfElseIfElseExample {

	public static void main(String[] args) {
		
		// else if 문을 통해 조건문을 여러 개 사용이 가능
		// 처음 fi문의 조건식이 flase 일 경우 다른 조건식의 결과에 따라 실행 블록을 선택 할 수 있음
		
		int score = 75;
		
		if (score >= 90) {
			System.out.println("점수가 90~100 입니다.");
			System.out.println("등급은 A 입니다.");
		} else if (score >= 80) {
			System.out.println("점수가 80~89 입니다.");
			System.out.println("등급은 B 입니다.");
		} else if (score >= 70) {
			System.out.println("점수가 70~79입니다.");
			System.out.println("등급은 C 입니다.");
		} else {
			System.out.println("점수가 70 미만입니다.");
			System.out.println("등급은 D 입니다.");
		}
	}

}
