/**
 * 
 */
package gui.whackamole;

import gui.components.Action;
import gui.components.Clickable;

/**
 * @author Student 8
 *This is for my partner, the enemy designer to implement
 */
public interface MoleInterface extends Clickable {


	void setAppearanceTime(int screenTime);

	int getAppearanceTime();

	void setAction(Action action);

}
