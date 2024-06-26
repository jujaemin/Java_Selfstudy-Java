package sec01.exam01;

public class IfExample {

	public static void main(String[] args) {
		
		// if문은 조건식이 true 이면 실행, false 이면 실행하지 않음
		
		int score = 93;
		
		if (score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A 입니다.");
		}
		
		if (score < 90)
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B 입니다."); // if문과는 상관없는 실행문
	}

}
