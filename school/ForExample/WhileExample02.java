
public class WhileExample02 {

	public static void main(String[] args) {
		// �ݺ��� do~while�� (������ �ѹ��� ����)
		// 1���� 1000���� ��
		int i = 1;
		int sum = 0;
		do {
			sum += i;
			i++;
		}while(i<=1000);
			System.out.printf("1~%d�� �� : %d", i-1, sum);
		
	}

}
