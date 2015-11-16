package jp.ac.chibafjb.x15g018.kd051;

import java.util.Scanner;

public class ganst28 {

	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		System.out.println("aの入力 --> ");
		float a = sin.nextFloat();
		System.out.println("bの入力 --> ");
		float b = sin.nextFloat();
		sin.close();
		float c;
		float d;
		float e;
		float f;
		c = a + b;
		d = a - b;
		e = a * b;
		f = a / b;
		System.out.println(a+" + "+b+" = "+c);
		System.out.println(a+" - "+b+" = "+d);
		System.out.println(a+" * "+b+" = "+e);
		System.out.println(a+" / "+b+" = "+f);
	}

}
