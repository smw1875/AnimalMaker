package animalmaker;

import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.util.Enumeration;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;


public class main extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JFrame frame;
	private Image screenImage;
	Screen1 screen1 = new Screen1();
	Screen2 screen2 = new Screen2();
	Screen3 screen3 = new Screen3();
	Screen4 screen4 = new Screen4();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		Enumeration<Object> keys = UIManager.getDefaults().keys(); //폰트 통일
		while (keys.hasMoreElements()) {
			Object key = keys.nextElement();
			Object value = UIManager.get(key);
			if (value instanceof FontUIResource)
				UIManager.put(key, new FontUIResource("LG Smart UI Bold", Font.PLAIN, 20));
		}
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main window = new main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public main() {
		initialize();
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setTitle("Animal Maker");
		setSize(1200, 1080);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//add(screen1);
		add(screen2);
		//add(screen3);
		setVisible(true);
	}
	
	
}

