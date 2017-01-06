package gui.whackamole;

import gui.screens.ClickableGraphic;

public class Mole extends ClickableGraphic implements MoleInterface {
	
	private int appearanceTime;
	
	public Mole(int x, int y) {
		super(x, y, .9, "resources/sampleImages/mole.png");
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getAppearanceTime() {
		return appearanceTime;

	}

	@Override
	public void setAppearanceTime(int screenTime) {
		appearanceTime = screenTime;
	}

}
