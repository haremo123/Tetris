package application;

public class Controller {
	//　テトリスクラスから変数など取得
	public static final int MOVE = Tetris.MOVE;
	public static final int SIZE = Tetris.SIZE;
	public static int  XMAX = Tetris.XMAX;
	public static int YMAX = Tetris.YMAX;
	public static int [][] MESH = Tetris.MESH;
	
	// テトリミノの動き 右回転
	public static void MoveRight (Form form) {
		if(form.a.getX() + MOVE <= XMAX - SIZE && form.b.getX() + MOVE <= XMAX - SIZE 
				&& form.c.getX() + MOVE <= XMAX - SIZE && form.d.getX() + MOVE <= XMAX -SIZE) {
		int movea = MESH[((int) form.a.getX() / SIZE) + 1][((int) form.a.getY() / SIZE)];
		int moveb = MESH[((int) form.b.getX() / SIZE) + 1][((int) form.b.getY() / SIZE)];
		int movec = MESH[((int) form.c.getX() / SIZE) + 1][((int) form.c.getY() / SIZE)];
		int moved = MESH[((int) form.d.getX() / SIZE) + 1][((int) form.d.getY() / SIZE)];
		if(movea = 0 && movea == moveb == movec && movec && movec == moved) {
			form.a.setX(form.a.getX() + MOVE);
			form.b.setX(form.b.getX() + MOVE);
			form.c.setX(form.c.getX() + MOVE);
			form.d.setX(form.d.getX() + MOVE);
		}
			
		}
	}
	
	// 左回転
	public static void MoveLeft (Form form) {
		if(form.a.getX() - MOVE >= 0 && form.b.getX() + MOVE - MOVE >= 0 
				&& form.c.getX() - MOVE >= 0 && form.d.getX() - MOVE >= 0) {
		int movea = MESH[((int) form.a.getX() / SIZE) - 1][((int) form.a.getY() / SIZE)];
		int moveb = MESH[((int) form.b.getX() / SIZE) - 1][((int) form.b.getY() / SIZE)];
		int movec = MESH[((int) form.c.getX() / SIZE) - 1][((int) form.c.getY() / SIZE)];
		int moved = MESH[((int) form.d.getX() / SIZE) - 1][((int) form.d.getY() / SIZE)];
		if(movea = 0 && movea == moveb == movec && movec && movec == moved) {
			form.a.setX(form.a.getX() - MOVE);
			form.b.setX(form.b.getX() - MOVE);
			form.c.setX(form.c.getX() - MOVE);
			form.d.setX(form.d.getX() - MOVE);
		}
			
		}
	}
	
}
