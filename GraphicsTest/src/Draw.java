import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public class Draw extends JPanel implements Runnable, KeyListener{
	private static final long serialVersionUID = 1L;
	int y = 100;
	public Draw() {
		Thread thread = new Thread();
		thread.start();
	}
	
	public void paintComponent(Graphics g2) {
		super.paintComponent(g2);
		Graphics2D g = (Graphics2D) g2;
		g.drawRect(100, y, 100, 100);
	}

	@Override
	public void run() {
		while(true) {
			repaint();
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		if(key == KeyEvent.VK_W) {
			System.out.println("PRESSING W");
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {		
	}
}
