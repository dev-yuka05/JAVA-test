package iftest;

public class SwitchTest {

	public static void main(String[] args) {
		
		
		int diceNumber = (int)(Math.random() * 6) + 1;
		switch(diceNumber) {
		case 1:
			System.out.println("주사위 값은 1입니다");
			break;
		case 2:
			System.out.println("주사위 값은 2입니다");
			break;
		case 3:
			System.out.println("주사위 값은 3입니다");
			break;
		case 4:
			System.out.println("주사위 값은 4입니다");
			break;
		case 5:
			System.out.println("주사위 값은 5입니다");
			break;
		case 6:
			System.out.println("주사위 값은 6입니다");
		}

	}

}
