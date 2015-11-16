package jp.ac.chibafjb.x15g018.kd052;

import java.util.Scanner;

public class ganst29 {

	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		System.out.println("半径r --> ");
		float r = sin.nextFloat();
		sin.close();
		Float a;
		Float b;
		Float π = 3.14f;
		a = 2 * π * r;
		b = π * r * r;
		System.out.println("円周 = "+a);
		System.out.println("面積 = "+b);

	}

}
