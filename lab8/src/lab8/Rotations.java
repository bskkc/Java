package lab8;
import java.awt.*; 
import java.awt.event.*;


public class Rotations extends Frame implements ActionListener, MouseListener { 
 
 // Initialize coordinates of the rectangle 
 int[] x = {500,700,700,500}; 
 int[] y = {300,300,200,200};
	int a = 500;
	int b = 700;
	int c = 700;
	int d = 500;
	int a1 = 300;
	int b1 = 200;
 
 public static void main(String[] args) { 
 // Set Frame size to 800x800 
 // Set background color 
 // Set visibility 
	 Rotations t = new Rotations();
		t.setSize(800, 800);
		t.setVisible(true);
		t.setBackground(Color.getHSBColor(0.4f, 0.3f, 0.9f));
 } 
 
 public class MyFinishWindow extends WindowAdapter {
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}

	public Rotations() {
		// Set title
		// Create menu
		// Add WindowListener to exit the program when window is closed
		// Set layout
		// Add control panel
		// Add buttons
		setTitle("Rotations");
		MenuBar menu_bar = new MenuBar();

		Menu def = new Menu("File");
		def.add(new MenuItem("Set Default"));
		def.addActionListener(this);
		menu_bar.add(def);
		setMenuBar(menu_bar);
		Panel panel = new Panel();
		panel.setBounds(0, 50, 800, 40);
		Button button_up = new Button();
		button_up.setLabel("Left Bottom - Clockwise");
		button_up.addActionListener(this);
		Button button_down = new Button();
		button_down.addActionListener(this);
		button_down.setLabel("Origin - Clockwise");
		Button button_right = new Button();
		button_right.setLabel("Origin - C.Clockwise");
		button_right.addActionListener(this);

		panel.add(button_up);
		panel.add(button_down);
		panel.add(button_right);
		
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
			a = 500;
			b = 700;
			c = 700;
			d = 500;
			a1 = 300;
			b1 = 200;
			repaint();
		} 
		else if (str.equals("Left Bottom - Clockwise")) {
			a = 500;
			b = 700;
			c = 700;
			d = 500;
			if (a1 < 400 && b1 < 400) {
				int hold;
				b1 = b1 + 200;
				hold = b1;
				b1 = a1;
				a1 = hold;

			} else {
				int hold;
				b1 = b1 - 200;
				hold = b1;
				b1 = a1;
				a1 = hold;

			}
			repaint();
		}
			else if (str.equals("Origin - Clockwise")) {
			if (a1 < 400 && b1 < 400 || a < 400 && b < 400 && c < 400) {
				int hold;
				b1 = b1 + 400;
				a1 = a1 + 400;
				hold = b1;
				b1 = a1;
				a1 = hold;
				a = a + 400;
				b = b + 400;
				c = c + 400;
			} 
			else {
				int hold;
				b1 = b1 - 400;
				a1 = a1 - 400;
				hold = b1;
				b1 = a1;
				a1 = hold;
				a = a - 400;
				b = b - 400;
				c = c - 400;
			}
			a = 500;
			b = 700;
			c = 700;
			d = 500;
			repaint();

		}
			else if (str.equals("Origin - C.Clockwise")) {
				if (a < 400 && b < 400 && c < 400) {

					a = a + 400;
					b = b + 400;
					c = c + 400;
				} else {
					a = a - 400;
					b = b - 400;
					c = c - 400;

				}}
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