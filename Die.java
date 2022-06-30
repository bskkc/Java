package denemekodlama;
import java.lang.Math;

public class Die {
	private int sides;
	private int result;
	// Default constructor
	public Die() {
		this.sides = 6;
		this.result = 1;
	}
	// Create a Die with numberOfSides sides
	// Give an error message if numberOfSides < 0
	public Die(int numberOfSides) {
		if(numberOfSides <=0)
			System.out.println("Error");
		else
		{
			sides = numberOfSides;
			this.result = 1;
		}
	}
	// Roll this Die. Every side has an equal chance of being the new result
	// Return the current result of the Die after the roll
	public int roll() {
		int x;
		x=(int)Math.random()*sides+1;
		return x;
	}

	// Return how many sides this Die has
	public int getSides() {
		return this.sides;
	}

	// Return the current result or top number of this Die
	public int getResult() {
		return this.result;
	}

	// Set the current result or top number of this Die to the given parameter
	public void setResult(int res) {
		this.result = res;
	}

	// Return the probability of the result that is passed as parameter to be rolled
	public double probability(int result) {
		if(this.sides < result)
			return 0;
		else
			return 1.0/this.sides;
	}

	// Returns true if this Die and the parameter otherObj have equal number of
	// sides and their current results are the same
	public boolean equals(Die otherObj) {
		if(this.sides == otherObj.sides && this.result == otherObj.result)
			return true;
		else
			return false;
	}

	// Return A String that contains the number of sides and current result of this Die
	public String toString() {
		String x = "Side: "+ this.sides + " Result: "+this.result;
		return x;	
	}
	// Write your main function similar to the sample output
	public static void main (String args[]){
		Die die = new Die();

		System.out.println(die.toString());

		Die die2 = new Die(10);

		System.out.println(die2.getResult());
		System.out.println(die2.getSides());
		System.out.println(die2.roll());
		System.out.println(die2.probability(5));
		System.out.println(die2.equals(die));
	}
}