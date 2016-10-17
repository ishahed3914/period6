package arrays;

public class arrayClasswork {

	public static void main(String[] args) {
		populateArray();
		randomArray();
	}
	public static void populateArray(){
		int[] array = new int[50];
		for(int i = 0; i < array.length; i++){
			array[i] = (i+1);
			System.out.println(array[i]);
		}
	}
	public static void randomArray(){
		int random = (int)(100*Math.random());
		int[] array = new int[random];
		for(int i = 0; i < array.length; i++){
			array[i] = (i+1);
			System.out.println(array[i]);
		}
	}
	public static void diceArray(){
		
	}
	


}

