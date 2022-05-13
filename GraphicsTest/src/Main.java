import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Main extends JFrame{
	private static final long serialVersionUID = 1L;
	private static Main window;
	private static Draw draw;
	private static final int WIDTH = 800;
	private static final int HEIGHT = 800;
	
	public Main() {
		draw = new Draw();
		addKeyListener(draw);
	}
	
	public static void main(String[] args) {
		window = new Main();
		Container ctn = window.getContentPane();
		ctn.setLayout(new BorderLayout());
		ctn.add(Main.draw,BorderLayout.CENTER);
		
		window.pack();
		window.setSize(WIDTH,HEIGHT);
		
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		window.setLocation(dim.width/2-window.getSize().width/2, dim.height/2-window.getSize().height/2);
				
		window.setTitle("GARBLE");
		window.setDefaultCloseOperation(EXIT_ON_CLOSE);
		window.setResizable(true);
		window.setVisible(true);
		window.setAlwaysOnTop(true);
		window.setFocusable(true);
	}
}
