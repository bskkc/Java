//Basak Cavusdag
//201711014

package stddraw;
import java.util.*;
import java.awt.Color;
import stddraw.StdDraw;

import java.awt.Color;
import java.util.Random;

public class Rubik {
    Color[] colors = new Color[5];
    Color[] currentColors = new Color[4];

    public Rubik() {
        StdDraw.setCanvasSize(500, 500);
        colors[0]=StdDraw.PINK;
        colors[1]=StdDraw.BLUE;
        colors[2]=StdDraw.RED;
        colors[3]=StdDraw.CYAN;
        colors[4]=StdDraw.ORANGE;

        currentColors[0]=randomColor();
        StdDraw.setPenColor(currentColors[0]);
        StdDraw.filledSquare(0.25, 0.25, 0.25);
        currentColors[1]=randomColor();
        StdDraw.setPenColor(currentColors[1]);
        StdDraw.filledSquare(0.75, 0.25, 0.25);
        currentColors[2]=randomColor();
        StdDraw.setPenColor(currentColors[2]);
        StdDraw.filledSquare(0.25, 0.75, 0.25);
        currentColors[3]=randomColor();
        StdDraw.setPenColor(currentColors[3]);
        StdDraw.filledSquare(0.75, 0.75, 0.25);

// Pick random 4 colors with the method you have written
// Change the currentColors array accordingly with these colors
// Set the colors for filling the squares and call the filledSquare method
    }

    // Main method should exactly be this
    public static void main(String[] args) {
        Rubik r = new Rubik();
        r.play();
    }

    // Randomly chooses and returns a Color from your colors[] array
    public Color randomColor() {

        Random random = new Random();
        int m = random.nextInt(5);
        return colors[m];
    }

    // Returns true if all 4 squares have the same color, otherwise false
    public boolean match(Color rand1, Color rand2, Color rand3, Color rand4) {

        boolean situation1 = rand1.equals(rand2);
        boolean situation2 = rand2.equals(rand3);
        boolean situation3 = rand3.equals(rand4);

        if(situation1==true && situation2==true && situation3==true){
            return true;
        }
        else{
            return false;
        }
    }

    // implements the game mechanism, while all squares do not have the same color lets the
// user press squares to change their colors.
// When all the squares have matching colors displays a text that says “You won!”
    public void play() {

        while(!match(currentColors[0],currentColors[1],currentColors[2],currentColors[3]))
        {
            if(StdDraw.isMousePressed())
            {
                int a=whichSquare(mouseLocation());
                changeColor(a);
            }
        }
        StdDraw.text(0.5, 0.5, "YOU WON");
        StdDraw.show();
    }

    public double[] mouseLocation() {

        double []locations = new double[2];
        locations[0] = StdDraw.mouseX();
        locations[1] = StdDraw.mouseY();
        return locations;
    }

    // Finds and returns the square which the mouse location resides in
    public int whichSquare(double[] mouseLoc) {
        if(mouseLoc[1]<0.5 && mouseLoc[0]<0.5)
            return 0;
        else if(mouseLoc[1]<0.5 && mouseLoc[0]>=0.5)
            return 1;
        else if(mouseLoc[1]>=0.5 && mouseLoc[0]<0.5)
            return 2;
        else
            return 3;
    }

    // Takes the square which the user has clicked and changes the color of that square randomly
    public void changeColor(int whichSquare) {
        currentColors[whichSquare]=randomColor();
        StdDraw.setPenColor(currentColors[0]);
        StdDraw.filledSquare(0.25, 0.25, 0.25);
        StdDraw.setPenColor(currentColors[1]);
        StdDraw.filledSquare(0.75, 0.25, 0.25);
        StdDraw.setPenColor(currentColors[2]);
        StdDraw.filledSquare(0.25, 0.75, 0.25);
        StdDraw.setPenColor(currentColors[3]);
        StdDraw.filledSquare(0.75, 0.75, 0.25);
        StdDraw.show();
    }
}