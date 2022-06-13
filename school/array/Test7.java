package mcno;

public class Test7 {

	public static void main(String[] args) {
		int[]num = {1,2,3,4,5};
		int[]newArr = new int[5];
		
		System.arraycopy(num, 0, newArr, 0, num.length);

	}

}
