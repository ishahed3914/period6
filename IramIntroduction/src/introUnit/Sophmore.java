
package introUnit;

/**
 * @author IramS
 *
 */
public class Sophmore extends Student {

	/**
	 * @param name
	 */
	private String internship;
	
	public Sophmore(String name, String internship) {
		super(name);
		this.internship = internship;
		// TODO Auto-generated constructor stub
	}
	public void talk(){
		super.talk();//call the super method
		System.out.println("...and I am a Sophmore!");
		System.out.println("I intern as a "+internship);
	}

}
