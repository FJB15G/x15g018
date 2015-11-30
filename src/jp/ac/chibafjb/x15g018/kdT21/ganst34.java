package jp.ac.chibafjb.x15g018.kdT21;

import java.util.Scanner;

public class ganst34 {

	public static void main(String[] args) {
	Scanner sin = new Scanner(System.in);
	System.out.println("ハンバーガーの個数　　→　");
	int s1 = sin.nextInt();
	System.out.println("フライドポテトの個数　→　");
	int s2 = sin.nextInt();
	int a = 100 * s1;
	int b = 180 * s2;
	int c= a + b;
	float d= c / 0.08f;
	float e = c + d;
	System.out.println("ハンバーガーの代金　　＝　"+a);
	System.out.println("フライドポテトの代金　＝　"+b);
	System.out.println("小計　　　　　　　　　＝　"+c);
	System.out.println("");
	System.out.println("消費税　　　　　　　　＝　"+(int)(d));
	System.out.println("合計金額　　　　　　　＝　"+(int)(e));
	System.out.println("");
	System.out.println("受取金額　　　　　　　→　");
	float s3 = sin.nextFloat();
	float f = s3 - e;
	System.out.println("つり銭　　　　　　　　＝　"+(int)(f));
	sin.close();

	}

}
