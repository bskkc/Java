//Basak Cavusdag 201711014 - section: 4
package c1711014;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.MouseEvent;
import java.awt.event.*; 


public class AWTDemo extends Frame implements ActionListener,MouseListener {
	int x = 100;
	int y = 100;

	public static void main(String[] args) {
		AWTDemo f = new AWTDemo();
		f.setTitle("Labwork 3" + "" + "");
		f.setSize(500, 500);
		f.setVisible(true);
	}

//Two types of constructors selected by the integer passed
//First one is for Lab3A second one is for Lab 3B
	public AWTDemo(int a) {
		if (a == 1) {
			setTitle("Lab 3A");

			addWindowListener(new MyFinishWindow());

		} else if (a == 2) {
			setTitle("Lab 3B");
			// create menu
			// end program when window is closed
			// mouse event handler
			addWindowListener(new MyFinishWindow());
			addMouseListener(this);
			MenuBar menu_bar = new MenuBar();
			Menu menu = new Menu("File");
			MenuItem exit = new MenuItem("Exit");
			menu.add(exit);
			exit.addActionListener(this);
			menu_bar.add(menu);
			setMenuBar(menu_bar);
		}
	}

	public AWTDemo() {
		// TODO Auto-generated constructor stub
		addWindowListener(new MyFinishWindow());
	}

	public void paint(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		int radius = this.getHeight() / 7;
		int x;
		int y;
		x = this.getWidth() / 2;
		y = radius;
		g2d.drawOval(x - radius, y - radius, 2 * radius, 2 * radius);
		y += 3 * radius;
		g2d.drawOval(x - radius, y - 2 * radius, 4 * radius, 4 * radius);
	}

	public void actionPerformed(ActionEvent ev) {
		String str = ev.getActionCommand();
		if (str.equals("Exit")) {
			System.exit(0);
		}
	}

	public class MyFinishWindow extends WindowAdapter {
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		int x = e.getX();
		int y = e.getY();
		repaint();
	}

}
