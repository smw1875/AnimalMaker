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
		
		setTitle("동물 스테이터스");
		setSize(200,300);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JLabel textLabel = new JLabel("동물 스테이터스");
		textLabel.setBounds(0, 0, 200, 50);
		
		ImageIcon img = new ImageIcon("cat.jpg");
		JLabel imageLabel = new JLabel(img); 
		
		JLabel Label_1 = new JLabel("<html>이름 : 치즈냥<br> 나이 : 2세 <br> 색상 : 브라운" );

		
		JLabel Label_2 = new JLabel("<html>건강 : "+health + "<br>체력 : " + power + "<br>배고픔 : "+hungry);
		
		Button btn1 = new Button("결과보기");
		
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

