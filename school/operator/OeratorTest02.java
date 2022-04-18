package operator;
public class OeratorTest02 {
	public static void main(String[] args) {
		// 증감연산자 ++ --
		int x = 10;
		int y = 10;
		int z; 
		
		System.out.println("----------------");
		x++;
		++x;
		System.out.println("x="+ x);
		System.out.println("----------------");
		y--;
		--y;
		System.out.println("y="+ y);
		System.out.println("----------------");
		z = x++;
		System.out.println("z="+ z);
		System.out.println("x="+ x);
		System.out.println("----------------");
		
		z = ++x + y++;
		
		System.out.println("z="+ z);
		System.out.println("x="+ x);
		System.out.println("y="+ y);
		
		int result1 = ++x + 10;
		int result2 = y++ + 10;
		
//		System.out.println(result1); // 12
//		System.out.println(result2); // 11

	}

}
