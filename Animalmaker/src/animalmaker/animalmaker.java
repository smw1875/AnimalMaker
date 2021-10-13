package animalmaker;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class animalmaker extends JFrame {

	
private Image screenImage;			//더블버퍼링을 위한 전체화면에 대한 이미지를 담는것
private Graphics screenGraphic;		//더블버퍼링을 위한 전체화면에 대한 이미지를 담는것

private Image animal; 				// 이미지 담는 객체

public animalmaker() {				//만들 게임 이름

	setTitle("animalmaker");
	setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT); 	//화면
	setResizable(false); 								//화면창 크기조절
	setLocationRelativeTo(null);						//가운데 출력하기
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		//게임창 종료시 프로그램 종료
	setVisible(true);//화면창 출력
	
	animal = new ImageIcon(Main.class.getResource("../images/animals.png")).getImage();		//이미지 가져오기
	
}

public void paint(Graphics g) { 
	screenImage = createImage(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);	//높이 넓이만큼 이미지를 만들고 스크린 이미지에 넣어줌
	screenGraphic = screenImage.getGraphics();							//그래픽 객체 얻어오기
	screenDraw(screenGraphic);											//그림을 그려줌
	g.drawImage(screenImage,  0, 0 , null );							//게임창에 스크린 이미지 표현
}
	
public void screenDraw(Graphics g) { 	// 그림을 그려줌
	g.drawImage(animal, 0, 0, null);	// animals 를 스크린 이미지에 그릴수 있도록 함 
	this.repaint();						// 화면크기만큼 화면을 그려주는 함수
	
}

}
