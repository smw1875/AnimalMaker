package MainPackage;

import java.util.Scanner;
/**
interface animals{
    public void eat(String bab);
    public void work(String move);
    public void sleep(String zzz);
}

class Cheeze implements animals{ //고양이
	
    int text;
    Scanner sc = new Scanner(System.in);
    System.out.println("테스트입니다. 1을 입력하시오. : " );
    text = sc.nextInt();
	
    public void eat(String bab) {
        System.out.println("고양이는 "+bab+"을 먹어요."); }
    public void sleep(String zzz) {
        System.out.println("고양이는 "+zzz+"자요."); }
    public void work(String move) {
        System.out.println("고양이는 "+move+"걸어요."); }
    }
	
/**
class Monkey implements animals{ //원숭이
    public void eat(String bab) {
        System.out.println("원숭이는 "+bab+"을 먹어요.");
    }
    public void sleep(String zzz) {
        System.out.println("원숭이는 "+zzz+"자요.");
    }
    public void work(String move) {
        System.out.println("원숭이는 "+move+"걸어요.");
    }
}

class Chicken implements animals{ //닭
    public void eat(String bab) {
        System.out.println("닭은 "+bab+"을 먹어요.");
    }
    public void sleep(String zzz) {
        System.out.println("닭은 "+zzz+"자요.");
    }
    public void work(String move) {
        System.out.println("닭은 "+move+"걸어요.");
    }
}


public class Animalinfo{

public static void main(String[] args) {
    Cheeze cheeze = new Cheeze();
 /**Monkey mo = new Monkey();
    Chicken ch = new Chicken();
    
    cheeze.eat("생선");
 mo.eat("과일");
    ch.eat("사료"); 
    
    cheeze.work("네발로");
 mo.work("네발 또는 두발로");
    ch.work("두발로"); 
    
    cheeze.sleep("엎드려서");
    mo.sleep("누워서");
    ch.sleep("서서");
}

} **/