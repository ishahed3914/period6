/**
 * 
 */
package dataTypes;

/**
 * @author Student 8
 *
 */
public class DataTypes {

	/**
	 * 
	 */
	public DataTypes() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(5.0/2);//double divided by int
		System.out.println((double)5/2);//casting	
		System.out.println(5/2);
		System.out.println(3+5.0/2+5*2);
		System.out.println((int)(3.0 + 5)/(2 + 5 * 2));
		String ten = "10";
		String two = "2";
		if(ten.compareTo(two)>0) System.out.println("10 is greater than two");
		else System.out.print("10 is not greater than two");
		
		
	}

}
