
package arrayListTest;

import java.util.ArrayList;

public class ListRunner {
	static ArrayList<Item> shoppingList;

	public static void main(String[] args) {
		String[] justDescription = getDescription();
		initList(justDescription);
		doSomeShopping();
		printPurchasedItems();

	}

	private static void printPurchasedItems() {
		for (int i = 0; i < shoppingList.size(); i++) {
			if (shoppingList.get(i).isPurchased()) {
				System.out.println("Bought" + shoppingList.get(i).getDescription());
				shoppingList.remove(i);
				i--;
			}
		}

	}

	private static void doSomeShopping() {
		shoppingList.get(0).setPurchased(true);
		shoppingList.get(0).setPurchased(true);

	}

	private static void initList(String[] justDescription) {
		shoppingList = new ArrayList<Item>();
		for (String s : justDescription) {
			shoppingList.add(new Item(s));
		}
		// another way
		// for(int i = 0; i < justDescription.length; i++){
		// shoppingList.add(new Item(justDescription[i]));
		// }

	}

	private static String[] getDescription() {
		String[] test = { "Clothes", "Dryer", "Shampoo", "Pokeballs" };
		return test;
	}

}
