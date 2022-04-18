package operator;

public class OperatorTest05 {

	public static void main(String[] args) {
		// 비교연산자 >, <, >=, <=, ==, !=
		int num1 = 10;
		int num2 = 10;
		
		boolean result1 = (num1 == num2); // true
		boolean result2 = (num1 != num2); // false
		boolean result3 = (num1 <= num2); // true
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
		
		char char1 = 'A';
		char char2 = 'B';
		
		boolean result4 = char1 < char2;
		
		System.out.println(result4);
		
		
	}

}
