package arrays;
import java.util.Arrays;

public class binarySearchExample {

	public static void main(String[] args) {
		int [] arr = {2,3,4,6,9,11,12,15};
		int [] subArr = getSubArray(arr, 2, 4);
		testPrimes(50);
		System.out.println(Arrays.toString(subArr)+ "");
		contains(arr, subArr);
		swap(arr, 0, arr.length-1);
		shuffle(arr);
		print(arr);
		if(checkHalfway(arr,12,0, arr.length-1)){
			System.out.println("The number you are searching for is less than the value in the"
					+ "middle of the array");
		}
		else{
			System.out.println("The number you are searching for is greater than or equal to "
					+ "in the middle of the array");
		}

	}
	private static void shuffle(int[] arr) {
		for(int i = 0; i < arr.length; i++){
			int random = (int)(Math.random() *arr.length);
			swap(arr,i,random);
		}
	}
	private static void print(int[] arr){
		for(int i =0; i <arr.length-1; i++){
			System.out.println(arr[i]+",");

		}
	}
	private static void swap(int[] arr, int i, int j) {
		int placeholder = arr[j];
		arr[j] = arr[i];
		arr[i] = placeholder;
	}
	public static int countUnderBound(double [] arr, double d){
		int num = 0;
		for(int i = 0; i < arr.length; i++){
			if(arr[i] < d){
				num++;
			}
		}
		return num;
	}
	private static void cycleThrough(int[] array){

	}
	/**
	 * returns true if SearchValue is less than element
	 * halfway between beginning and end.
	 * @param arr
	 * @param i
	 * @param j
	 * @param length
	 */

	private static boolean checkHalfway(int[] arr, int searchValue, int begin, int end) {
		return searchValue < arr[(begin+end)/2];
	}
	public static int[] getSubArray(int [] arr, int startIndex, int endIndex){
		int [] subArray= new int[endIndex - startIndex - 1];
		for( int i = 0; i < subArray.length; i++){
			subArray[i] = arr[startIndex + i];
		}
		return subArray;
	}
	public static int longestSharedSequence(int[] array1, int[] array2){
		int counter = 0;
		for(int i = 0; i < array1.length; i++){
			if(array1[i] == array2[i]){
				counter++;
				return counter;
			}
		}
		return 0;
		/**This method counts the longest unbroken, shared sequence in TWO arrays.
		 * The sequence does NOT have to be a consecutive sequence
		 * It does NOT matter where the sequence begins, the arrays might not be the same length
		 * 
		 * Examples:
		 * longestSequence({9,6,3,4,3,8,9}, {9,6,3,4,3,6,7}) returns '5', since the sequence '9,6,3,4,3' is in both arrays and is 5 integers long 
		 * longestSequence({0,9,6,3,4,3,8,9}, {1,2,9,6,3,4,3,6,7}) returns '5', 
		 *          since the sequence '9,6,3,4,3' is in both arrays and is 5 integers long, it doesn't matter that the sequence begins at different indices 
		 * longestSequence({9,6,1,4,3,6,7,9}, {9,6,5,8,3,6,7,0}) returns '3', since the sequence '3,6,7' is in both arrays and is 3 integers long
		 * */

	}
	public static int longestConsecutiveSequence(int[] array1){
		/**This method counts the longest consecutive sequence in an array.
		 * It does not matter where the sequence begins
		 * If there are no consecutive numbers, the method should return '1'
		 * 
		 * Examples:
		 * longestSequence({1,2,3,4,5,8,9}) returns '5', since the sequence '1,2,3,4,5' is 5 integers long 
		 * longestSequence({0,9,10,11,4,3,8,9}) returns '3', since '9,10,11' is 3 integers long
		 * longestSequence({0,9,8,11,4,3,7,9}) returns '1', since there are no consecutive integers
		 * */
		int counter = 0;
		for(int i = 0; i < array1.length -1; i++){
			if(array1[i] < array1[i+1]){
				counter++;
				return counter;
			}
		}
		return counter;
	}
	public static boolean contains(int[] arr, int[] subArray){
		for(int i = 0; i < arr.length; i++){
			if(arr[i] == subArray[0]){
				//checks the rest of the elements
				int j = i;
				while(j < subArray.length){
					if(subArray[j] == arr[i + j] && j == subArray.length-1){
						System.out.println("Found a match at index " + i);
						return true;
					}
					else if(subArray[j] != arr[i]){
						System.out.println("No match at " + i);
						break;
					}
					j++;
				}
			}
			return false;
		}
	}
	public static void testPrimes(int numberToTest){
		int lastToCheck = (int)(Math.sqrt(numberToTest));
		boolean [] theNumbers = new boolean[numberToTest];
		for(int i = 0; i < numberToTest; i++){
			theNumbers[i] = true;
		}
			theNumbers[0] = false;
			theNumbers[1] = false;
			for(int prime = 2; prime <= lastToCheck; prime++){
				//when checking 50 numbers
				//tests 2, 3, 4, 5, 6, 7, as if prime
				if(theNumbers[prime]){
					//only checks numbers that are prime
					//(numbers that haven't been crossed off)
					//won't check 4 and 5 (crossed of by 2)
					System.out.println(prime + "is prime. Crossing off:");
					for(int test = prime + prime; test < numberToTest; test = test + prime){
						System.out.print(test + ", ");
						theNumbers[test] = false;
					}
				}
			for(int i = 0; i < theNumbers.length; i++){
				if(theNumbers[i]){
					System.out.println(i + " is prime.");
				}
			}
		}
	}
}


