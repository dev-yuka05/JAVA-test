package operator;

public class OperatorTest07 {

	public static void main(String[] args) {
		// 논리연산 & && | ||
		int charCode = 'A';
		
		if ((charCode >= 65) & (charCode <= 90)) {
			System.out.println("대문자임");
		}else if((charCode >= 65) && (charCode <= 122)) {
			System.out.println("소문자임");
		};
		
		int value = 6;
		
		if((value % 2 == 0) | (value % 3 == 0)) {
			System.out.println("2또는 3의 배수입니다");
		}
		
		if((value % 2 == 0) || (value % 3 == 0)) {
			System.out.println("2또는 3의 배수입니다");
		}
		
	}

}
