//Basak Cavusdag 201711014 - section: 4
package lab9;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.GeneralPath;
import java.awt.geom.Point2D;
import java.awt.geom.Point2D.Float;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Animate extends JPanel implements ActionListener {
	Timer timer;
	
	private double sign;
	// Point array for drawing a star
	private final double points[][] = { { 0, 85 }, { 75, 75 }, { 100, 10 }, { 125, 75 }, { 200, 85 }, { 150, 125 },
			{ 160, 190 }, { 100, 150 }, { 40, 190 }, { 50, 125 }, { 0, 85 } };

	// Variables to change size of the star
	private double scale = 1;
	private double delta = 0.01;

	// Constructor
	public Animate() {
		timer = new Timer(10, this);
		timer.setInitialDelay(190);
		timer.start();
	}

	public void paint(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.BLUE);
		g2d.fillRect(0, 0, this.getWidth(), this.getHeight());
		GeneralPath path = new GeneralPath();
		path.moveTo(points[0][0], points[0][1]);
		for (int k = 1; k < points.length; k++)
			path.lineTo(points[k][0], points[k][1]);
		g2d.setColor(Color.yellow);
		g2d.fill(path);
		g2d.rotate(sign);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.setTitle("Shooting Star");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(new Animate());
		f.setSize(400, 400);
		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		scale += sign * delta;
		if (scale < 0.01) {
			sign = -sign;
			scale = delta;
		} else if (scale > 0.99) {
			sign = -sign;
			scale = 1.0;
		}
		repaint();
	}

}
