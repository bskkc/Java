//Basak Cavusdag 201711014 / section:4

package c1711014;

public class rectangle {
	 private int x; // x coordinate of left-bottom corner 
	 private int y; // y coordinate of left-bottom corner 
	 private int width;
	 private int height;

	 // constructs a rectangle with given parameters 
	 public rectangle(int x, int y, int width, int height) {
		 this.x=x;
		 this.y=y;
		 this.width=width;
		 this.height=height;
	 }

	 // constructs a rectangle which has left-bottom corner on the origin (0,0) with given width and height 
	 public rectangle(int width, int height) {
		 this.width=width;
		 this.height=height;
	 }

	 // returns left-bottom corner's x coordinate 
	 public int getX() {
		 return x;
	 }

	// returns left-bottom corner's y coordinate 
	 public int getY() {
		 return y;

	 }

	 // returns width of the rectangle
	 public int getWidth() {
		 return width;

	 }

	 // returns height of the rectangle
	 public int getHeight() {
		 return height;

	 }

	 // changes the width, height and coordinates of the rectangle according to passed values
	 public void reshape(int x, int y, int width, int height) {
		 this.x=x;
		 this.y=y;
		 this.width=width;
		 this.height=height;
	 }
	
	 // changes the width and height of the rectangle according to passed values
	 public void resize(int width, int height) {
		 this.width=width;
		 this.height=height;
	 }

	 // changes the coordinates of the rectangle according to passed values 
	 public void setLocation(int px, int py) {
		 x=px;
		 y=py;
	 }


	 // prints the coordinates of the left-bottom corner's coordinates (x,y) 
	 public void printLocation() {
		 System.out.println("("+x+", "+y+")");
	 }

	 // prints the coordinates of every corner 
	 public void printCoordinates() {
		 System.out.println("("+x+", "+y+")"+"("+(x+width)+", "+(y+height)+")");
	 }

	 // translates the rectangle and changes the coordinates according to passed values 
	 public void translate(int dx, int dy) {
		 x+=dx;
		 y+=dy;
	 }

	 // rotates the rectangle 90 degrees clockwise around its left-bottom corner
	 public void rotateClockwise() {
		 int temp=height;
		 height=width;
		 width=temp;
		 y-=width-(width-height);
	 }

	 // rotates the rectangle 90 degrees counter-clockwise around its left-bottom corner 
	 public void rotateCounterClockwise() {
		 int temp=height;
		 height=width;
		 width=+temp;
		 x-=height-(height-width);
	 }

	 // returns true if a given point is inside or on the rectangular area else returns false
	 public boolean contains(int x, int y) {
		 if (x >= this.x && x <= this.x+width && y >= this.y && y <= this.y+height) 
			 return true;
		 return false;
	 }

	 // contains your function calls
	 public static void main(String args[]) {
		        rectangle r1=new rectangle(0,0,5,6);
		        System.out.println("Rectangle 1:");
		        System.out.println("Left-Bottom: ("+r1.getX()+", "+r1.getY()+")");
		        System.out.println("Left-Top: ("+r1.getX()+", "+(r1.getY()+r1.getHeight())+")");
		        System.out.println("Right-Top: ("+(r1.getX()+r1.getWidth())+", "+(r1.getY()+r1.getHeight())+")");
		        System.out.println("Right-Bottom: ("+(r1.getX()+r1.getWidth())+", "+r1.getY()+")");
		        
		        r1.rotateClockwise();
		        System.out.println("Rectangle 1 rotated clockwise:");
		        System.out.println("Left-Bottom: ("+r1.getX()+", "+r1.getY()+")");
		        System.out.println("Left-Top: ("+r1.getX()+", "+(r1.getY()+r1.getHeight())+")");
		        System.out.println("Right-Top: ("+(r1.getX()+r1.getWidth())+", "+(r1.getY()+r1.getHeight())+")");
		        System.out.println("Right-Bottom: ("+(r1.getX()+r1.getWidth())+", "+r1.getY()+")");
		        
		        r1.rotateCounterClockwise();
		        System.out.println("Rectangle 1 rotated counter-clockwise:");
		        System.out.println("Left-Bottom: ("+r1.getX()+", "+r1.getY()+")");
		        System.out.println("Left-Top: ("+r1.getX()+", "+(r1.getY()+r1.getHeight())+")");
		        System.out.println("Right-Top: ("+(r1.getX()+r1.getWidth())+", "+(r1.getY()+r1.getHeight())+")");
		        System.out.println("Right-Bottom: ("+(r1.getX()+r1.getWidth())+", "+r1.getY()+")");

		        rectangle r2=new rectangle(3,5,2,2);
		        System.out.println("Rectangle 2:");
		        System.out.println("Left-Bottom: ("+r2.getX()+", "+r2.getY()+")");
		        System.out.println("Left-Top: ("+r2.getX()+", "+(r2.getY()+r2.getHeight())+")");
		        System.out.println("Right-Top: ("+(r2.getX()+r2.getWidth())+", "+(r2.getY()+r2.getHeight())+")");
		        System.out.println("Right-Bottom: ("+(r2.getX()+r2.getWidth())+", "+r2.getY()+")");

		        r2.translate(6,0);
		        System.out.println("Rectangle 2: translated 6 units to the right");
		        System.out.println("Left-Bottom: ("+r2.getX()+", "+r2.getY()+")");
		        System.out.println("Left-Top: ("+r2.getX()+", "+(r2.getY()+r2.getHeight())+")");
		        System.out.println("Right-Top: ("+(r2.getX()+r2.getWidth())+", "+(r2.getY()+r2.getHeight())+")");
		        System.out.println("Right-Bottom: ("+(r2.getX()+r2.getWidth())+", "+r2.getY()+")");


		        if(r2.getX()<=10 && r2.getX()+r2.getWidth()>=10){
		            if(r2.getY()<=6 && r2.getY()+r2.getHeight()>=6)
		            {
		                System.out.println("True, rectangle contains (10,6)");
		            }
		        }
		        else
		        {
		            System.out.println("False, rectangle is not contains (10,6)");
		        }
		    }
}
