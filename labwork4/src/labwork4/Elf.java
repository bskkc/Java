package labwork4;

public class Elf extends Character{
	private String weapon;
	private int height;
	private boolean ridesGaint;
	  
	public Elf( String name, int age, int height, String weapon, boolean ridesGaint) {
	super(name, age, 15, "Hawai");
	this.height = height;
	this.weapon = weapon;
	this.ridesGaint = ridesGaint;
	}
	  
	public Elf( String name, int age, int height, boolean ridesGaint) {
	super(name, age, 15, "Hawai");
	this.height = height;
	this.weapon = "Spear";
	this.ridesGaint = ridesGaint;
	}
	  
	public String getWeapon(){
	return this.weapon;
	}
	public int getHeight() {
	return this.height;
	}
	  
	public boolean getRidesGaint() {
	return this.ridesGaint;
	}
	public void setRidesGaint(boolean r) {
	this.ridesGaint = r;
	}
	  
	public void setHeight(int h){
	this.height = h;
	}
	public void setWeapon(String w){
	this.weapon = w;
	}
	  
	public void printInfo() {
	System.out.println("This character is " + getName()+ " its current age is " + getAge());
	System.out.println("This character is an Elf and they have a lifespan of " + getLifeSpan() + " years.");
	System.out.println("They usually live in "+ getHabitat() );
	System.out.println("His height is " + getHeight() + " cms." );
	System.out.println();
	if( getRidesGaint() ) {
	System.out.println("He is a Elite Soldier, he rides Gaint in Battle");
	}
	else{
	System.out.println("He uses "+ getWeapon() + " in battle.");
	}
	}
	  
	public void quote() {
	System.out.println("Hi i am "+ getName() + " the Elf.");
	System.out.println("We live in Hawai.");

	}
}
