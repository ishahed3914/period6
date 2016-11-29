package sort;

public class Pokemon {
	private int level;
	private int hp;
	private String name;
	boolean  poisoned;
	public Pokemon(String name, int level){
		hp = 100;
		this.name = name;
		this.level = level;
		this.poisoned = false;
	}//
	public void attack(Pokemon target, Attack attack){
		
	}
	public void iChooseYou(){
		System.out.println(name);
		System.out.println(name);

	}
}
