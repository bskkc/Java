import java.awt.Color;
import java.awt.Font;
import java.util.*;


public class Test{

	Color[] colors = new Color[5];
	Color[] currentColors = new Color[4];
	
	public Test(){
		StdDraw.setCanvasSize(500,500);

		colors[0]=StdDraw.YELLOW;
		colors[1]=StdDraw.BLUE;
		colors[2]=StdDraw.RED;
		colors[3]=StdDraw.GREEN;
		colors[4]=StdDraw.PINK;
		
		// Pick random 4 colors with the method you have written
		// Change the currentColors array accordingly with these colors

		setCurrentColors();

		// Set the colors for filling the squares and call the filledSquare method

		paintSquares();
	}
	
	// Main method should exactly be this
	
	public static void main(String[] args){
		Test r = new Test();
		r.play();
		
	}
	
	public void setCurrentColors(){
		currentColors[0]=randomColor();
		currentColors[1]=randomColor();
		while(currentColors[0]==currentColors[1])
			currentColors[1]=randomColor();
		currentColors[2]=randomColor();
		while(currentColors[0]==currentColors[2] || currentColors[1]==currentColors[2])
			currentColors[2]=randomColor();
		currentColors[3]=randomColor();
		while(currentColors[0]==currentColors[3] || currentColors[1]==currentColors[3] || currentColors[2]==currentColors[3])
			currentColors[3]=randomColor();
			
	}
	
	public void paintSquares(){
		//1.Square Location
		StdDraw.setPenColor(currentColors[0]);
		StdDraw.filledSquare(0.25, 0.25, 0.25);
		//2.Square Location
		StdDraw.setPenColor(currentColors[1]);
		StdDraw.filledSquare(0.75, 0.25, 0.25);
		//3.Square Location
		StdDraw.setPenColor(currentColors[2]);
		StdDraw.filledSquare(0.25, 0.75, 0.25);
		//4.Square Location
		StdDraw.setPenColor(currentColors[3]);
		StdDraw.filledSquare(0.75, 0.75, 0.25);
	}
	
	// Randomly chooses and returns a Color from your colors[] array
	
	public Color randomColor() {
		Random random = new Random();
		int x = random.nextInt(5);
		return colors[x];
	}
	
	public boolean match(Color rand1, Color rand2, Color rand3, Color rand4) {
		if(rand1==rand2 && rand1==rand3 && rand1==rand4) {
			return true;
		}
			return false;
	}
	
	// Implements the game mechanism, while all squares do not have the same color lets the
	// user press squares to change their colors.
	// When all the squares have matching colors displays a text that says “You won!”
	
	public void play() {
		while(!match(currentColors[0],currentColors[1],currentColors[2],currentColors[3])){
			if(StdDraw.isMousePressed()){
				int s=whichSquare(mouseLocation());
				changeColor(s);
				paintSquares();
			}
		}
		
		StdDraw.setPenColor(StdDraw.WHITE);
		StdDraw.setFont(new Font("Impact", Font.PLAIN, 20));
		//btnNewButton.setFont(new Font("Impact", Font.PLAIN, 13));
        StdDraw.text(0.2, 0.2, "You Won!");
        StdDraw.text(0.4, 0.4, "You Won!");
        StdDraw.text(0.6, 0.6, "You Won!");
        StdDraw.text(0.8, 0.8, "You Won!");
	}
	
	// Returns a double array which contains x and y coordinates of the mouse location
	
	public double[] mouseLocation() {
		double [] mLoc=new double[2];
		mLoc[0]=StdDraw.mouseX();
		mLoc[1]=StdDraw.mouseY();
		return mLoc;
	}
	
	// Finds and returns the square which the mouse location resides in
	
	public int whichSquare(double[] mouseLoc) {
		if(mouseLoc[0]<0.5 && mouseLoc[1]<0.5) {
			return 0;	
		}
		else if(mouseLoc[0]>=0.5 && mouseLoc[1]<0.5) {
			return 1;
		}
		else if(mouseLoc[0]<0.5 && mouseLoc[1]>=0.5) {
			return 2;
		}
		else {
			return 3;
		}
	}
	
	// Takes the square which the user has clicked and changes the color of that square randomly
	
	public void changeColor(int whichSquare) {
		currentColors[whichSquare]=randomColor();
		StdDraw.show();
	}
}
