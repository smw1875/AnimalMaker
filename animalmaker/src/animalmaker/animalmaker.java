package animalmaker;

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

	private ImageIcon onexitButtonImage = new ImageIcon(Main.class.getResource("../images/onexit.png"));
	private ImageIcon exitButtonImage = new ImageIcon(Main.class.getResource("../images/exit.png"));
	private ImageIcon onstartButtonImage = new ImageIcon(Main.class.getResource("../images/onstart.png"));
	private ImageIcon startButtonImage = new ImageIcon(Main.class.getResource("../images/start.png"));
	private ImageIcon onhelpButtonImage = new ImageIcon(Main.class.getResource("../images/onhelp.png"));
	private ImageIcon helpButtonImage = new ImageIcon(Main.class.getResource("../images/help.png"));
	
	private ImageIcon animal1 = new ImageIcon(Main.class.getResource("../images/animal1.png"));
	private ImageIcon animal2 = new ImageIcon(Main.class.getResource("../images/animal2.png"));
	private ImageIcon animal3 = new ImageIcon(Main.class.getResource("../images/animal3.png"));
	
	private Image animal = new ImageIcon(Main.class.getResource("../images/animal.png")).getImage();
	private JLabel menuBar = new JLabel(new ImageIcon(Main.class.getResource("../images/menuBar.png")));

	private JButton exitButton = new JButton(exitButtonImage);
	private JButton startButton = new JButton(startButtonImage);
	private JButton helpButton = new JButton(helpButtonImage);
	private JButton animal1Button = new JButton(animal1);
	private JButton animal2Button = new JButton(animal2);
	private JButton animal3Button = new JButton(animal3);
	
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
		animal1Button.setVisible(false);
		animal2Button.setVisible(false);
		animal3Button.setVisible(false);
		
		
		animal1Button.setBounds(100, 100, 330, 150);
		animal1Button.setBorderPainted(false);
		animal1Button.setContentAreaFilled(false);
		animal1Button.setFocusPainted(false);
		animal1Button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				animal1Button.setIcon(animal1); //동물 위에 마우스 올려둘시 변환될 이미지
				animal1Button.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				animal1Button.setIcon(animal1); // 기존 동물 이미지
				animal1Button.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				
				animal = new ImageIcon(Main.class.getResource("../images/animal1page.png")).getImage();	
				animal1Button.setVisible(false);
				animal2Button.setVisible(false);
				animal3Button.setVisible(false);
			}
		});
		add(animal1Button);
		
		
		animal2Button.setBounds(450, 100, 330, 150);
		animal2Button.setBorderPainted(false);
		animal2Button.setContentAreaFilled(false);
		animal2Button.setFocusPainted(false);
		animal2Button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				animal2Button.setIcon(animal2);
				animal2Button.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				animal2Button.setIcon(animal2);
				animal2Button.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				
				animal = new ImageIcon(Main.class.getResource("../images/animal1page.png")).getImage();	
				animal1Button.setVisible(false);
				animal2Button.setVisible(false);
				animal3Button.setVisible(false);
			}
		});
		add(animal2Button);
		
		animal3Button.setBounds(800, 100, 330, 150);
		animal3Button.setBorderPainted(false);
		animal3Button.setContentAreaFilled(false);
		animal3Button.setFocusPainted(false);
		animal3Button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				animal3Button.setIcon(animal3);
				animal3Button.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				animal3Button.setIcon(animal3);
				animal3Button.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				animal1Button.setVisible(false);
				animal2Button.setVisible(false);
				animal3Button.setVisible(false);
				animal = new ImageIcon(Main.class.getResource("../images/animal1page.png")).getImage();	
			}
		});
		add(animal3Button);
		
		
		exitButton.setBounds(800, 650, 125, 60);
		exitButton.setBorderPainted(false);
		exitButton.setContentAreaFilled(false);
		exitButton.setFocusPainted(false);
		exitButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				exitButton.setIcon(onexitButtonImage);
				exitButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				exitButton.setIcon(exitButtonImage);
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
				animal1Button.setVisible(true);
				animal2Button.setVisible(true);
				animal3Button.setVisible(true);
				
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
				animal1Button.setVisible(false);
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