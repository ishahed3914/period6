package arrays;

public class arrayIntro {

	public static void main(String[] args) {
		//this is how you time how
		//quickly a computer processes
		long startTime = System.currentTimeMillis();
		arrayIntroMethod();
		long endTime = System.currentTimeMillis();
		System.out.println("Completed method in " + (endTime - startTime)+ " milliseconds." );
	}
	public static void arrayIntroMethod(){
		//construct 3 integer arrays
		//these two methods do the same thing
		//primitive type arrays fill with ZEROES 0, 0, 0 false
		int[] zeros1 = {0,0,0};
		int[] zeros2 = new int[3];
		//example
		boolean[] booleans = new boolean[3];
		//iterate (2 ways)
		//WHEN TO USE THIS FOR LOOP
		//  - the index of the data is important to reference 
		//  - you need to customize how you iterate 
		//(increases by 2, backwards, etc.......)

		for(int index = 0; index < booleans.length; index++){
			System.out.println(index+") "+booleans[index]);
		}
		//SECOND METHOD
		//always goes in order, does not keep track of the index
		//easier to type
		for(boolean b: booleans){
			System.out.println(""+b);
		}


		//these two constructors are different
		String[] strings1 = {"", "", ""};
		String[] strings2 = new String[3];
		for(String s: strings1){
			System.out.println(s);
		}
		for(String s: strings2){
			System.out.println(s);
		}
	}

}
