//Basak Cavusdag 201711014 - section: 4
package lab10;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
 
public class Animation {
 
    JFrame frame;
    Timer timer;
 
    public static void main(String[] args) {
    Animation test = new Animation();
    test.go();
    }
 
    public void go() {
    frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(500, 500);
     
    JButton startButton = new JButton("Start");
    startButton.addActionListener(new StartListener());
    JButton stopButton = new JButton("Stop");
        stopButton.addActionListener(new StopListener());
 
    DrawPanel myDraw = new DrawPanel();
 
    frame.getContentPane().add(BorderLayout.CENTER, myDraw);
    frame.getContentPane().add(BorderLayout.NORTH, startButton);
    frame.getContentPane().add(BorderLayout.SOUTH, stopButton);
 
 
    frame.setVisible(true);
 
    timer = new Timer(250, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            frame.repaint();
        }
        });
    }
 
    class StartListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
               
        timer.start();
    }
    }
 
    class StopListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
         
        timer.stop();
    }
    }
     
    class DrawPanel extends JPanel {
    public void paintComponent(Graphics g) {
        int red = (int)(Math.random()*256);
        int blue = (int)(Math.random()*256);
        int pink = (int)(Math.random()*256);
 
        g.setColor(new Color(red, blue, pink));
 
        Random rand = new Random();
        int ht = rand.nextInt(getHeight());
        int wd = rand.nextInt(getWidth());
 
        int x = rand.nextInt(getWidth()-wd);
        int y = rand.nextInt(getHeight()-ht);
 
        g.fillRect(x,y,wd,ht);
    }
    }
}