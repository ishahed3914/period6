/**
 * 
 */
package dataTypes;

import java.util.Scanner;
/**
 * @author IramS
 *
 */
public class StringPractice {

	/**
	 * @param args
	 */
	static Scanner input;
	static String user;
	static boolean inLoop;
	static String response;

	public static void main(String[] args) {
		createAScanner();
		demonstrateStringMethods();
		promptInput();
		talkForever();

	}
	public static void talkForever(){
		inLoop = true;
		while(inLoop){
			print("Greetings," +user + " How are you?");
			response = getInput();
			if(response.indexOf("good") >= 0){
				print("I'm so happy you're good."); 
			}
			else{
				print("Sorry I didn't get you");
			}
		}
	}
	private static void promptInput(){
		print("Hello, human I am a board covered with"
				+ " semiconductors and other such "
				+ "electrical components. "
				+ "What is your name?"
				);
		user = input.nextLine();
		print("Awesome! I will call you " + user+ " until you will terminate me.");
	}
	public static String getInput(){
		return input.nextLine();
	}
	public static void print(String s){
		//create a multi-line String
		String printString = "";
		int cutoff = 35;
		//check to see if there are words to add
		while(s.length() > 0){
			String currentLine = "";
			String nextWord = "";
			//while the current and nextWord are less 
			//than the cutoff, 
			//And there are words to add
			//do the following loop.
			while(currentLine.length() + nextWord.length() <= cutoff && s.length() > 0 ){
				//add the next word to the line
				currentLine += nextWord;
				//remove the word
				s = s.substring(nextWord.length());
				//get the following word
				int endOfWord = s.indexOf(" ");
				//check to see if this is the last word
				if(endOfWord == -1){
					endOfWord = s.length() -1;
				}
				nextWord = s.substring(0, endOfWord + 1);
				
			}
			printString += currentLine + "\n";
		}

		System.out.println(printString);


	}
	public static void createAScanner() {
		input = new Scanner(System.in);

	}
	public static void demonstrateStringMethods(){
		//String text = new String("Hello World");
		String text1 = "Hello World";//same as above
		String text2 = "Hello";//same as above
		String text3 = " World";
		if(text1.equals(text2+text3)){
			System.out.println("These strings are equal.");
		}
		System.out.println(text1);
		System.out.println(text2+ text3);

		String word1 = "Aardvark";
		String word2 = "Zyzzyva";
		if(word1.compareTo(word2) < 0){
			System.out.println("Word1 is before word 2." + "lexicongraphically.");
		}

	}
}
