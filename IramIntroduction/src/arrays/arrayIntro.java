package arrays;

public class arrayIntro {

	public static void main(String[] args) {
		//this is how you time how
		//quickly a computer processes
		long startTime = System.currentTimeMillis();
		sampleElement sample = new sampleElement(10);
		sample.increase();
		System.out.println("The sample element has a number equal to)" + sample.getNumber());
		arrayIntroMethod();
		String[] someStrings = new String[100];
		populateArray(someStrings);
		printArray(someStrings);
		//in this method, we pass the ELEMENT
		//not the array, so
		//no change will be made
		System.out.println("Before "+someStrings[99]);
		changeString(someStrings[99]);
		System.out.println("After\"changeString\" method "+someStrings[99]);
		changeArrayElement(someStrings, 99);
		long endTime = System.currentTimeMillis();
		System.out.println("Completed method in " + (endTime - startTime)+ " milliseconds." );
	}
	private static void passByValueDemonstration(){
		
	}
	private static void changeArrayElement(String[] someStrings, int i) {
		someStrings[i] = "new item"+(i+1);
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
		//SECOND METHOD "FOR EACH"
		//always goes in order, does not keep track of the index
		//easier to type
		for(boolean b: booleans){
			System.out.println(""+b);
		}


		//these two constructors are different
		String[] strings1 = {"", "", ""};
		String[] strings2 = new String[32];
		
		for(int index = 0; index < strings2.length; index++){
			strings2[index] = "value" + (index+1);
		}
		for(String s: strings1){
			System.out.println(s);
		}
		for(String s: strings2){
			System.out.println(s);
		}
	}
	private static void changeString(String s){
		s = "This string has been changed";
	}
	private static void changeArray(String[] someStrings){
		someStrings = new String[100];
		for(int i = 0; i < someStrings.length; i++){
			someStrings[i] = "new item"+(i+1);
		}
	}
	private static void printArray(String[] a){
		//this loop prints the strings
		for(String s: a){
			System.out.println(s);
		}
	}
	private static void populateArray(String[] a){
		//this loop
		for(int index = 0; index < a.length; index++){
			a[index] = "value " + (index+1);
		}
	}
}
