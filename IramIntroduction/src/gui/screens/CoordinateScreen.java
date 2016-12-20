package gui.screens;


import java.util.ArrayList;

import gui.Screen;
import gui.components.Graphics;
import gui.components.TextArea;
import gui.components.TextLabel;
import gui.components.Visible;

public class CoordinateScreen extends Screen {
	private TextArea area;
	private Graphics car;
	
	public CoordinateScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		TextLabel text = new TextLabel(20, 200, 500, 40, "Some Text~");
		viewObjects.add(text);
		area = new TextArea(20,300,300,100, "This is a really long text so it gets split up into different lines");
		viewObjects.add(area);
		car = new Graphics(30,30,100,100 "resources/sampleImages/veneno.jpg");
		viewObjects.add(car);

		
	}

}