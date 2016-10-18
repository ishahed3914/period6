package arrays;

import java.lang.reflect.Array;

public class arrayClasswork {

	public static void main(String[] args){
		static int[] array = new int[50];
		static int[] dieArray = new int[10000];
		static int[] results = new int [11];
		populateArray(array);
		randomArray(array);
	}
	public static void populateArray(int[] array){
		for(int i = 0; i < array.length; i++){
			array[i] = (i+1);
			System.out.println(array[i]);
		}
	}
	public static void randomArray(int[] array){
		for(int i = 0; i < array.length; i++){
			double rand = Math.random();
			array[i] = (i+1);
			System.out.println(array[i]);
		}
	}
	public static void randomDiceArray(){
		
	}
	public static void populateDieArray(int[] array){
		for(int i = 0; i < array.length;i++){
			int firstRoll = randInt(1,6);
			int secondRoll = randInt(1,6);
			array[i] = firstRoll + secondRoll;
			System.out.println(array[i]);
		}
	}
	public static void populateResultsArray(int[] numsRolled){
		for(int d = 0; d < numsRolled.length; d++){
			results[numsRolled[d]-2]++;
		}
	}
	public static void printResults(int[] arr){
		for(int i = 0; i < arr.length;i++){
			System.out.println(i + 2 + "is rolled "+ 
		((double)arr[i]/dieArray.length*100) + "% of the time.");
		}
	}


}

