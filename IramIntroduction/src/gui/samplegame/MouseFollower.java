package gui.samplegame;

import gui.GUIApplication;
import gui.screens.CoordinateScreen;
import gui.screens.MovementScreen;

public class MouseFollower extends GUIApplication {

	//FIELDS
	public static MouseFollower game;//only ONE exists
	private CoordinateScreen cs;
	public static MovementScreen moveScreen;
	
	
	public MouseFollower(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub//
	}

	@Override
	public void initScreen() {
		cs = new CoordinateScreen(getWidth(), getHeight());
		setScreen(cs);
		moveScreen = new MovementScreen(getWidth(),getHeight());
	}

	public static void main(String[] args) {
		game = new MouseFollower(800,600);
		Thread app = new Thread(game);
		app.start();
	}

}







