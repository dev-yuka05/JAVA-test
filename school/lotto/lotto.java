package arrayex;

public class lotto {

	public static void main(String[] args) {
		
		// 로또번호 생성기
		int[] lotto = new int[45];
		for(int i = 0; i<lotto.length;i++) {
			lotto[i] = i+1;
		}
		
		// 로또번호 섞기 swap 알고리즘
		int temp, j;
		for(int i = 0; i<100;i++) {
			j = (int)(Math.random()*45);	
			temp = lotto[0];
			lotto[0] = lotto[j];
			lotto[j] = temp;
				
		}
		for(int i = 0; i<6;i++) {
			System.out.println(lotto[i]);
		}

	}

}