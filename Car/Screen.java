import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Screen extends Canvas implements KeyListener {
	
	Car [] car = new Car[2]; //클래스 배열 생성
	
	private static final long serialVersionUID = 1L;
	
	public Screen() {
		addKeyListener(this);
		for(int i = 0; i < 2; i++) {
			car[i] = new Car(i*50,0); // 클래스 배열 초기화 및 위치 값 생성
		}
	}
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		g.drawImage(car[0].image, car[0].x, car[0].y, this); //1번 차 그리기
		g.drawImage(car[1].image, car[1].x, car[1].y, this); //2번 차 그리기
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		int gap = 10;
		switch(e.getKeyCode())
		{
		case KeyEvent.VK_UP:
			car[0].y -= gap;
			car[1].y -= gap;
			break;
		case KeyEvent.VK_DOWN:
			car[0].y += gap;
			car[1].y += gap;
			break;
		case KeyEvent.VK_LEFT:
			car[0].x -= gap;
			car[1].x -= gap;
			break;
		case KeyEvent.VK_RIGHT:
			car[0].x += gap;
			car[1].x += gap;
			break;
		}
		
		repaint();
	}

}
