package mcno;

public class Test4 {

	public static void main(String[] args) {
		int[]ball = new int[45];
		int temp = 0, j=0;
		
		for(int i=0; i<ball.length;i++)
			ball[i] = i+1;
		
		for(int i=0;i<100;i++) {
			j = (int)(Math.random()*45);
			temp = ball[0];
			ball[0] = ball[j];
			ball[j] = temp;
		}
		
		for(int i = 0;i < 6; i++) {
			System.out.println(ball[i]+"");
		}

	}

}
