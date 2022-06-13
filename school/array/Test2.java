package mcno;

public class Test2 {

	public static void main(String[] args) {
		int[]a = {10, 20, 30};
		int value = 30;
		
		for(int i=0;i<3;i++) {
			a[i] = value;
			value -= 10;
			System.out.println(a[i]);
		}
	}

}
