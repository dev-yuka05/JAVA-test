
public class ForExample04 {

	public static void main(String[] args) {
		// �ݺ������� ��ø for��

		for(int i = 2; i <= 9; i++) {
			System.out.printf("\n������ %d��\n",i);
			for(int m = 1; m <= 9; m++) {
				System.out.printf("%d * %d = %d\n",m,i,m*i);
			}
		}
		
	}

}