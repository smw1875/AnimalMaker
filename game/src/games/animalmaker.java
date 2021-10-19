package games;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class animalmaker extends JFrame {

	private Image screenImage;
	private Graphics screenGraphic;

	private ImageIcon onexitImage = new ImageIcon(Main.class.getResource("../images/onexit.png"));
	private ImageIcon exitImage = new ImageIcon(Main.class.getResource("../images/exit.png"));
	private ImageIcon onstartButtonImage = new ImageIcon(Main.class.getResource("../images/onstart.png"));
	private ImageIcon startButtonImage = new ImageIcon(Main.class.getResource("../images/start.png"));
	private ImageIcon onhelpButtonImage = new ImageIcon(Main.class.getResource("../images/onhelp.png"));
	private ImageIcon helpButtonImage = new ImageIcon(Main.class.getResource("../images/help.png"));
	
	private Image animal = new ImageIcon(Main.class.getResource("../images/animal.png")).getImage();
	private JLabel menuBar = new JLabel(new ImageIcon(Main.class.getResource("../images/menuBar.png")));

	private JButton exitButton = new JButton(exitImage);
	private JButton startButton = new JButton(startButtonImage);
	private JButton helpButton = new JButton(helpButtonImage);
	
	private int mouseX, mouseY;
	
	public animalmaker() {
		setUndecorated(true);
		setTitle("Dynamic Beat");
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setBackground(new Color(0, 0, 0, 0));
		setLayout(null);

		exitButton.setBounds(900, 650, 125, 60);
		exitButton.setBorderPainted(false);
		exitButton.setContentAreaFilled(false);
		exitButton.setFocusPainted(false);
		exitButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				exitButton.setIcon(onexitImage);
				exitButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				exitButton.setIcon(exitImage);
				exitButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException ex) {
					ex.printStackTrace();
				}
				System.exit(0);
			}
		});
		add(exitButton);
		
		
		startButton.setBounds(200, 650, 125, 60);
		startButton.setBorderPainted(false);
		startButton.setContentAreaFilled(false);
		startButton.setFocusPainted(false);
		startButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				startButton.setIcon(onstartButtonImage);
				startButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				startButton.setIcon(startButtonImage);
				startButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				startButton.setVisible(false);
				helpButton.setVisible(false);
				animal = new ImageIcon(Main.class.getResource("../images/animalselect.jpg")).getImage();
			}
		});
		add(startButton);
		
		helpButton.setBounds(550, 650, 125, 60);
		helpButton.setBorderPainted(false);
		helpButton.setContentAreaFilled(false);
		helpButton.setFocusPainted(false);
		helpButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				helpButton.setIcon(onhelpButtonImage);
				helpButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				helpButton.setIcon(helpButtonImage);
				helpButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				//게임시작 이벤트
				startButton.setVisible(false);
				helpButton.setVisible(false);
				animal = new ImageIcon(Main.class.getResource("../images/helptext.png")).getImage();	
			}
		});
		add(helpButton);
		
		menuBar.setBounds(0, 0, 1280, 30);
		menuBar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				mouseX = e.getX();
				mouseY = e.getY();
			}
		});
		menuBar.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				int x = e.getXOnScreen();
				int y = e.getYOnScreen();
				setLocation(x - mouseX, y - mouseY);
			}
		});
		add(menuBar);

	}

	public void paint(Graphics g) {
		screenImage = createImage(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		screenGraphic = screenImage.getGraphics();
		screenDraw(screenGraphic);
		g.drawImage(screenImage, 0, 0, null);
	}

	public void screenDraw(Graphics g) {
		g.drawImage(animal, 0, 0, null);
		paintComponents(g);
		this.repaint();
	}
}
