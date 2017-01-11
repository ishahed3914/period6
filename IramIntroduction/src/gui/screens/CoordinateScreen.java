package gui.screens;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import gui.Screen;
import gui.components.Button;
import gui.components.Graphics;
import gui.components.MovingComponent;
import gui.components.TextArea;
import gui.components.Action;
import gui.components.TextLabel;
import gui.components.Visible;
import gui.samplegame.MouseFollower;

public class CoordinateScreen extends Screen implements MouseListener, MouseMotionListener {

	// FIELD
	private Button button;
	private TextLabel text;
	private TextArea area;
	private Graphics car;

	public CoordinateScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		button = new Button(50, 300, 80, 40, "Button ", new Color(100, 100, 250), new Action() {
			public void act() {
				MouseFollower.game.setScreen(MouseFollower.moveScreen);
			}
		});
		viewObjects.add(button);
		text = new TextLabel(20, 100, 500, 40, "Some text");//
		viewObjects.add(text);
		area = new TextArea(20, 200, 500, 100, "This is " + "really long text. It prints over"
				+ " multiple lines, as you can see. " + "We worked on this in class. It" + " is called TextArea.");
		viewObjects.add(area);
		car = new Graphics(100, 400, .5, "resources/" + "sampleImages/veneno.jpg");
		viewObjects.add(car);
		MovingComponent c = new MovingComponent(20,10,100,100);
		viewObjects.add(c);
		c.setVy(2);
		c.setVx(1);
		c.play();
	}	

	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public void mouseMoved(MouseEvent e) {
		int mx = e.getX();// get mouse X coordinate
		int my = e.getY();// get Y coord
		text.setText("Mouse at: " + mx + ", " + my);
	}

	public MouseMotionListener getMouseMotionListener() {
		return this;
	}

	public MouseListener getMouseListener() {
		return this;
	}

	@Override
	public void mouseClicked(MouseEvent m) {
		if (button.isHovered(m.getX(), m.getY())) {
			button.act();
		}
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

}
