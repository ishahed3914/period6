package caveExplorer;

import java.util.Arrays;

public class twoDArrayIntro {

	public static void main(String[] args) {
		int [] arr = {0,1,2,3,4,5,6,7};
		System.out.println(Arrays.toString(arr));

		//rows, columns
		String[][] arr2D = new String[4][3];
		//iterate row by row
		for(int row = 0; row < arr2D.length; row++){
			//in each row, go col by col
			for(int col = 0; col < arr2D[row].length; col++){
				arr2D[row][col] = "("+row+","+col+")";
			}
		}
		//print each row
		
		for(String[] row: arr2D){
			System.out.println((row));
		}		
		//rows = arr2D.length
		//columns = arr2D[i].length length of the array within the row
		
	}



}
