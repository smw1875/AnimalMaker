package aniamlmaker;

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
	private ImageIcon onsettingButtonImage = new ImageIcon(Main.class.getResource("../images/onsetting.png"));
	private ImageIcon settingButtonImage = new ImageIcon(Main.class.getResource("../images/setting.png"));
	private ImageIcon backButtonImage = new ImageIcon(Main.class.getResource("../images/back.png"));
	private ImageIcon onbackButtonImage = new ImageIcon(Main.class.getResource("../images/onback.png"));
	
	private ImageIcon rabbit = new ImageIcon(Main.class.getResource("../images/rabbit.png"));
	private ImageIcon cat = new ImageIcon(Main.class.getResource("../images/cat.png"));
	private ImageIcon raccoon = new ImageIcon(Main.class.getResource("../images/raccoon.png"));
	
	private Image animal = new ImageIcon(Main.class.getResource("../images/animal.png")).getImage();
	private JLabel menuBar = new JLabel(new ImageIcon(Main.class.getResource("../images/menuBar.png")));

	private JButton exitButton = new JButton(exitButtonImage);
	private JButton startButton = new JButton(startButtonImage);
	private JButton settingButton = new JButton(settingButtonImage);
	private JButton backButton = new JButton(backButtonImage);

	private JButton rabbitButton = new JButton(rabbit);
	private JButton catButton = new JButton(cat);
	private JButton raccoonButton = new JButton(raccoon);
	
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
		rabbitButton.setVisible(false);
		catButton.setVisible(false);
		raccoonButton.setVisible(false);
		backButton.setVisible(false);
		
		
		backButton.setBounds(500, 630, 180, 80);
		backButton.setBorderPainted(false);
		backButton.setContentAreaFilled(false);
		backButton.setFocusPainted(false);
		backButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				backButton.setIcon(onbackButtonImage); 
				backButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				backButton.setIcon(backButtonImage); 
				backButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				animal = new ImageIcon(Main.class.getResource("../images/animal.png")).getImage();	
				backButton.setVisible(false);
				startButton.setVisible(true);
				settingButton.setVisible(true);
			}
		});
		add(backButton);
		
		rabbitButton.setBounds(100, 100, 300, 250);
		rabbitButton.setBorderPainted(false);
		rabbitButton.setContentAreaFilled(false);
		rabbitButton.setFocusPainted(false);
		rabbitButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				rabbitButton.setIcon(rabbit); //동물 위에 마우스 올려둘시 변환될 이미지
				rabbitButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				rabbitButton.setIcon(rabbit); // 기존 동물 이미지
				rabbitButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				animal = new ImageIcon(Main.class.getResource("../images/animal1page.png")).getImage();	
				rabbitButton.setVisible(false);
				catButton.setVisible(false);
				raccoonButton.setVisible(false);
			}
		});
		add(rabbitButton);
			
		catButton.setBounds(450, 100, 300, 270);
		catButton.setBorderPainted(false);
		catButton.setContentAreaFilled(false);
		catButton.setFocusPainted(false);
		catButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				catButton.setIcon(cat);
				catButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				catButton.setIcon(cat);
				catButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
			
				
				animal = new ImageIcon(Main.class.getResource("../images/animal1page.png")).getImage();	
				rabbitButton.setVisible(false);
				catButton.setVisible(false);
				raccoonButton.setVisible(false);
			}
		});
		add(catButton);
		
		raccoonButton.setBounds(800, 100, 300, 250);
		raccoonButton.setBorderPainted(false);
		raccoonButton.setContentAreaFilled(false);
		raccoonButton.setFocusPainted(false);
		raccoonButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				raccoonButton.setIcon(raccoon);
				raccoonButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				raccoonButton.setIcon(raccoon);
				raccoonButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				rabbitButton.setVisible(false);
				catButton.setVisible(false);
				raccoonButton.setVisible(false);
				
				animal = new ImageIcon(Main.class.getResource("../images/animal1page.png")).getImage();	
			}
		});
		add(raccoonButton);
		
		exitButton.setBounds(800, 630, 180, 80);
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
		
		startButton.setBounds(200, 630, 180, 80);
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
				settingButton.setVisible(false);
				rabbitButton.setVisible(true);
				catButton.setVisible(true);
				raccoonButton.setVisible(true);
				animal = new ImageIcon(Main.class.getResource("../images/animalselect.jpg")).getImage();
			}
		});
		add(startButton);
		
		settingButton.setBounds(500, 630, 190, 80);
		settingButton.setBorderPainted(false);
		settingButton.setContentAreaFilled(false);
		settingButton.setFocusPainted(false);
		settingButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				settingButton.setIcon(onsettingButtonImage);
				settingButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				settingButton.setIcon(settingButtonImage);
				settingButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				//게임시작 이벤트
				startButton.setVisible(false);
				settingButton.setVisible(false);
				rabbitButton.setVisible(false);
				backButton.setVisible(true);
				animal = new ImageIcon(Main.class.getResource("../images/settingtext.png")).getImage();	
			}
		});
		add(settingButton);
		
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