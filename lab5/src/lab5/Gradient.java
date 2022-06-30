//Basak Cavusdag 201711014 - section:4
package lab5;

import java.awt.*;
import java.awt.geom.*;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.geom.Rectangle2D;

public class Gradient extends Frame {
	// Constructor
	public Gradient() {
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	public void paint(Graphics g) {
		// A square to be filled by color interpolation without repetition.
		// Choose two colors you like for the gradient paint.
		// The first gradient should be parallel to the diagonal of the
		// square to be filled. The color gradient is not repeated so that the
		// the upper left part of the square is one color and the lower right part is
		// the other.
		// A second square to be filled by repeated color interpolation.
		// The color gradient is defined in the same way as for the first square.
		// Choose two different colors that you like.
		// However, this time the color gradient is applied repeatedly.
		Graphics2D g2d = (Graphics2D) g;
		Color color1 = Color.magenta;
		Color color2 = Color.cyan;

		GradientPaint gradientPaint1 = new GradientPaint(70, 5, color1, 400, 100, color2);
		g2d.setPaint(gradientPaint1);
		g2d.fill(new Rectangle2D.Double(0, 0, 350, 400));

		int n_rows = 10;
		int x = 350;
		int y = 0;
		float color_step = (float) (1.0 / n_rows);
		int y_step = this.getHeight() / n_rows;
		int height = y_step;
		for (int i = 0; i < n_rows; i++) {
			float val = (n_rows - 1 - i) * color_step;
			Color col = new Color(val, val, val);
			g2d.setColor(col);
			g2d.fill(new Rectangle2D.Double(x, y, 350, height));
			y += y_step;
		}
		/*int n_rows = 10;
		GradientPaint gp1 = new GradientPaint(15, 15, Color.gray, 40, 40, Color.black, true);  
		g2d.setPaint(gp1);  
		g2d.fill(new Rectangle2D.Double(350, 0, 350, 400));*/

	}

	public static void main(String[] args) {
		Gradient f = new Gradient();
		f.setTitle("Gradient");
		f.setSize(700, 400);
		f.setVisible(true);
	}
}