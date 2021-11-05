package aniamlmaker;

import java.awt.Color;
import java.awt.Font;
import java.awt.Panel;
import java.util.Enumeration;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Screen4 {
    static int a = 0;
    static int b = 0;
   public static void main(String[] args) {
      
      Enumeration<Object> keys = UIManager.getDefaults().keys(); //��Ʈ ����
      while (keys.hasMoreElements()) {
         Object key = keys.nextElement();
         Object value = UIManager.get(key);
         if (value instanceof FontUIResource)
            UIManager.put(key, new FontUIResource("LG Smart UI Bold", Font.PLAIN, 24));
      }
      
      JFrame frm = new JFrame();
      frm.setSize(1200, 1080);
      frm.getContentPane().setLayout(null);
 
      
      Random random = new Random();
      random.setSeed(System.currentTimeMillis());
       
      a = random.nextInt(999)+1;
      b = random.nextInt(999)+1;
      
      JLabel lbl = new JLabel("***���� ��Ȳ***");
      lbl.setForeground(Color.RED);
      lbl.setFont(new Font("���� ���", Font.BOLD, 32));
      JLabel lbl1 = new JLabel("���� ��й�ȣ�� �ؾ���ȴ�");
      JLabel lbl2 = new JLabel("��Ʈ�� �̿��ؼ� ��й�ȣ�� ã��");
      JLabel lbl3 = new JLabel("��Ʈ : " + a + " + "+ b);
      lbl3.setForeground(Color.GRAY);
      lbl3.setFont(new Font("���� ���",Font.PLAIN, 24));
      
      lbl.setBounds(490, 80, 400, 100);
      lbl1.setBounds(480, 200, 300, 70);
      lbl2.setBounds(460, 300, 300, 40);
      lbl3.setBounds(530, 400, 300, 40);
      
      JPanel jPanel = new JPanel();
      jPanel.setSize(1200, 1080);
      jPanel.setBackground(Color.WHITE);
      
      JTextField textfield = new JTextField();
      textfield.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {
      		
      	}
      });
      textfield.setBounds(300, 450, 600, 80);
      
      
      JButton btn1 = new JButton("Ȯ��");
      btn1.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {
      		int num = Integer.parseInt(textfield.getText());
      		if(num == a+b) {
      			JOptionPane.showMessageDialog(null, "��й�ȣ�� ��ġ�մϴ�.");
      		}else {
      			JOptionPane.showMessageDialog(null, "��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
      		}
      	}
      });
      
      btn1.setBounds(500, 600, 220, 40);
      btn1.setBackground(Color.GRAY);
      
      
      frm.getContentPane().add(btn1);
      frm.getContentPane().add(lbl);
      frm.getContentPane().add(lbl1);
      frm.getContentPane().add(lbl2);
      frm.getContentPane().add(lbl3);
      frm.getContentPane().add(jPanel);
      frm.getContentPane().add(textfield);
      
      frm.setVisible(true);
   }

}