/**
 * 
 */
package introUnit;

/**
 * @author IramS
 *
 */
public class Senior extends Student {

	/**
	 * @param name
	 */
	private String internship;
	
	public Senior(String name, String internship) {
		super(name);
		this.internship = internship;
		// TODO Auto-generated constructor stub
	}
	public void talk(){
		super.talk();//call the super method
		System.out.println("...and I am a Senior!");
		System.out.println("I intern as a "+internship);
	}

}
