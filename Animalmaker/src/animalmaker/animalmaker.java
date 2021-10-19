package animalmaker;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class animalmaker extends JFrame {

	
private Image screenImage;			//������۸��� ���� ��üȭ�鿡 ���� �̹����� ��°�
private Graphics screenGraphic;		//������۸��� ���� ��üȭ�鿡 ���� �̹����� ��°�

private Image animal; 				// �̹��� ��� ��ü

public animalmaker() {				//���� ���� �̸�

	setTitle("animalmaker");
	setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT); 	//ȭ��
	setResizable(false); 								//ȭ��â ũ������
	setLocationRelativeTo(null);						//��� ����ϱ�
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		//����â ����� ���α׷� ����
	setVisible(true);//ȭ��â ���
	
	animal = new ImageIcon(Main.class.getResource("../images/animals.png")).getImage();		//�̹��� ��������
	
}

public void paint(Graphics g) { 
	screenImage = createImage(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);	//���� ���̸�ŭ �̹����� ����� ��ũ�� �̹����� �־���
	screenGraphic = screenImage.getGraphics();							//�׷��� ��ü ������
	screenDraw(screenGraphic);											//�׸��� �׷���
	g.drawImage(screenImage,  0, 0 , null );							//����â�� ��ũ�� �̹��� ǥ��
}
	
public void screenDraw(Graphics g) { 	// �׸��� �׷���
	g.drawImage(animal, 0, 0, null);	// animals �� ��ũ�� �̹����� �׸��� �ֵ��� �� 
	this.repaint();						// ȭ��ũ�⸸ŭ ȭ���� �׷��ִ� �Լ�
	
}

}
