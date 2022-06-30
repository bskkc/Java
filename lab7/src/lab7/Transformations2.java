//Basak Cavusdag 201711014 - section: 4
package lab7;

import java.awt.*;
import java.awt.event.*;

public class Transformations2 extends Frame implements ActionListener, MouseListener {

	// Initialize coordinates of the triangle
	int[] x = {400,600,600,400};
	int[] y = {400,400,200,200};
	int a = 400;
	int b = 600;
	int c = 600;
	int d = 400;
	int a1 = 400;
	int b1 = 200;

	public static void main(String[] args) {
		// Set Frame size to 800x800)
		// Set background color
		// Set visibility
		Transformations2 t = new Transformations2();
		t.setSize(800, 800);
		t.setVisible(true);
		t.setBackground(Color.getHSBColor(0.55f, 0.2f, 0.9f));

	}

	public class MyFinishWindow extends WindowAdapter {
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}

	public Transformations2() {
		// Set title
		// Create menu
		// Add WindowListener to exit the program when window is closed
		// Set layout
		// Add control panel
		// Add buttons
		setTitle("Transformations2");
		MenuBar menu_bar = new MenuBar();

		Menu def = new Menu("File");
		def.add(new MenuItem("Set Default"));
		def.addActionListener(this);
		menu_bar.add(def);
		setMenuBar(menu_bar);
		Panel panel = new Panel();
		panel.setBounds(0, 50, 800, 40);
		Button button_up = new Button();
		button_up.setLabel("Shear in X");
		button_up.addActionListener(this);
		Button button_down = new Button();
		button_down.addActionListener(this);
		button_down.setLabel("Shear in Y");
		Button button_right = new Button();
		button_right.setLabel("Stretch in X");
		button_right.addActionListener(this);
		Button button_left = new Button();
		button_left.setLabel("Stretch in Y");
		button_left.addActionListener(this);
		Button button_x = new Button();
		button_x.setLabel("Scale Up");
		button_x.addActionListener(this);
		Button button_y = new Button();
		button_y.setLabel("Scale Down");
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
		int[] x = { a, b, c, d };
		int[] y = { a1, a1, b1, b1 };
		g1.fillPolygon(x, y, 4);
	}

	// Action listener
	public void actionPerformed(ActionEvent evt) {
		String str = evt.getActionCommand();
		if (str.equals("Set Default")) {
			a = 400;
			b = 600;
			c = 600;
			d = 400;
			a1 = 400;
			b1 = 200;
			repaint();
		} else if (str.equals("Shear in X")) {
			a = 400;
			b = 600;
			c += 10;
			d += 10;
			repaint();
		} else if (str.equals("Shear in Y")) {
			a = 400;
			b = 600;
			c = 600;
			d = 400;
			a1 -=10;
			b1 -=10;
			repaint();
		}

		else if (str.equals("Stretch in X")) {
			a = 400;
			b += 10;
			c += 10;
			d = 400;
			repaint();

		} else if (str.equals("Stretch in Y")) {
			a = 400;
			b = 600;
			c = 600;
			d = 400;
			a1 = 400;
			b1 -=10;
			repaint();

		} else if (str.equals("Scale Up")) {
			a = 400;
			b += 10;
			c += 10;
			d = 400;
			a1 = 400;
			b1 -=10;
			repaint();

		} else if (str.equals("Scale Down")) {
			a = 400;
			b -= 10;
			c -= 10;
			d = 400;
			a1 = 400;
			b1 +=10;
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