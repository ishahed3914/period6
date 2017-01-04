package gui;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import gui.components.Visible;

public abstract class Screen {

	private BufferedImage image;
	private ArrayList<Visible> viewObjects;

	public Screen(int width, int height) {
		viewObjects = new ArrayList<Visible>();
		initObjects(viewObjects);//
		initImage(width, height);
	}

	public abstract void initObjects(ArrayList<Visible> viewObjects);

	public void initImage(int width, int height) {
		image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		update();
	}

	public BufferedImage getImage() {
		return image;
	}

	public int getWidth() {
		return image.getWidth();
	}

	public int getHeight() {
		return image.getHeight();
	}

	public void update() {
		Graphics2D g = image.createGraphics();
		// smooth the graphics
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		g.setColor(Color.white);
		g.fillRect(0, 0, image.getWidth(), image.getHeight());
		g.setColor(Color.black);
		// for(int i = 0; i < viewObjects.size(); i++){
		//
		// }
		for (Visible v : viewObjects) {
			g.drawImage(v.getImage(), v.getX(), v.getY(), null);
		}
	}

	// represents ABILITY to listen to mouse
	// but isn't actually doing something
	public MouseMotionListener getMouseMotionListener() {
		return null;
	}

	public MouseListener getMouseListener() {
		return null;
	}
	public void addObjects(Visible v){
		viewObjects.add(v);
	}
	public void remove(Visible v){
		/**
		 * Note: in this implementation we have a very simple command:
		 * remove(v)
		 * however, remove is sorta a big deal on the AP exam Heres Why:
		 * When an object is removed from a list, every other object AFTER that 
		 * object is moved up in order. Therefore all of their respective indices
		 * change. YOU MUST BE AWARE OF THIS
		 * 
		 * Here is a Classic example:
		 * 
		 * The following is WRONG
		 * Suppose you have a List<Integer> with
		 * {4,8,7,1}
		 * and you want to remove all integers greater than 5.You do this:
		 * for(int i = 0; i < list.size(); i++){
		 * 		if(list.get(i) > 5) list.remove(i);
		 * }
		 *YOU FAIL
		 *
		 *Why do you fail?
		 *i = 0 nothing happens
		 *i = 1 the '8' is removed
		 * now we have:
		 * {4,7,1}
		 * i = 2 nothing changes
		 * i = exit the for loop We have {4,7,1}
		 * These Two Ways Are CORRECT:
		 * for(int i = 0; i < list.size(); i++){
		 * 		while(list.get(i) > 5) list.remove(i);
		 * }
		 * for(int i = 0; i < list.size(); i++){
		 * 		if(list.get(i) > 5){ 
		 * 			list.remove(i);
		 * 			i--;//compensate for i++
		 * 		}
		 * }
		 * for the same reason this doesn't even work
		 * for(Integer i: list){
		 * 		if(i >5) list.remove(i);
		 * }
		 * ONE MORE NOTE:
		 * if you call list.remove(int) it will return the object being removed at the index you
		 * could do something like this 
		 * System.out.println "
		 */
		viewObjects.remove(v);
	}
	public void moveToBack(Visible v){
		if(viewObjects.contains(v)){
			viewObjects.remove(v);
			//the back is index 0
			viewObjects.add(0, v);
	}
	}
	
}