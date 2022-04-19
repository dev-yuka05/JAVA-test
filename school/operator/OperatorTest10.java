package operator;

public class OperatorTest02 {

	public static void main(String[] args) {
		// 조건연산자 (삼항연산자)
		int score = 95;
		
		// 1번
		char grade = (score > 90) ? 'A' : 'B';
		
		// 2번
		if(score > 90) {
			grade = 'A';
		}else {
			grade = 'B';
		}
		
		// 1번 2번 그게 그거임
		System.out.println(grade);
		

	}

}
