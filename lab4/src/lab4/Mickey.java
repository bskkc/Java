//Basak Cavusdag 201711014 - section: 4
package lab4;

import java.awt.*;
import java.awt.event.*;

public class Mickey extends Frame implements ActionListener {
	int x = 250;
	int y = 300;
	int dx = 300;
	int dy = 300;
	static final int windowWidth = 800;
	static final int windowHeight = 800;

	public static void main(String[] args) {
		Mickey f = new Mickey();
		f.setSize(800, 800);
		f.setVisible(true);
		f.setBackground(Color.red);
	}

	public Mickey() {
		setTitle("Mickey");
		// create menu
		// end program when window is closed
		// add mouse event handler
		// set layout
		// add control panel
		// add buttons
		MenuBar menu_bar = new MenuBar();

		Menu def = new Menu("File");
		def.add(new MenuItem("Set Default"));
		def.addActionListener(this);
		menu_bar.add(def);
		setMenuBar(menu_bar);
		Panel panel = new Panel();
		panel.setBounds(0, 50, windowWidth, 50);
		Button button_s = new Button();
		button_s.setLabel("Smaller");
		button_s.addActionListener(this);
		Button button_b = new Button();
		button_b.addActionListener(this);
		button_b.setLabel("Bigger");

		panel.add(button_s);
		panel.add(button_b);

		panel.setBackground(Color.black);
		add(panel);
		setLayout(null);
		addWindowListener(new MyFinishWindow());
		addMouseListener(new MouseListener() {
			public void mouseEntered(MouseEvent evt) {
			}

			public void mouseExited(MouseEvent evt) {
			}

			public void mousePressed(MouseEvent evt) {
			}

			public void mouseReleased(MouseEvent evt) {
			}

			public void mouseClicked(MouseEvent evt) {
				int x = evt.getX();
				int y = evt.getY();
				repaint();
			}
		});

	}

	public class MyFinishWindow extends WindowAdapter {
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}

	public void paint(Graphics g) {
		g.fillOval(x, y, dy, dx);
		g.fillOval(x - 50, y - 50, dy / 2, dx / 2);
		g.fillOval(x + 200, y - 50, dy / 2, dx / 2);
		g.setColor(Color.black);
	}

	public void actionPerformed(ActionEvent evt) {
		// get command
		Graphics g = getGraphics();
		String command = evt.getActionCommand();
		if (command == "Smaller") {
			int sx = x + 1;
			int sy = y + 1;
			g.fillOval(x, y, dx - 1, dy - 1);
			g.fillOval(sx - 50, sy - 50, (dx / 2) - 1, (dy / 2) - 1);
			g.fillOval(sx + 200, sy - 50, (dx / 2) - 1, (dy / 2) - 1);
			update(g);
		} else if (command == "Bigger") {
			int bx = x - 1;
			int by = y - 1;
			g.fillOval(x, y, dx + 1, dy + 1);
			g.fillOval(bx - 50, by - 50, (dx / 2) + 1, (dy / 2) + 1);
			g.fillOval(bx + 200, by - 50, (dx / 2) + 1, (dy / 2) + 1);
			update(g);
		} else if (command == "Set Default") {
			repaint();
		}
	}
}
