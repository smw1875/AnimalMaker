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
      
      Enumeration<Object> keys = UIManager.getDefaults().keys(); //폰트 통일
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
      
      JLabel lbl = new JLabel("***돌발 상황***");
      lbl.setForeground(Color.RED);
      lbl.setFont(new Font("맑은 고딕", Font.BOLD, 32));
      JLabel lbl1 = new JLabel("집의 비밀번호를 잊어버렸다");
      JLabel lbl2 = new JLabel("힌트를 이용해서 비밀번호를 찾자");
      JLabel lbl3 = new JLabel("힌트 : " + a + " + "+ b);
      lbl3.setForeground(Color.GRAY);
      lbl3.setFont(new Font("맑은 고딕",Font.PLAIN, 24));
      
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
      
      
      JButton btn1 = new JButton("확인");
      btn1.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {
      		int num = Integer.parseInt(textfield.getText());
      		if(num == a+b) {
      			JOptionPane.showMessageDialog(null, "비밀번호가 일치합니다.");
      		}else {
      			JOptionPane.showMessageDialog(null, "비밀번호가 일치하지 않습니다.");
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