
public class BreakeTest {

	public static void main(String[] args) {
		
		// break�� - ���� ����
		while(true) {
			int num = (int)(Math.random()*6)+1;
			System.out.println("�ֻ����� ����"+num+"�Դϴ�.");
			if(num == 6)
				break;
		}

	}

}