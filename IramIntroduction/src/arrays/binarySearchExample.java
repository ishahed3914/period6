package arrays;

public class binarySearchExample {

	public static void main(String[] args) {
		int [] arr = {2,3,4,6,9,11,12,15};
		if(checkHalfway(arr,12,0, arr.length-1)){
			System.out.println("The number you are searching for is less than the value in the"
					+ "middle of the array");
		}
		else{
			System.out.println("The number you are searching for is greater than or equal to "
					+ "in the middle of the array");
		}
	
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

}