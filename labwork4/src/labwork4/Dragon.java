package labwork4;

class Dragon extends Character{
	private boolean canFly = false; 
	private boolean canBreateFire = false;
	private int elvesEaten = 0;
	  
	public Dragon( String name, int age, boolean canFly, boolean canBreateFire ) {
	super(name,age, 30, "Volcano");
	this.canFly = canFly;
	this.canBreateFire = canBreateFire;
	}
	  
	public Dragon( String name, int age, int elvesEaten) {
	super(name, age, 30, "Volcano");
	this.elvesEaten = elvesEaten;
	}
	  
	public boolean getCanFly() {
	return this.canFly;
	}
	public int getElvesEaten() {
	return this.elvesEaten;
	}
	public boolean getCanBreateFire(){
	return this.canBreateFire;
	}
	  
	public void setCanFly(boolean f) {
	this.canFly = f;
	}
	public void setElvesEaten(int e) {
	this.elvesEaten = e;
	}
	public void setCanBreateFire(boolean f) {
	this.canBreateFire = f;
	}
	  
	public void printInfo() {
	System.out.println("This character is a Dragon and they have a lifespan of " + getLifeSpan() + " years.");
	System.out.println("His name is " + getName() );
	System.out.println("He is " + getAge() + " years old");
	System.out.println("He lives in "+ getHabitat() );
	System.out.println();
	if( getCanBreateFire() && getCanFly() ) {
	System.out.println("He is a War Dragon.");
	  
	}
	else{
	System.out.println("He cant Fly or breate Fire");
	}
	System.out.println("He has Eaten " + this.elvesEaten + " Elves");
	}
	  
	public void quote() {
	System.out.println("Hi i am "+ getName() + " the Dragon.");
	System.out.println("We live in volcano.");
	}
}