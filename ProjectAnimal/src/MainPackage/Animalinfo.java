package MainPackage;

import java.util.Scanner;
/**
interface animals{
    public void eat(String bab);
    public void work(String move);
    public void sleep(String zzz);
}

class Cheeze implements animals{ //�����
	
    int text;
    Scanner sc = new Scanner(System.in);
    System.out.println("�׽�Ʈ�Դϴ�. 1�� �Է��Ͻÿ�. : " );
    text = sc.nextInt();
	
    public void eat(String bab) {
        System.out.println("����̴� "+bab+"�� �Ծ��."); }
    public void sleep(String zzz) {
        System.out.println("����̴� "+zzz+"�ڿ�."); }
    public void work(String move) {
        System.out.println("����̴� "+move+"�ɾ��."); }
    }
	
/**
class Monkey implements animals{ //������
    public void eat(String bab) {
        System.out.println("�����̴� "+bab+"�� �Ծ��.");
    }
    public void sleep(String zzz) {
        System.out.println("�����̴� "+zzz+"�ڿ�.");
    }
    public void work(String move) {
        System.out.println("�����̴� "+move+"�ɾ��.");
    }
}

class Chicken implements animals{ //��
    public void eat(String bab) {
        System.out.println("���� "+bab+"�� �Ծ��.");
    }
    public void sleep(String zzz) {
        System.out.println("���� "+zzz+"�ڿ�.");
    }
    public void work(String move) {
        System.out.println("���� "+move+"�ɾ��.");
    }
}


public class Animalinfo{

public static void main(String[] args) {
    Cheeze cheeze = new Cheeze();
 /**Monkey mo = new Monkey();
    Chicken ch = new Chicken();
    
    cheeze.eat("����");
 mo.eat("����");
    ch.eat("���"); 
    
    cheeze.work("�׹߷�");
 mo.work("�׹� �Ǵ� �ι߷�");
    ch.work("�ι߷�"); 
    
    cheeze.sleep("�������");
    mo.sleep("������");
    ch.sleep("����");
}

} **/