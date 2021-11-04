package MainPackage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.*;

public class AnimalMain extends JFrame {
	
	public AnimalMain() {
		
		setLayout(null);
		
		Button btn1 = new Button("고양이 선택");
		Button btn2 = new Button("강아지 선택");
		Button btn3 = new Button("토끼 선택");
		btn1.setBounds(100, 100, 100, 30);
		btn2.setBounds(200, 100, 100, 30);
		btn3.setBounds(300, 100, 100, 30);
		
		btn1.addActionListener(new ActionListener() {
			
		
		public void actionPerformed(ActionEvent e) {
			
			Cat cat = new Cat();
			cat.setVisible(true);
			dispose();
		}
	});
		
		btn2.addActionListener(new ActionListener() {
			
		@Override
		public void actionPerformed(ActionEvent e) {
			dispose();
				new Dog();
		}
	});
		btn3.addActionListener(new ActionListener() {
			
		@Override
		public void actionPerformed(ActionEvent e) {
			dispose();
				new Rabbit();
		}
	});
		add(btn1);
		add(btn2);
		add(btn3);
		
		setBounds(0, 0, 500, 400);
		setVisible(true);
		
	}

}
