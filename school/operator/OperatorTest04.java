package operator;

public class OperatorTest04 {

	public static void main(String[] args) {
		// 산술 연산자 + - * / %
		
		int v1 = 5;
		int v2 = 2;
		
		int result1 = v1 + v2;
		System.out.println(result1);
		
		int result2 = v1 - v2;
		System.out.println(result2);
		
		int result3 = v1 * v2;
		System.out.println(result3);
		
		
		int result4 = v1 / v2;
		System.out.println(result4);
		
		int result5 = v1 % v2;
		System.out.println(result5);
		
		float result6 = (float)v1 / v2;
		System.out.println(result6);
		
		// 문자열 결합 연산자
		String str1 = "JDK" + 6.0;
		System.out.println(str1);
		
		String str2 = 3 + 3.0 + "JDK";
		System.out.println(str2);
	}

}
