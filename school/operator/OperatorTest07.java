package operator;

public class OperatorTest07 {

	public static void main(String[] args) {
		// ������ & && | ||
		int charCode = 'A';
		
		if ((charCode >= 65) & (charCode <= 90)) {
			System.out.println("�빮����");
		}else if((charCode >= 65) && (charCode <= 122)) {
			System.out.println("�ҹ�����");
		};
		
		int value = 6;
		
		if((value % 2 == 0) | (value % 3 == 0)) {
			System.out.println("2�Ǵ� 3�� ����Դϴ�");
		}
		
		if((value % 2 == 0) || (value % 3 == 0)) {
			System.out.println("2�Ǵ� 3�� ����Դϴ�");
		}
		
	}

}
