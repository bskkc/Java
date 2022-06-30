//Basak Cavusdag 201711014 - section: 4
package lab6;

import java.awt.*;
import java.awt.event.*;

public class Transformations extends Frame implements ActionListener, MouseListener {

	// Initialize coordinates of the triangle
	int[] x = { 500, 700, 600 };
	int[] y = { 300, 300, 100 };
	int a = 500;
	int b = 700;
	int c = 600;
	int a1 = 300;
	int b1 = 100;

	public static void main(String[] args) {
		// Set Frame size to 800x800)
		// Set background color
		// Set visibility
		Transformations t = new Transformations();
		t.setSize(800, 800);
		t.setVisible(true);
		t.setBackground(Color.getHSBColor(0.8f, 0.2f, 0.9f));

	}

	public class MyFinishWindow extends WindowAdapter {
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}

	public Transformations() {
		// Set title
		// Create menu
		// Add WindowListener to exit the program when window is closed
		// Set layout
		// Add control panel
		// Add buttons
		setTitle("Transformations");
		MenuBar menu_bar = new MenuBar();

		Menu def = new Menu("File");
		def.add(new MenuItem("Set Default"));
		def.addActionListener(this);
		menu_bar.add(def);
		setMenuBar(menu_bar);
		Panel panel = new Panel();
		panel.setBounds(0, 50, 800, 40);
		Button button_up = new Button();
		button_up.setLabel("Translate Up");
		button_up.addActionListener(this);
		Button button_down = new Button();
		button_down.addActionListener(this);
		button_down.setLabel("Translate Down");
		Button button_right = new Button();
		button_right.setLabel("Translate Right");
		button_right.addActionListener(this);
		Button button_left = new Button();
		button_left.setLabel("Translate Left");
		button_left.addActionListener(this);
		Button button_x = new Button();
		button_x.setLabel("Reflect X");
		button_x.addActionListener(this);
		Button button_y = new Button();
		button_y.setLabel("Reflect Y");
		button_y.addActionListener(this);

		panel.add(button_up);
		panel.add(button_down);
		panel.add(button_right);
		panel.add(button_left);
		panel.add(button_x);
		panel.add(button_y);

		panel.setBackground(Color.black);
		add(panel);
		setLayout(null);
		addWindowListener(new MyFinishWindow());
		addMouseListener(this);
	}

	// Draw 2 lines and paint 1 filled triangle
	public void paint(Graphics g) {
		Graphics2D g1 = (Graphics2D) g;
		g1.setColor(Color.gray);
		g1.drawLine(400, 0, 400, 800);
		g1.drawLine(0, 400, 800, 400);
		int[] x = { a, b, c };
		int[] y = { a1, a1, b1 };
		g1.fillPolygon(x, y, 3);
	}

	// Action listener
	public void actionPerformed(ActionEvent evt) {
		String str = evt.getActionCommand();
		if (str.equals("Set Default")) {
			a = 500;
			b = 700;
			c = 600;
			a1 = 300;
			b1 = 100;
			repaint();
		} else if (str.equals("Translate Up")) {
			a1 -= 20;
			b1 -= 20;
			repaint();
		} else if (str.equals("Translate Down")) {
			a1 += 20;
			b1 += 20;
			repaint();
		}

		else if (str.equals("Translate Right")) {
			a += 20;
			b += 20;
			c += 20;
			repaint();

		} else if (str.equals("Translate Left")) {
			a -= 20;
			b -= 20;
			c -= 20;
			repaint();

		} else if (str.equals("Reflect X")) {
			if (a1 < 400 && b1 < 400) {
				int hold;
				b1 = b1 + 400;
				a1 = a1 + 400;
				hold = b1;
				b1 = a1;
				a1 = hold;

			} else {
				int hold;
				b1 = b1 - 400;
				a1 = a1 - 400;
				hold = b1;
				b1 = a1;
				a1 = hold;

			}
			repaint();

		} else if (str.equals("Reflect Y")) {
			if (a < 400 && b < 400 && c < 400) {

				a = a + 400;
				b = b + 400;
				c = c + 400;
			} else {
				a = a - 400;
				b = b - 400;
				c = c - 400;

			}
			repaint();

		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}