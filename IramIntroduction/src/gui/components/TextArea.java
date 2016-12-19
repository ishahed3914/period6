package gui.components;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;


public class TextArea extends TextLabel {
	//FIELDS
	private String text;
	private String font;
	private int size;
	

	public TextArea(int x, int y, int w, int h, String text) {
		super(x, y, w, h, text);
		update();
		this.text = text;
		this.font = "Wing Ding";
		this.size = 20;
	}
	@Override
	public void update(Graphics2D g) {
		g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g.setColor(Color.black);
		g.setFont(new Font(font, Font.PLAIN,size));
		if(text != null) g.drawString(text, 4, getHeight()-5);	
		FontMetrics fm = g.getFontMetrics();
		String[] words = getText().split(" ");//splits word at every space
		fm.getHeight();
		fm.getAscent();
		fm.getDescent();
		fm.stringWidth(text);
		if(text > getWidth())
	}

}