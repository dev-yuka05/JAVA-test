
public class SwitchTest02 {

	public static void main(String[] args) {
		// 8 ~ 13사이의 임의의 정수
		int time = (int)(Math.random() * 5) + 8;
		
		switch(time) {
			case 8:
				System.out.println("출근을 합니다");
			case 9:
				System.out.println("회의를 합니다");
			case 10:
				System.out.println("업무를 봅니다");
			case 11:
				System.out.println("외근을 나갑니다");
			case 12:
				System.out.println("점심을 먹습니다");
		}
		
	}

}
