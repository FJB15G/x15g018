package jp.ac.chibafjb.x15g018.kd042;

import java.util.Scanner;

public class ganst25 {

	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		System.out.println("整数aの入力 --> ");
		int a = sin.nextInt();
		System.out.println("整数bの入力 --> ");
		int b = sin.nextInt();
		sin.close();
		int c;
		int d;
		int e;
		int f;
		c = a + b;
		d = a - b;
		e = a * b;
		f = a / b;
		System.out.println(a+"+"+b+"="+c);
		System.out.println(a+"-"+b+"="+d);
		System.out.println(a+"*"+b+"="+e);
		System.out.println(a+"+"+b+"="+f);

	}

}
