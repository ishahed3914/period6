/**
 * 
 */
package introUnit;

/**
 * @author IramS
 *This class is designed to contrast with the 
 *ProceduralExample. It embodies an Object-Oriented
 *approach. 
 */
public class OopExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student jillian = new Senior("Jillian","programmer");
		Student jordan = new Freshmen("Jordan","pharmacist");
		Student jason = new Sophmore("Jason","architect");
		
		//((Student))jillian
		jillian.talk();
		jordan.talk();
		jason.talk();

	}

}
