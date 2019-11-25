package application;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Form {
	Rectangle a;
	Rectangle b;
	Rectangle c;
	Rectangle d;
	Color color;
	private String name;
	public int form = 1;

	public Form(Rectangle a,Rectangle b,Rectangle c,Rectangle d,String name) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d =d;
		this.name = name;

// テトリミノの色設定
	switch(name) {
	case "i":
		color = Color.CYAN;
		break;
	case "j":
		color = Color.NAVY;
		break;
	case "l":
		color = Color.ORANGERED;
		break;
	case "o":
		color = Color.GOLD;
		break;
	case "s":
		color = Color.LAWNGREEN;
		break;
	case "z":
		color = Color.RED;
		break;
	case "t":
		color = Color.DARKVIOLET;
		break;

	}


	this.a.setFill(color);
	this.b.setFill(color);
	this.c.setFill(color);
	this.d.setFill(color);
	}

	// gettr
	public String getName() {
		return name;
	}
	public void changeForm() {
		if(form !=4) {
			form++;
		}else {
			form = 1;
		}
	}
}
