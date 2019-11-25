package application;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;



public class Tetris extends Application{

	//変数
		public static final int MOVE = 25;
		public static final int SIZE = 25;
		public static int XMAX = SIZE * 10;
		public static int YMAX = SIZE * 20;
		public static int [][] MESH = new int[XMAX/SIZE][YMAX/SIZE];
		private static Pane groupe = new Pane();
		private static Form object;
		private static Scene scene = new Scene(groupe,XMAX + 150, YMAX);
		public static int score = 0;
		private static boolean game = true;
		private static Form nextObj= controller.makeRect();
		private static int LinesNo = 0;
		
		
		
	@Override
	public void start(Stage arg0) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		
	}

}
