
public class SwitchTest02 {

	public static void main(String[] args) {
		// 8 ~ 13������ ������ ����
		int time = (int)(Math.random() * 5) + 8;
		
		switch(time) {
			case 8:
				System.out.println("����� �մϴ�");
			case 9:
				System.out.println("ȸ�Ǹ� �մϴ�");
			case 10:
				System.out.println("������ ���ϴ�");
			case 11:
				System.out.println("�ܱ��� �����ϴ�");
			case 12:
				System.out.println("������ �Խ��ϴ�");
		}
		
	}

}
