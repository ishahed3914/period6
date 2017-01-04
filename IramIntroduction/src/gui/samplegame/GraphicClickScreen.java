package gui.samplegame;

import gui.GUIApplication;

public class GraphicClickScreen extends GUIApplication {

	public GraphicClickScreen(int width, int height) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		ClickGraphicsGame cgg = new ClickGraphicsGame(500, 500);
		Thread app = new Thread(cgg);
		app.start();
	}

	@Override
	public void initScreen() {
		GraphicClickScreen gcs = new GraphicClickScreen(getWidth(), getHeight());
		setScreen(gcs);
	}

}
