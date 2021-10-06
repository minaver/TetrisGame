package application;

import javafx.scene.shape.*;

public class Controller {
	//getting numbers and MESH from Tetris class
	public static final int MOVE = Tetris.MOVE;
	public static final int SIZE = Tetris.SIZE;
	public static int XMAX = Tetris.XMAX;
	public static int YMAX = Tetris.YMAX;
	public static int [][] MESH = Tetris.MESH;
	
	//moving the blocks Right
	public static void MoveRight (Form form) {
		if(form.a.getX() + MOVE <= XMAX -SIZE && form.b.getX() + MOVE <= XMAX -SIZE 
				&& form.c.getX() + MOVE <= XMAX -SIZE && form.d.getX() + MOVE <= XMAX -SIZE ) {
			
			int movea = MESH[((int) form.a.getX() / SIZE) +1][((int) form.a.getY() / SIZE)];
			int moveb = MESH[((int) form.b.getX() / SIZE) +1][((int) form.b.getY() / SIZE)];
			int movec = MESH[((int) form.c.getX() / SIZE) +1][((int) form.c.getY() / SIZE)];
			int moved = MESH[((int) form.d.getX() / SIZE) +1][((int) form.d.getY() / SIZE)];
		
			if(movea == 0 && movea == moveb && moveb == movec && movec == moved) { // 움직이려는 곳에 MESH 값이 모두 0일때 (비어있을 때)
				form.a.setX(form.a.getX() + MOVE);
				form.b.setX(form.b.getX() + MOVE);
				form.c.setX(form.c.getX() + MOVE);
				form.d.setX(form.d.getX() + MOVE);
			}
		}
			
	}
	
	//moving the blocks Left
	public static void MoveLeft (Form form) {
		if(form.a.getX() - MOVE >= 0 && form.b.getX() - MOVE >= 0
				&& form.c.getX() - MOVE >= 0 && form.d.getX() - MOVE >= 0 ) {
			
			int movea = MESH[((int) form.a.getX() / SIZE) -1][((int) form.a.getY() / SIZE)];
			int moveb = MESH[((int) form.b.getX() / SIZE) -1][((int) form.b.getY() / SIZE)];
			int movec = MESH[((int) form.c.getX() / SIZE) -1][((int) form.c.getY() / SIZE)];
			int moved = MESH[((int) form.d.getX() / SIZE) -1][((int) form.d.getY() / SIZE)];
		
			if(movea == 0 && movea == moveb && moveb == movec && movec == moved) { // 움직이려는 곳에 MESH 값이 모두 0일때 (비어있을 때)
				form.a.setX(form.a.getX() - MOVE);
				form.b.setX(form.b.getX() - MOVE);
				form.c.setX(form.c.getX() - MOVE);
				form.d.setX(form.d.getX() - MOVE);
			}
		}
			
	}
	
	
	//create block
	//return Form instance
	public static Form makeRect() { 
		// random color for the stones
		
		int block = (int) (Math.random() * 100); // for classify rectangle shape
		String name;
		
		Rectangle a = new Rectangle(SIZE -1, SIZE -1), // SIZE에 -1은 왜 하지..? <= 모양 사이에 공간 만들기 위해서 
				b = new Rectangle(SIZE -1, SIZE -1),
				c = new Rectangle(SIZE -1, SIZE -1),
				d = new Rectangle(SIZE -1, SIZE -1);
		
		if(block < 15) { // |__
			a.setX(XMAX / 2 - SIZE);
			b.setX(XMAX / 2 - SIZE);
			b.setY(SIZE);
			c.setX(XMAX / 2);
			c.setY(SIZE);
			d.setX(XMAX / 2 + SIZE);
			d.setY(SIZE);
			name = "j";
			
		} else if(block < 30) { // __|
			a.setX(XMAX / 2 + SIZE);
			b.setX(XMAX / 2 - SIZE);
			b.setY(SIZE);
			c.setX(XMAX / 2);
			c.setY(SIZE);
			d.setX(XMAX / 2 + SIZE);
			d.setY(SIZE);
			name = "1";
			
		} else if(block < 45) { // ㅁ 
			a.setX(XMAX / 2 - SIZE);
			b.setX(XMAX / 2 );
			c.setX(XMAX / 2 );
			c.setY(SIZE);
			d.setX(XMAX / 2 - SIZE);
			d.setY(SIZE);
			name = "o";
			
		} else if(block < 60) { // _|-
			a.setX(XMAX / 2 + SIZE);
			b.setX(XMAX / 2 );
			c.setX(XMAX / 2 );
			c.setY(SIZE);
			d.setX(XMAX / 2 - SIZE);
			d.setY(SIZE);
			name = "s";
			
		} else if(block < 75) { // -|-
			a.setX(XMAX / 2 - SIZE);
			b.setX(XMAX / 2 );
			c.setX(XMAX / 2);
			c.setY(SIZE);
			d.setX(XMAX / 2 + SIZE);
			name = "t";
			
		} else if (block < 90) { // -|_
			a.setX(XMAX / 2 + SIZE);
			b.setX(XMAX / 2);
			c.setX(XMAX / 2 + SIZE);
			c.setY(SIZE);
			d.setX(XMAX / 2 + SIZE + SIZE);
			d.setY(SIZE);
			name = "z";
		} else { // ㅡ 
			a.setX(XMAX / 2 - SIZE - SIZE);
			b.setX(XMAX / 2 - SIZE);
			c.setX(XMAX / 2);
			d.setX(XMAX / 2 + SIZE);
			name = "i";
		}
		
		return new Form(a,b,c,d,name);
		
		
		
	}
	
}
