package application;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Timer;
import java.util.TimerTask;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
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

		//
		public void main(String[] args) {launch(args);}
		@Override
	public void start(Stage arg0) throws Exception {
		  for(int[] a: MESH) {
		    Arrays.fill(a, 0);
		  }

		  //
		  Line line = new Line(XMAX,0,XMAX,YMAX);
		  Text scoretext = new Text("Score: ");
		  scoretext.setStyle(" -fx-font: 20 arials;");
		  scoretext.setY(50);
		  scoretext.setX(XMAX + 5);
		  Text level = new Text("Line:");

	}

}
