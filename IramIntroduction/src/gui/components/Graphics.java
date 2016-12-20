package gui.components;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;

public class Graphics implements Visible {
	//FIELDS
	private BufferedImage image;
	private boolean loadedImages;
	private int x;
	private int y;

	public Graphics(int x, int y, String imageLocation) {
		this.x = x;
		this.y =y;
		loadedImages = false;
		loadImages(imageLocation,0,0);
	}
	public Graphics(int x, int y, int w, int h, String imageLocation) {
		this.x = x;
		this.y =y;
		loadedImages = false;
		loadImages(imageLocation,w,h);
	}
	public Graphics(int x, int y, double scale, String imageLocation) {
		this.x = x;
		this.y =y;
		loadedImages = false;
		loadImages(imageLocation,scale);
	}
	private void loadImages(String imageLocation, double scale) {
		try{
			//get the full size image
			ImageIcon icon = new ImageIcon(imageLocation);
			int newWidth = (int)(icon.getIconWidth() * scale);
			int newHeight = (int)(icon.getIconHeight() * scale);
			Graphics2D g = image.createGraphics();
			g.drawImage(icon.getImage(), 0, 0, newWidth,newHeight,0,0,icon.getIconWidth(),icon.getIconHeight(),null);
		}catch(Exception e){
			//this happens when you don't name the image correctly
			e.printStackTrace();	
		}
	}


	private void loadImages(String imageLocation, int w, int h) {
		try{
			ImageIcon icon = new ImageIcon(imageLocation);
			if(w <= 0 && h <= 0){
				//use full size icon
				image = new BufferedImage(icon.getIconWidth(),icon.getIconHeight(),BufferedImage.TYPE_INT_ARGB);
				//use graphics2D tool to copy the icon
				Graphics2D g = image.createGraphics();
				g.drawImage(icon.getImage(), 0, 0, null);
			}else{
				image = new BufferedImage(w,h,BufferedImage.TYPE_INT_ARGB);
				//use graphics2D tool to copy the icon
				Graphics2D g = image.createGraphics();
				//note to self to crop:
				/**
				 * image to draw
				 * xCoord of destination
				 * yCoord of destination
				 * width of destination
				 * height of destination
				 * xCoord of target
				 * yCoord of target
				 * width of target
				 * height of target
				 * null
				 */
				g.drawImage(icon.getImage(), 0, 0, w,h,0,0,icon.getIconWidth(),icon.getIconHeight(),null);
			}
		}catch(Exception e){
			//this happens when you don't name the image correctly
			e.printStackTrace();	
		}

	}

	@Override
	public BufferedImage getImage() {
		return image;
	}

	@Override
	public int getX() {
		return x;
	}

	@Override
	public int getY() {
		return y;
	}

	@Override
	public int getWidth() {
		return image.getWidth();
	}

	@Override
	public int getHeight() {
		return image.getHeight();
	}

	@Override
	public boolean isAnimated() {
		return false;
	}

	@Override
	public void update() {
		//does nothing image stays the same

	}

}
