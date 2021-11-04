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
		setTitle("동물 스테이터스"); // 타이틀
		setSize(200,300); // 창 사이즈
		setVisible(true); // 보이게 하기
		setLocationRelativeTo(null); //프레임을 화면 가운데 배치
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창을 끄면 시스템 종료
		Container c = getContentPane(); // 패널 생성
		c.setLayout(new FlowLayout()); // 왼쪽에서 오른쪽으로 배치, 오른쪽 공간 없으면 아래로 자동 배치
		JLabel textLabel = new JLabel("동물 스테이터스"); // 창 이름 설정
		
		ImageIcon img = new ImageIcon("cat.jpg"); //이미지 (사이즈 200*132px)
		JLabel imageLabel = new JLabel(img); 
		
		JLabel Label_1 = new JLabel("<html>이름 : 치즈냥<br> 나이 : 2세 <br> 색상 : 브라운" ); // 기본정보

		
		JLabel Label_2 = new JLabel("<html>건강 : "+health + "<br>체력 : " + power + "<br>배고픔 : "+hungry); // 동물 스텟
		
		Button btn1 = new Button("결과보기"); // 결과창으로 넘어가는 버튼
		btn1.addActionListener(new ActionListener() { // 결과창으로 넘기기
			public void actionPerformed(ActionEvent e) {
				
				Result result = new Result();
				result.setVisible(true);
				dispose();
			}
		});
		
		
		/** 추가하는곳 **/
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

