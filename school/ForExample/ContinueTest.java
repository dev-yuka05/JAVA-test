
public class ContinueTest {

	public static void main(String[] args) {
		// Continue 문 - 조건식으로 이동
		for(int i = 1; i <= 10; i++) {
			if(i%2 != 0) {
				continue;
			}
			System.out.println(i); // 짝수 출력하고 싶음
		}
		
	}

}
