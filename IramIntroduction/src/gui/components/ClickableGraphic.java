package gui.components;

public class ClickableGraphic extends Graphics implements Visible, Clickable {

	private Action action;

	public ClickableGraphic(int x, int y, double scale, String imageLocation) {
		super(x, y, scale, imageLocation);
		// TODO Auto-generated constructor stub
	}
	public void setAction(Action a){
		this.action = a;
	}
	@Override
	public boolean isHovered(int x, int y) {
		return x > getX() && x < getX() + getWidth() && y > getY() && y < getY() + getHeight();
	}

	@Override
	public void act() {
		if(action != null)action.act();
	}

}
