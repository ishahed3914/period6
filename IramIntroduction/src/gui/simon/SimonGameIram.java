package gui.simon;

import gui.GUIApplication;

public class SimonGameIram extends GUIApplication {

	public SimonGameIram(int width, int height) {
		super(width, height);
	}

	@Override
	public void initScreen() {
		SimonScreenIram sgi = new SimonScreenIram(getWidth(),getHeight());
		setScreen(sgi);
		
	}

	public static void main(String[] args) {
		SimonGameIram sgi = new SimonGameIram(800, 500);
		Thread game = new Thread(sgi);
		game.start();
	}

}
