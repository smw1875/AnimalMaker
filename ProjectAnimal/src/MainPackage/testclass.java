package MainPackage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.io.*;


public class testclass extends JFrame {
	
	int health;
	int power;
	int hungry;
	
	public testclass() {
		
		health = 10;
		power = 10;
		hungry = 0;
		
		setTitle("���� �������ͽ�");
		setSize(200,300);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JLabel textLabel = new JLabel("���� �������ͽ�");
		textLabel.setBounds(0, 0, 200, 50);
		
		ImageIcon img = new ImageIcon("cat.jpg");
		JLabel imageLabel = new JLabel(img); 
		
		JLabel Label_1 = new JLabel("<html>�̸� : ġ���<br> ���� : 2�� <br> ���� : ����" );

		
		JLabel Label_2 = new JLabel("<html>�ǰ� : "+health + "<br>ü�� : " + power + "<br>����� : "+hungry);
		
		Button btn1 = new Button("�������");
		
		c.add(textLabel);
 		c.add(imageLabel);
 		c.add(Label_1);
 		c.add(Label_2);
 		c.add(btn1);

	}
	public static void main(String [] args) {
		new testclass();
	}
}

