package aniamlmaker;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Screen1 extends JPanel{
	
	private static final long serialVersionUID = 1L;
	BufferedImage background;
	public static int ho;
	
	String[] state = new String[] {"�����", "�ɽ���", "�ǰ���", "������", "����", "�����"};

	JLabel lblNewLabel = new JLabel();
	JLabel lblNewLabel_1 = new JLabel();
	JButton btnNewButton = new JButton("�� �ֱ�");
	JButton btnNewButton_1 = new JButton("�� ����");
	JButton btnNewButton_2 = new JButton("�ı��");
	JButton btnNewButton_3 = new JButton("���� ����");
	JButton btnNewButton_4 = new JButton("����ֱ�");
	JButton btnNewButton_5 = new JButton("�����ֱ�");
	
	@SuppressWarnings("unlikely-arg-type")
	Screen1() {
		setLayout(null);

		try {
			background = ImageIO.read(new File("images/back2.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String[] state = new String[] {"�����", "�ɽ���", "�ǰ���", "������", "����", "�����"};
		
		lblNewLabel.setText("������ ȣ����: " + ho);
		lblNewLabel.setBounds(30, 20, 200, 50);
	
		lblNewLabel_1.setText("������ ����: " + state[(int)(Math.random()*6)]);
		lblNewLabel_1.setBounds(30, 60, 200, 50);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
				while(state.equals("�����")) {
					if(e.getSource() == btnNewButton) {
						ho += 1;
					}else ho -= 1;
				}
				lblNewLabel.setText("������ ȣ����: " + ho);
				lblNewLabel_1.setText("������ ����: " + state[(int)(Math.random()*6)]);
			}
		});
		
		btnNewButton.setBounds(200, 550, 170, 80);
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(400, 550, 170, 80);
		
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(600, 550, 170, 80);
		
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setBounds(800, 550, 170, 80);
		
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_4.setBounds(400, 650, 170, 80);
		
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_5.setBounds(600, 650, 170, 80);
		
		btnNewButton.setBackground(Color.ORANGE); //��ư ����
		btnNewButton_1.setBackground(Color.ORANGE);
		btnNewButton_2.setBackground(Color.ORANGE);
		btnNewButton_3.setBackground(Color.ORANGE);
		btnNewButton_4.setBackground(Color.ORANGE);
		btnNewButton_5.setBackground(Color.ORANGE);
		
		ImageIcon bsImg = new ImageIcon("images/cat2.png");
		
		JLabel lblNewLabel_2 = new JLabel();
		
		lblNewLabel_2.setBounds(400, 100, 400, 500);
		lblNewLabel_2.setIcon(bsImg);
		
		setLayout(null);
		add(lblNewLabel);
		add(lblNewLabel_1);
		add(btnNewButton);
		add(btnNewButton_1);
		add(btnNewButton_2);
		add(btnNewButton_3);
		add(btnNewButton_4);
		add(btnNewButton_5);
		add(lblNewLabel_2);
	}
	public void paintComponent(Graphics g) {
		g.drawImage(background, 0, 0, 1200, 1080, null);
	}

}
