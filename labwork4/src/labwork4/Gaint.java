package labwork4;

class Gaint extends Character{
	private int height; 
	private boolean warGiant;
	private int personCrampled = 0;
	  
	public Gaint( String name, int age, int height, int personCrampled ) {
	super(name,age, 100, "clouds");
	this.height = height;
	this.warGiant = true;
	this.personCrampled = personCrampled;
	}
	  
	public Gaint( String name, int age, int height) {
	super(name,age, 100, "clouds");
	this.height = height;
	this.warGiant = false;
	}
	  
	public int getHeight() {
	return this.height;
	}
	public int getPersonCrampled() {
	return this.personCrampled;
	}
	  
	public void setHeight(int h){
	this.height = h;
	}
	public void setpersonCrampled(int c) {
	this.personCrampled = c;
	}
	  
	public void printInfo() {
	System.out.println("This character is a Gaint and they have a lifespan of " + getLifeSpan() + " years.");
	System.out.println("His name is " + getName() );
	System.out.println("He is " + getAge() + " years old");
	System.out.println("He lives in "+ getHabitat() );
	System.out.println("He is " + getHeight() + " cms tall");
	if( this.warGiant ) {
	System.out.println("He is a War Gaint.");
	System.out.println("He has crampled "+ getPersonCrampled() + " peoples till now! ");
	}
	}
	  
	public void quote() {
	System.out.println("Hi i am "+ getName() + " the Gaint.");
	System.out.println("We live in clouds.");

	}
}
