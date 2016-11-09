package caveExplorer;
import java.util.Scanner;
import java.util.Arrays;

public class twoDArrayIntro {

	public static String[][] arr2D;
	public static String[][] pic;
	public static int i;
	public static int j;
	public static Scanner in;
	
	private static Scanner scanner;
	public static void main(String[] args){
		//rows, columns
//		arr2D = new String[4][5];
//		pic = new String[5][4];
//		//iterate row by row
//		for(int row = 0; row < arr2D.length; row++){
//			//in each row, go col by col
//			for(int col = 0; col < arr2D[row].length; col++){
//				arr2D[row][col] = "("+row+","+col+")";
//			}
//		}
//		//start positions
//		i=2;
//		j=3;
//		in = new Scanner(System.in);
//		startExploring();
		scanner = new Scanner(System.in);

		int roomsY = 7, roomsX = 5;
		int x = 0, y = 0;

		while (true) {
			System.out.println("You are in room " + x + " " + y + ". Which way do you want to go? Enter:");
			System.out.println("w, a, s, d");
			print(roomsY, roomsX, y, x);
			String input = scanner.nextLine();

			if (input.equals("w") && y + 1 < roomsY) {
				y++;
			} else if (input.equals("a") && x > 0) {
				x--;
			} else if (input.equals("s") && y > 0) {
				y--;
			} else if (input.equals("d") && x + 1 < roomsX) {
				x++;
			}
		}
	}
//
//	private static void startExploring() {
//		while(true){
//			System.out.println("You are in room "+arr2D[i][j]);
//			System.out.println("What do you want to do?");
//			String input = in.nextLine();
//			while(!isValid(input)){
//				System.out.println("Please enter w, a, s, or d");
//				input = in.nextLine();
//			}
//			interpretInput(input.toLowerCase());
//		}
//
//	}
//
//	private static void interpretInput(String input) {
//		int iOrig = i;
//		int jOrig = j;
//		if(input.equals("w") && i > 0)i--;
//		else if(input.equals("a") && j > 0)j--;
//		else if(input.equals("s") && i+1 < arr2D.length)i++;
//		else if(input.equals("d") && j+1 < arr2D[0].length)j++;
//		if(iOrig == i && jOrig == j){
//			System.out.println("You are at the edge of the universe. You can move no farther in"
//					+ "that direction");
//		}
//
//	}
//	private static boolean isValid(String input) {
//		String lc = input.toLowerCase();
//		String [] keys = {"w", "a", "s", "d"};
//		for(String key: keys){
//			if(key.equals(lc))return true;
//		}
//		return false;
//	}
	public static void print(int roomsX, int roomsY, int posX, int posY) {
		for (int j = 0; j != roomsX; j++) {
			System.out.print("____");
		}
		System.out.println();

		for (int i = 0; i != roomsY; i++) {
			for (int j = 3; j > 0; j--) {
				for (int k = 0; k != roomsX; k++) {
					if (j == 1) {
						System.out.print("|___");
					} else {
						if (j == 2 && i == posX && k == posY) {
							System.out.print("| X ");
						} else {
							System.out.print("|   ");
						}
					}
				}
				System.out.println("|");
			}
		}
	}
}
