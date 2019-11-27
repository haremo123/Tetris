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
		public static int top = 0;
		private static boolean game = true;
		private static Form nextObj= Controller.makeRect();
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
		  scoretext.setStyle("-fx-font: 20 arials;");
		  scoretext.setY(50);
		  scoretext.setX(XMAX + 5);
		  Text level = new Text("Line:");
		  level.setStyle("-fx-font: 20 arials;");
		  level.setY(100);
		  level.setX(XMAX + 5);
		  level.setFill(Color.GREEN);
		  groupe.getChildren().addAll(scoretext,line,level);

		  //
		  Form a = nextObj;
		  groupe.getChildren().addAll(a.a,a.b,a.c,a.d);
		  moveOnKeyPress(a);
		  object = a;
		  nextObj = Controller.makeRect();
		  stage.setScene(scene);
		  stage.setTitle("T E T R I S");
		  stage.show();

		  // タイマー
		  Timer fall = new Timer();
		  TimerTask task = new TimerTask() {
		    public void run() {
		    Platform.runLater(new Runnable() {
		        public void run() {
		           if(object.a.getY() == 0 || object.b.getY() == 0 || object.c.getY() == 0 || object.d.getY() == 0)
		           top++;
		           else
		             top = 0;

		           if(top == 2) {
		             // ゲームオーバー
		           Text over = new Text("GAME OVER");
		           over.setFill(Color.RED);
		           over.setStyle("-fx-font: 70 arial;");
		           over.setY(250);
		           over.setX(10);
		           groupe.getChildren().add(over);
		           game = false;

		           // 終了
		           if (top == 15) {
		             System.exit(0);
		           }

		           if(game) {
		             MoveDown(object);
		             scoreText.setText("Score:" + Integer.toString(score));
		             level.setText("Line:" + Integer.toString(lineNo));
		           }
		           }
		        });
		    }
		    };
		    fall.schedule(task,0,300);

		  private void moveOnKeyPressed(Form form) {
		    scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
		      switch(event.getcode()) {
		      case RIGHT:
		        Controller.MoveRight(form);
		        break;
		      case Down:
		        MoveDown(form);
		        score++;
		        break;
		      case LEFT:
		        Controller.MoveLeft(form);
		        break;
		      case UP:
		        MobeTurn(form);
		        break;
		      }
		    }
		  });
		  }

		  private void MoveTurn(Form form) {
		    int f = form.form;
		    Rectangle a = form.a;
		    Rectangle b = form.b;
		    Rectangle c = form.c;
		    Rectangle d = form.d;
		    switch(form.getName()) {
		    case"j":
		      if(f == 1 && cB(a,1,-1) &&cB(c,-1,-1) && cB(d,-2,-2)) {


		      }
		    }

		  }

		  private