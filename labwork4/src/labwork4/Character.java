package labwork4;

public class Character {
	private String name;
	private int age;
	private int lifeSpan;
	private String habitat;
	  
	public Character( String name, int age, int lifeSpan, String habitat ) {
	this.name = name;
	this.age = age;
	this.lifeSpan = lifeSpan;
	this.habitat = habitat;
	}
	  
	// Getter
	public String getName() {
	return this.name;
	}
	public int getAge() {
	return this.age;
	}
	public int getLifeSpan() {
	return this.lifeSpan;
	}
	  
	public String getHabitat() {
	return this.habitat;
	}
	  
	// Setter
	public void setHabitat(String h) {
	this.habitat = h;
	}
	  
	public void setName(String n) {
	this.name = n;
	}
	public void setAge(int a) {
	this.age = a;
	}
	public void setLifeSpan(int l) {
	this.lifeSpan = l;
	}

	  
	public void printInfo() {
	System.out.println("I am just a character.");
	}
	  
	public void quote() {
	System.out.println("I said i am just a character.");
	}
	public static void main(String[] args) {
		// TODO code application logic here
		Character c = new Character("character", 23, 23, "world");
		c.printInfo();
		System.out.println();
		c.quote();
		System.out.println();
		  
		System.out.println("***********************************************");
		  
		Gaint tiny = new Gaint("Kate", 15, 25000, 10);
		tiny.printInfo();
		System.out.println();
		tiny.quote();
		System.out.println();
		  
		System.out.println("***********************************************");

		  
		Dragon horror = new Dragon("Fire", 10, true, true);
		horror.printInfo();
		System.out.println();
		horror.quote();
		System.out.println();
		  
		System.out.println("***********************************************");
		  
		Elf el = new Elf("Steven", 14, 500, "axe", true);
		el.printInfo();
		System.out.println();
		el.quote();
		System.out.println();
		}
		  
}