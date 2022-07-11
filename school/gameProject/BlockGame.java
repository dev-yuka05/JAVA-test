// UI 모듈 받기
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BlockGame {

	// JFrame 로부터 상속받은 Myframe 생성
	static class MyFrame extends JFrame{
		// 상수 선언
		static int BALL_WIDTH = 20;
		static int BALL_HEIGHT = 20;
		static int BLOCK_ROWS = 5;
		static int BLOCK_COLUMNS = 10;
		static int BLOCK_WIDTH = 40;
		static int BLOCK_HEIGHT = 20;
		static int BLOCK_GAP = 3;
		static int BAR_WIDTH = 80;
		static int BAR_HEIGHT = 80;	
		static int CANVAS_WIDTH = 400 + (BLOCK_GAP * BLOCK_COLUMNS)-BLOCK_GAP;
		static int CANVAS_HEIGHT = 600;
		
		static MyPanel myPanel = null;
		static int score = 0;
		static Timer timer = null;
		static Block[][] blocks = new Block[BLOCK_ROWS][BLOCK_COLUMNS];
		
		static Bar bar = new Bar();
		static Ball ball = new Ball();
		static int barXTarget = bar.x;
		static int dir = 0;
		static int ballSpeed = 5;
		
		static class Ball{
			int x = CANVAS_WIDTH/2 - BALL_WIDTH/2;
			int y = CANVAS_HEIGHT/2 - BALL_HEIGHT/2;
			int width = BALL_WIDTH;
			int height = BALL_HEIGHT;
		};
		
		static class Bar{
			int x = CANVAS_WIDTH/2 - BAR_WIDTH/2;
			int y = CANVAS_HEIGHT - 100;
			int width = BAR_WIDTH;
			int height = BAR_HEIGHT;
		};
		
		static class Block {
			int x = 0;
			int y = 0;
			int width = BLOCK_WIDTH;
			int height = BLOCK_HEIGHT;
			int color = 0;
			boolean isHidden = false; // 충돌 후 블럭 사라지게 하기 위해 설정
		};
		
		static class MyPanel extends JPanel{
			
		}
		
		public MyFrame(String title) {
			super(title);
			this.setVisible(true);
			this.setSize(CANVAS_WIDTH, CANVAS_HEIGHT);
			this.setLocation(400, 300);
			this.setLayout(new BorderLayout());
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			initData();
			
			myPanel = new MyPanel();
			this.add("Center",myPanel);
			
			setKeyListener();
			
			startTimer();
		}
		
		public void initData() {
			
		};
		
		public void setKeyListener() {
			
		};
		
		public void startTimer() {
			
		};
		
	};
	
	public static void main(String[] args) {
		new MyFrame("Block Game");
	}

}