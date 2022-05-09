
public class ForExample04 {

	public static void main(String[] args) {
		// 반복문에서 중첩 for문

		for(int i = 2; i <= 9; i++) {
			System.out.printf("\n구구단 %d단\n",i);
			for(int m = 1; m <= 9; m++) {
				System.out.printf("%d * %d = %d\n",m,i,m*i);
			}
		}
		
	}

}