package MainPackage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.io.*;

public class Result extends JFrame {
	
	int health;
	int power;
	int hungry;
	
	public Result() {
		
		health = 10;
		power = 10;
		hungry = 0;
		
		if(health == 10) {
		health = health + 1;
		}
		
		if(power == 10) {
			power = power +1;
		}
		
		if(hungry == 0) {
			hungry = hungry + 1;
		}
			
			setTitle("���� �������ͽ�");
			setSize(200,300);
			setVisible(true);
			setLocationRelativeTo(null);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			Container c = getContentPane();
			c.setLayout(new FlowLayout());
			JLabel textLabel = new JLabel("���â");
			
			ImageIcon img = new ImageIcon("cat.jpg");
			JLabel imageLabel = new JLabel(img); 
			
			JLabel Label_1 = new JLabel("<html>�ǰ� : "+health + "<br>ü�� : " + power + "<br>����� : "+hungry);

			
			JLabel Label_2 = new JLabel("");
			Button btn1 = new Button("�ǵ��ư���");
			btn1.addActionListener(new ActionListener() {
				
				
				public void actionPerformed(ActionEvent e) {
					
					AnimalMain animalmain = new AnimalMain();
					animalmain.setVisible(true);
					dispose();
				}
			});
			
			c.add(textLabel);
	 		c.add(imageLabel);
	 		c.add(Label_1);
	 		c.add(Label_2);
	 		c.add(btn1);

		}
		public static void main(String [] args) {
			new Result();
		}
	}
