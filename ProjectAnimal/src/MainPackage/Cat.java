package MainPackage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.io.*;


public class Cat extends JFrame {
	
	int health;
	int power;
	int hungry;
	
	public Cat() {
		
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
		setTitle("���� �������ͽ�"); // Ÿ��Ʋ
		setSize(200,300); // â ������
		setVisible(true); // ���̰� �ϱ�
		setLocationRelativeTo(null); //�������� ȭ�� ��� ��ġ
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // â�� ���� �ý��� ����
		Container c = getContentPane(); // �г� ����
		c.setLayout(new FlowLayout()); // ���ʿ��� ���������� ��ġ, ������ ���� ������ �Ʒ��� �ڵ� ��ġ
		JLabel textLabel = new JLabel("���� �������ͽ�"); // â �̸� ����
		
		ImageIcon img = new ImageIcon("cat.jpg"); //�̹��� (������ 200*132px)
		JLabel imageLabel = new JLabel(img); 
		
		JLabel Label_1 = new JLabel("<html>�̸� : ġ���<br> ���� : 2�� <br> ���� : ����" ); // �⺻����

		
		JLabel Label_2 = new JLabel("<html>�ǰ� : "+health + "<br>ü�� : " + power + "<br>����� : "+hungry); // ���� ����
		
		Button btn1 = new Button("�������"); // ���â���� �Ѿ�� ��ư
		btn1.addActionListener(new ActionListener() { // ���â���� �ѱ��
			public void actionPerformed(ActionEvent e) {
				
				Result result = new Result();
				result.setVisible(true);
				dispose();
			}
		});
		
		
		/** �߰��ϴ°� **/
		c.add(textLabel);
 		c.add(imageLabel);
 		c.add(Label_1);
 		c.add(Label_2);
 		c.add(btn1);

	}
	public static void main(String [] args) {
		new Cat();
	}
}

