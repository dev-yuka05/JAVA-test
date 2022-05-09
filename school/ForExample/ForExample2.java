
public class ForExample2 {

	public static void main(String[] args) {
		// For 문　반복문 -1　부터　100까지　합을　구하는　반복문
		
		int sum = 0;
		int i;
		for(i = 1; i <= 100; i++) {
			sum += i;
			System.out.println("1부터 100까지의 합 : "+sum);
		}
	}
}